package org.howard.edu.lsp.assignment3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {
    private final int employeeId;
    private final String name;
    private final String department;
    private final BigDecimal hoursWorked;
    private final BigDecimal hourlyRate;
    private final BigDecimal grossPay;

    public Employee(int employeeId, String name, String department,
                    BigDecimal hoursWorked, BigDecimal hourlyRate) {
        if (hoursWorked.signum() < 0 || hourlyRate.signum() < 0) {
            throw new IllegalArgumentException("Hours and rate cannot be negative.");
        }

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.grossPay = calculateGrossPay();
    }

    private BigDecimal calculateGrossPay() {
        BigDecimal regularHourLimit = new BigDecimal("40");
        BigDecimal pay;

        if (hoursWorked.compareTo(regularHourLimit) <= 0) {
            pay = hoursWorked.multiply(hourlyRate);
        } else {
            BigDecimal regularPay = regularHourLimit.multiply(hourlyRate);
            BigDecimal overtimeHours = hoursWorked.subtract(regularHourLimit);
            BigDecimal overtimePay = overtimeHours.multiply(hourlyRate)
                    .multiply(new BigDecimal("1.5"));
            pay = regularPay.add(overtimePay);
        }

        if (department.equals("IT")) {
            pay = pay.multiply(new BigDecimal("1.05"));
        }

        // Round after overtime and the IT bonus.
        return pay.setScale(2, RoundingMode.HALF_UP);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public BigDecimal getHoursWorked() {
        return hoursWorked;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public BigDecimal getGrossPay() {
        return grossPay;
    }

    public String getPayLevel() {
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

    public String getEmploymentStatus() {
        return hoursWorked.compareTo(new BigDecimal("30")) < 0
                ? "Part-Time" : "Full-Time";
    }
}
