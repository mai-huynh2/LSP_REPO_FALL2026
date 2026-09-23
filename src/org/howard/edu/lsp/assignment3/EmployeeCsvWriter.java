package org.howard.edu.lsp.assignment3;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCsvWriter {
    private static final String HEADER =
            "EmployeeID,Name,Department,HoursWorked,HourlyRate,GrossPay,PayLevel,EmploymentStatus";
    private final Path outputPath;

    public EmployeeCsvWriter(Path outputPath) {
        this.outputPath = outputPath;
    }

    public void write(List<Employee> employees) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add(HEADER);

        for (Employee employee : employees) {
            lines.add(employee.getEmployeeId() + "," + employee.getName() + ","
                    + employee.getDepartment() + "," + format(employee.getHoursWorked()) + ","
                    + format(employee.getHourlyRate()) + "," + format(employee.getGrossPay()) + ","
                    + employee.getPayLevel() + "," + employee.getEmploymentStatus());
        }

        Files.write(outputPath, lines, StandardCharsets.UTF_8);
    }

    private String format(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }
}
