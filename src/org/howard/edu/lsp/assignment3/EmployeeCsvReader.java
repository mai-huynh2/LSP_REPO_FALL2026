package org.howard.edu.lsp.assignment3;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EmployeeCsvReader {
    private final Path inputPath;
    private int rowsRead;
    private int rowsSkipped;

    public EmployeeCsvReader(Path inputPath) {
        this.inputPath = inputPath;
    }

    public List<Employee> read() throws IOException {
        rowsRead = 0;
        rowsSkipped = 0;
        List<Employee> employees = new ArrayList<>();
        List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);

        for (int i = 1; i < lines.size(); i++) {
            rowsRead++;
            Employee employee = parseEmployee(lines.get(i));

            if (employee == null) {
                rowsSkipped++;
            } else {
                employees.add(employee);
            }
        }

        return employees;
    }

    private Employee parseEmployee(String row) {
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
        fields[1] = fields[1].toUpperCase(Locale.ROOT);

        try {
            int employeeId = Integer.parseInt(fields[0]);
            BigDecimal hoursWorked = new BigDecimal(fields[3]);
            BigDecimal hourlyRate = new BigDecimal(fields[4]);
            return new Employee(employeeId, fields[1], fields[2], hoursWorked, hourlyRate);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public int getRowsRead() {
        return rowsRead;
    }

    public int getRowsSkipped() {
        return rowsSkipped;
    }
}
