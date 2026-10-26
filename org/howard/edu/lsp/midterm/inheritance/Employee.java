package org.howard.edu.lsp.midterm.inheritance;

/**
 * Provides shared employee pay data and a polymorphic pay operation.
 *
 * @author Ngoc-Mai Huynh
 */
public abstract class Employee {
    private final double hoursWorked;
    private final double hourlyRate;

    /**
     * Initializes the data shared by employee types.
     * @param hoursWorked the nonnegative number of hours worked
     * @param hourlyRate the nonnegative hourly rate
     */
    protected Employee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    /**
     * Provides hours worked to subclasses.
     * @return hours worked
     */
    protected double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Provides the hourly rate to subclasses.
     * @return the hourly rate
     */
    protected double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Calculates pay according to the employee's type.
     * @return the calculated pay
     */
    public abstract double calculatePay();
}
