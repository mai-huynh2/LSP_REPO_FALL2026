package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ETLPipeline {
    private static final String INPUT_FILE = "data/employees.csv";
    private static final String OUTPUT_FILE = "data/transformed_employees.csv";
    private static final String OUTPUT_HEADER =
            "EmployeeID,Name,Department,HoursWorked,HourlyRate,GrossPay,PayLevel,EmploymentStatus";

    public static void main(String[] args) {
        try {
            List<String> inputRows = extract(Paths.get(INPUT_FILE));
            List<String> outputRows = new ArrayList<>();
            int rowsSkipped = 0;

            for (String row : inputRows) {
                String transformedRow = transform(row);

                if (transformedRow == null) {
                    rowsSkipped++;
                } else {
                    outputRows.add(transformedRow);
                }
            }

            load(Paths.get(OUTPUT_FILE), outputRows);

            System.out.println("Rows read: " + inputRows.size());
            System.out.println("Rows transformed: " + outputRows.size());
            System.out.println("Rows skipped: " + rowsSkipped);
            System.out.println("Output file: " + OUTPUT_FILE);
        } catch (IOException e) {
            System.err.println("Unable to complete the ETL pipeline: " + e.getMessage());
        }
    }

    private static List<String> extract(Path inputPath) throws IOException {
        List<String> rows = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        if (!rows.isEmpty()) {
            rows.remove(0);
        }

        return rows;
    }

    private static String transform(String row) {
        if (row.trim().isEmpty()) {
            return null;
        }

        // Preserve empty fields, including the last one.
        String[] fields = row.split(",", -1);
        if (fields.length != 5) {
            return null;
        }

        for (int i = 0; i < fields.length; i++) {
            fields[i] = fields[i].trim();
        }

        String name = fields[1].toUpperCase(Locale.ROOT);
        String department = fields[2];
        int employeeId;
        BigDecimal hoursWorked;
        BigDecimal hourlyRate;

        try {
            employeeId = Integer.parseInt(fields[0]);
            hoursWorked = new BigDecimal(fields[3]);
            hourlyRate = new BigDecimal(fields[4]);
        } catch (NumberFormatException e) {
            return null;
        }

        if (hoursWorked.signum() < 0 || hourlyRate.signum() < 0) {
            return null;
        }

        BigDecimal regularHourLimit = new BigDecimal("40");
        BigDecimal grossPay;

        if (hoursWorked.compareTo(regularHourLimit) <= 0) {
            grossPay = hoursWorked.multiply(hourlyRate);
        } else {
            BigDecimal regularPay = regularHourLimit.multiply(hourlyRate);
            BigDecimal overtimeHours = hoursWorked.subtract(regularHourLimit);
            BigDecimal overtimePay = overtimeHours.multiply(hourlyRate)
                    .multiply(new BigDecimal("1.5"));
            grossPay = regularPay.add(overtimePay);
        }

        if (department.equals("IT")) {
            grossPay = grossPay.multiply(new BigDecimal("1.05"));
        }

        // Round after overtime and the IT bonus.
        grossPay = grossPay.setScale(2, RoundingMode.HALF_UP);
        String payLevel = determinePayLevel(grossPay);
        String employmentStatus = hoursWorked.compareTo(new BigDecimal("30")) < 0
                ? "Part-Time" : "Full-Time";

        return employeeId + "," + name + "," + department + ","
                + formatDecimal(hoursWorked) + "," + formatDecimal(hourlyRate) + ","
                + formatDecimal(grossPay) + "," + payLevel + "," + employmentStatus;
    }

    private static String determinePayLevel(BigDecimal grossPay) {
        if (grossPay.compareTo(new BigDecimal("500")) < 0) {
            return "Low";
        } else if (grossPay.compareTo(new BigDecimal("1000")) < 0) {
            return "Standard";
        } else if (grossPay.compareTo(new BigDecimal("2000")) < 0) {
            return "High";
        } else {
            return "Executive";
        }
    }

    private static String formatDecimal(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }

    private static void load(Path outputPath, List<String> outputRows) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add(OUTPUT_HEADER);
        lines.addAll(outputRows);
        Files.write(outputPath, lines, StandardCharsets.UTF_8);
    }
}
