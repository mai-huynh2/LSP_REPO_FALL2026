# Assignment 3: Object-Oriented Refactoring

Ngoc-Mai Huynh

## 1. How was your Assignment 2 solution organized?

My Assignment 2 solution used a single class, `ETLPipeline`, with static methods for reading, transforming, and writing data. The transform method handled several responsibilities, including validating rows, calculating pay, assigning classifications, and formatting output rows. Employee data was stored in strings and local variables rather than in employee objects.

## 2. What design changes did you make for Assignment 3?

I split the program into four classes and created an `Employee` object for each valid input row. This separates file processing from employee data and payroll rules. I also made the employee fields private and final, with getters and no setters. The private fields control access to the data, while the final fields prevent those values from being reassigned after construction.

## 3. What classes or abstractions did you introduce and why?

| Class               | Purpose                                                                                                   |
| ------------------- | --------------------------------------------------------------------------------------------------------- |
| `Employee`          | Keeps each employee’s data together with the methods that calculate pay and determine classifications.    |
| `EmployeeCsvReader` | Reads, cleans, and parses input rows, creates `Employee` objects, and tracks rows read and skipped.       |
| `EmployeeCsvWriter` | Formats employee results as CSV and writes the header and output rows.                                    |
| `ETLPipeline`       | Provides the entry point, coordinates the reader and writer, handles file errors, and prints the summary. |

I chose these classes because each represents a distinct responsibility in the pipeline. This keeps payroll rules separate from the details of reading and writing CSV files.

## 4. How did you divide responsibilities differently?

In Assignment 2, all processing logic was contained in `ETLPipeline`. In Assignment 3, `EmployeeCsvReader` checks the input structure and converts values to the required types. `Employee` rejects negative hours or pay rates and handles payroll calculations and classifications. `EmployeeCsvWriter` formats and writes the results. `ETLPipeline` now coordinates these objects instead of performing every step itself.

## 5. Why do you believe your Assignment 3 design is an improvement?

The new design is easier to understand and maintain because each class has a specific purpose. For example, I can change an overtime or bonus rule in `Employee` without changing how the program reads files. Keeping employee data private and final also helps maintain consistent values throughout processing. These changes improve the program’s organization while preserving the payroll rules, relative file paths, CSV output, and console summary from Assignment 2.

## Validation

I compiled both versions and compared their CSV output and console summaries using the grading dataset and additional cases covering rounding, invalid rows, and empty input. The results matched. For the grading dataset, both versions reported 14 rows read, 7 transformed, and 7 skipped.

## AI and external resources

I used ChatGPT to help revise the wording of this design discussion.

AI transcript: https://chatgpt.com/share/6ab43e18-bb54-83ea-826a-43e9a99f7317
