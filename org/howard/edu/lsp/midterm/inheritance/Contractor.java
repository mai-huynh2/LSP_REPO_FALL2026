package org.howard.edu.lsp.midterm.inheritance;

/**
 * Represents a contractor paid a 15 percent premium on every hour.
 *
 * @author Ngoc-Mai Huynh
 */
public class Contractor extends Employee {
    /**
     * Creates a contractor.
     * @param hoursWorked the nonnegative hours worked
     * @param hourlyRate the nonnegative hourly rate
     */
    public Contractor(double hoursWorked, double hourlyRate) {
        super(hoursWorked, hourlyRate);
    }

    /**
     * Calculates hourly pay with a 15 percent premium.
     * @return total pay
     */
    @Override
    public double calculatePay() {
        return getHoursWorked() * getHourlyRate() * 1.15;
    }
}
