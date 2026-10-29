package org.howard.edu.lsp.midterm.inheritance;

/**
 * Represents an employee who receives overtime pay beyond 40 hours.
 *
 * @author Ngoc-Mai Huynh
 */
public class FullTimeEmployee extends Employee {
    /**
     * Creates a full-time employee.
     * @param hoursWorked the nonnegative weekly hours worked
     * @param hourlyRate the nonnegative hourly rate
     */
    public FullTimeEmployee(double hoursWorked, double hourlyRate) {
        super(hoursWorked, hourlyRate);
    }

    /**
     * Calculates regular pay plus time-and-a-half for hours beyond 40.
     * @return total weekly pay
     */
    @Override
    public double calculatePay() {
        double regularHours = Math.min(getHoursWorked(), 40.0);
        double overtimeHours = Math.max(getHoursWorked() - 40.0, 0.0);
        return regularHours * getHourlyRate()
                + overtimeHours * getHourlyRate() * 1.5;
    }
}
