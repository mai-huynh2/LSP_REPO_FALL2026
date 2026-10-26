package org.howard.edu.lsp.midterm.inheritance;

/**
 * Represents an employee paid the straight hourly rate for all hours.
 *
 * @author Ngoc-Mai Huynh
 */
public class PartTimeEmployee extends Employee {
    /**
     * Creates a part-time employee.
     * @param hoursWorked the nonnegative hours worked
     * @param hourlyRate the nonnegative hourly rate
     */
    public PartTimeEmployee(double hoursWorked, double hourlyRate) {
        super(hoursWorked, hourlyRate);
    }

    /**
     * Calculates straight hourly pay without overtime.
     * @return total pay
     */
    @Override
    public double calculatePay() {
        return getHoursWorked() * getHourlyRate();
    }
}
