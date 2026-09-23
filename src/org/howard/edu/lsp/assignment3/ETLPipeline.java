package org.howard.edu.lsp.assignment3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class ETLPipeline {
    private static final String INPUT_FILE = "data/employees.csv";
    private static final String OUTPUT_FILE = "data/transformed_employees.csv";

    private final EmployeeCsvReader reader = new EmployeeCsvReader(Paths.get(INPUT_FILE));
    private final EmployeeCsvWriter writer = new EmployeeCsvWriter(Paths.get(OUTPUT_FILE));

    public static void main(String[] args) {
        try {
            new ETLPipeline().run();
        } catch (IOException e) {
            System.err.println("Unable to complete the ETL pipeline: " + e.getMessage());
        }
    }

    public void run() throws IOException {
        List<Employee> employees = reader.read();
        writer.write(employees);

        System.out.println("Rows read: " + reader.getRowsRead());
        System.out.println("Rows transformed: " + employees.size());
        System.out.println("Rows skipped: " + reader.getRowsSkipped());
        System.out.println("Output file: " + OUTPUT_FILE);
    }
}
