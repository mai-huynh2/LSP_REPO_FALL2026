# Question 1 development log

## Assistance and scope

OpenAI ChatGPT was used to read the exam, generate Questions 1–3, organize the required files, write Javadoc and Markdown documentation, and run the supplied Java drivers. The code and prose in this package were generated with AI assistance. No answer, outline, editing, or evaluation for Question 4 was requested or produced.

The complete visible conversation through the delivery response appears below, followed by the attached exam text and delivered source files. If additional AI exchanges or outside sources are used after this package is downloaded, append them before submission. These logs document resources known to ChatGPT; the student must add any separately used resources. No student review, personal testing, lecture-note consultation, or independent authorship is being claimed by this generated log.

## Provided material

Howard University, CSCI 363: Large Scale Programming, Fall 2026 Midterm Examination, uploaded as Mid-term on October 26, 2026. Used for method signatures, packages, behavior, CRC requirements, drivers, and documentation instructions.

## Implementation and checks

ChatGPT selected TreeMap<String, Book> for unique ISBN lookup and ascending ISBN iteration. Book owns its availability transitions. Library locates the Book, checks its collection-wide limit before borrowing, and delegates state changes. Borrow counts are derived from current book states, and query methods return new lists. Javadoc covers the classes, constructors, and public methods.

ChatGPT compiled the Java sources using OpenJDK 17 with -Xlint:all. Compilation produced no warnings. The unchanged supplied Question 1 Driver reported 44 PASSED, 0 FAILED and a functional score of 25.00 / 25. A Javadoc check using -Xdoclint:all completed without errors or warnings. These were AI-environment checks, not claims about tests run by the student.

No web source was needed to write this implementation. The shared conversation included the Question 2 research listed below.

## Online resources consulted for Question 2

Arthur J. Riel, *Object-Oriented Design Heuristics*, Addison-Wesley, 1996. Online book excerpts were consulted rather than an offline copy:

* https://www.oreilly.com/library/view/object-oriented-design-heuristics/020163385X/apa.html — confirmed the author and the data-hiding and public-interface heuristics in the available preview.
* https://flylib.com/books/en/4.425.1.24/1/ — consulted the book's chapter 2 summary for heuristics 2.1, 2.8, and 2.9 used in the evaluation.
* https://flylib.com/books/en/4.425.1.129/1/ — consulted the book's chapter 3 summary for distributed responsibilities, avoiding god classes, and separating the model from the user interface.

Search queries run by ChatGPT:

* Arthur Riel object oriented design heuristics all data should be hidden distribute system intelligence
* site.oreilly.com/library/view/object-oriented-design-heuristics/020163385X/ "Heuristic 2.8" "Heuristic 3.1"

Search-result excerpts also surfaced these reference pages during discovery. They were not used as substitutes for the book excerpts above:

* https://www.diva-portal.org/smash/get/diva2%3A208275/FULLTEXT01.pdf
* https://www.oreilly.com/library/view/object-oriented-design-heuristics/020163385X/
* https://homepages.ecs.vuw.ac.nz/\~elvis/db/misc/rules.html
* https://courses.cs.washington.edu/courses/cse331/11sp/lectures/slides/12-oo-design-heuristics.pdf
* https://www.dfpug.de/konf/konf\_1999/gruppe02\_oop/e\_heur/e\_heur.htm
* https://scg.unibe.ch/teaching/ese/60-design-heuristics
* https://archive.esug.org/Lectures/Ducasse-UniversityOfBerne/Lectures-OOP-0203/OOP-11-RielSelectedHeuristics.pdf
* https://www.informit.com/store/object-oriented-design-heuristics-9780201633856
* https://gtl.csa.iisc.ac.in/soft\_arch/OO\_Design\_Heuristic.htm
* https://www.manclswx.com/talks/ooh\_short\_talk\_2022.pdf
* https://manclswx.com/talks/ooh\_short\_talk.pdf

No lecture notes or offline textbooks were supplied or consulted by ChatGPT. The student should add any such resources used independently.

# AI conversation transcript

Date: October 26, 2026. Tool: OpenAI ChatGPT.

how do i check if this compiles

I just rechecked the actual ZIP in a fresh folder. It compiles, and both drivers pass: 44/44 for Question 1 and 12/12 for Question 3. Here’s how to verify it on your computer.



1\. Extract the ZIP.



Right-click Midterm\_Questions\_1-3.zip → Extract All.



2\. Open PowerShell in the extracted folder.



Open the folder where you can see org and START\_HERE.md. Click File Explorer’s address bar, type powershell, and press Enter.



3\. Check that Java’s compiler is installed.



javac -version

java -version



Both should print version information. If javac says “not recognized,” send me that output; that is a Java setup problem.



4\. Compile all the Java files. Copy this entire block:



$midtermBuild = Join-Path $env:TEMP "lsp-midterm-check"

New-Item -ItemType Directory -Force -Path $midtermBuild | Out-Null



javac -d $midtermBuild org/howard/edu/lsp/midterm/crccards/\*.java org/howard/edu/lsp/midterm/inheritance/\*.java



if ($LASTEXITCODE -eq 0) {

&#x20;   Write-Host "COMPILED SUCCESSFULLY"

} else {

&#x20;   Write-Host "COMPILATION FAILED"

}



5\. If it says COMPILED SUCCESSFULLY, run both tests:



java -cp $midtermBuild org.howard.edu.lsp.midterm.crccards.Driver

java -cp $midtermBuild org.howard.edu.lsp.midterm.inheritance.Driver



You should see these summaries:



RESULT: 44 PASSED, 0 FAILED

FUNCTIONAL SCORE: 25.00 / 25

RESULT: 12 PASSED, 0 FAILED

Question 2 contains written answers, so there is nothing to compile for it. Send me any error output or a screenshot if your results differ.





Convert to PDF

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3> $midtermBuild = Join-Path $env:TEMP "lsp-midterm-check"

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3> New-Item -ItemType Directory -Force -Path $midtermBuild | Out-Null

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3>

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3> javac -d $midtermBuild org/howard/edu/lsp/midterm/crccards/\*.java org/howard/edu/lsp/midterm/inheritance/\*.java

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3>

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3> if ($LASTEXITCODE -eq 0) {

>>     Write-Host "COMPILED SUCCESSFULLY"

>> } else {

>>     Write-Host "COMPILATION FAILED"

>> }

COMPILED SUCCESSFULLY

PS C:\\Users\\NmHuy\\Downloads\\Midterm\_Questions\_1-3>

It compiled successfully on your computer. Now run both drivers in the same PowerShell window:



java -cp $midtermBuild org.howard.edu.lsp.midterm.crccards.Driver

java -cp $midtermBuild org.howard.edu.lsp.midterm.inheritance.Driver



The expected summaries are:



RESULT: 44 PASSED, 0 FAILED

FUNCTIONAL SCORE: 25.00 / 25

RESULT: 12 PASSED, 0 FAILED

Paste the output here so we can confirm the tests pass too.





Convert to PDF

it compiled successfully



## Message 1: User

Friendly reminder about our exam this evening. Please be on time, the exam will start shortly after 6:10PM. Exam is open book, open notes, open AI, etc. The only restriction is that you are only allowed to conversate with me during the exam. Exam answers should be uploaded to your repos. There is no need to notify me once you are done. Please do not make ANY changes to what you uploaded after the exam has been completed. Modifications to your submission after the exam will result in a zero.

## Message 2: Assistant

Your exam instructions mean:

* **Be ready before 6:10 PM tonight.** The exam starts shortly afterward.
* **You can use your textbook, notes, and AI.** I can help you work through the questions.
* **You cannot communicate with other people during the exam**, except your professor.
* **Upload your answers to your repository** before the exam ends. You do not need to notify your professor.
* **Do not edit your submission after the exam ends.** Any changes afterward will result in a zero.

Send the questions when you receive them, along with any required file names or submission format.

## Message 3: User

\[Uploaded the file Mid-term, with no accompanying text. Its extracted contents are included below.]

## Message 4: Assistant

I’ll open the attached midterm and check the questions and submission requirements.

## Message 5: Assistant

I’ve read the midterm. It has four questions:

|Question|Required work|Points|
|-|-|-:|
|1|Implement `Book` and `Library`, pass 44 driver checks, and write documentation|35|
|2|Evaluate the registration class, propose CRC cards, and explain design changes|25|
|3|Implement employee inheritance and polymorphism, including overtime, and pass 12 checks|30|
|4|Write your personal reflection on AI|10|

**AI is permitted for Questions 1–3. Question 4 explicitly prohibits AI generation, editing, or evaluation**, so you’ll need to write that part yourself.

Questions 1–3 also require development logs disclosing assistance. Questions 1 and 3 specifically require the **complete AI conversation transcript**; Question 2 also accepts a working shareable conversation URL.

Would you like to work through Question 1 first, or have me prepare Questions 1–3 together with the required folder structure?

## Message 6: User

1-3 together

## Message 7: Assistant

I’ll prepare Questions 1–3 in the required folders, run both provided drivers, and include the development logs. I’ll use the Library skill to save the finished download.

## Message 8: Assistant

The required structure is clear: Question 1 needs the lending rules enforced without changing either driver, and Question 3 needs four employee classes. I’m also checking Riel’s heuristics for Question 2; I don’t have your lecture notes, so I’ll identify the published reference used in the log.

## Message 9: Assistant

Both unchanged drivers pass: Question 1 has 44/44 passing checks, and Question 3 has 12/12. The Java code also compiles without warnings. I’m finishing the disclosure logs and upload instructions, including where you’ll add your independently written Question 4.

## Message 10: Assistant

Prepared [Midterm\_Questions\_1-3.zip](sandbox:/workspace/scratch/d43c6c466d0a/Midterm_Questions_1-3.zip).

* **Question 1:** 44/44 driver checks passed.
* **Question 3:** 12/12 driver checks passed.
* Includes Question 2 answers, Javadoc, unchanged drivers, and development logs with this conversation and the generated code.

**Next steps:**

1. Extract the ZIP and copy its **`org` folder into your repository’s main folder**, alongside your existing files.
2. Read `START\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_HERE.md` for testing and upload commands. Review the answers and add any other resources or later AI exchanges to the logs.
3. Write Question 4 yourself in `org/howard/edu/lsp/midterm/reflection/doc/ai\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_reflection.md`.
4. Push everything before the exam ends, verify it on GitHub, and make no changes afterward.

The files are prepared locally; I have **not uploaded them to GitHub**.

## Uploaded attachment: Mid-term

The following is the instructor-provided exam text, not an AI-generated answer. Tables follow the paragraphs.

````text
HOWARD UNIVERSITY
Department of Electrical Engineering and Computer Science
CSCI 363: Large Scale Programming – Midterm Examination
Fall 2026  |  Questions 1–4  |  Total: 100 points
Submission Package Structure
Use the following structure in your GitHub repository. The bracketed entry represents Java files you must determine and create for Question 3; it is not a literal filename.
org/
└── howard/
    └── edu/
        └── lsp/
            └── midterm/
                ├── crccards/                         (Question 1)
                │   ├── Book.java
                │   ├── Library.java
                │   ├── Driver.java
                │   └── doc/
                │       ├── crccards.md
                │       └── development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log.md
                ├── design/                           (Question 2)
                │   └── doc/
                │       ├── evaluation.md
                │       ├── design.md
                │       ├── design\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_rationale.md
                │       └── development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_q2.md
                ├── inheritance/                     (Question 3)
                │   ├── Driver.java
                │   ├── \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[Your implementation .java files]
                │   └── doc/
                │       └── development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_q3.md
                └── reflection/                        (Question 4)
                    └── doc/
                        └── ai\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_reflection.md
All Java files must declare the package matching their directory. Markdown files belong in the corresponding doc directory. Do not submit compiled .class files or IDE-specific project files.
Question 1 – Implement Classes from CRC Cards (35 points)
The following CRC cards describe a Library Lending System. Implement the required Java classes and satisfy all specified behaviors and business rules.
General Requirements
Each Java class must be in its own .java file, using package org.howard.edu.lsp.midterm.crccards.
Do not modify the instructor-provided Driver.java. Your solution must compile and execute with it.
Library must select an appropriate Java Collections Framework data structure.
All classes and public methods require Javadoc comments.
Push your solution to your GitHub repository early and often. Only repository contents at the end of the exam will be graded.
Resources permitted: notes, books, internet, and AI tools. Collaboration or consultation with another person is prohibited.
CRC Cards
Part 1 – Book
Fields: isbn, title, author, available. New books start available.
public Book(String isbn, String title, String author)
public String getIsbn()
public String getTitle()
public String getAuthor()
public boolean isAvailable()
public void borrowBook()
public void returnBook()
public String toString()
borrowBook() makes an available book unavailable; otherwise it throws IllegalStateException.
returnBook() makes an unavailable book available; otherwise it throws IllegalStateException.
Availability cannot be modified directly by other classes.
toString() format: B101 Effective Java by Joshua Bloch \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[AVAILABLE]. Use \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[BORROWED] when unavailable.
Part 2 – Library
Select a suitable collection internally. The public interface is:
public void addBook(Book book)
public Book findBook(String isbn)
public void borrowBook(String isbn)
public void returnBook(String isbn)
public List<Book> getAvailableBooks()
public List<Book> getBooksByAuthor(String author)
public List<Book> getBooksSortedByIsbn()
public int getBorrowedBookCount()
Duplicate ISBNs are prohibited: addBook() throws IllegalArgumentException and preserves the original book.
findBook() returns the matching Book instance, or null if absent.
No more than three books may be borrowed from the Library at one time.
Library borrowing and returning operations must locate the Book and delegate its state change to the Book.
Borrowing or returning an ISBN not in the Library throws IllegalArgumentException.
Borrowing an already borrowed book, returning an available book, or exceeding the three-book limit throws IllegalStateException.
Failed operations must not change the collection, the borrowing count, or book availability.
getAvailableBooks() returns all and only available books; getBooksByAuthor() returns all books matching the author exactly (case-sensitive), including borrowed books.
List-returning methods return an empty List when there are no matches; list order is not significant. getBorrowedBookCount() returns the current number of borrowed books.
getBooksSortedByIsbn() returns all books sorted by ISBN in ascending lexicographical (String) order, regardless of insertion order or borrowing status. Return an empty List when the Library is empty. The method must not change the Library contents or book states.
Design assumption: All borrowing and returning of books belonging to a Library occur through Library methods. A standalone Book may be borrowed or returned directly.
Part 3 – Javadoc
Include class descriptions and author names, plus public method descriptions, @param, @return, and @throws tags where applicable.
Part 4 – Documentation
Place both Markdown files in org/howard/edu/lsp/midterm/crccards/doc:
development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log.md — Identify resources used (AI, websites, lecture notes, books). Include complete AI conversation transcripts (prompts and responses), full URLs for online resources, and explanations of how each resource helped. If none were used, write exactly: “No external assistance was used.”
crccards.md — In 3–5 sentences, explain why Library collaborates with Book but not vice versa, and why Library enforces the three-book borrowing limit. Reference the CRC responsibilities.
Provided Driver.java
Copy this Driver into the specified Java package without modification. It reports PASS/FAIL results and a functional score. Passing the Driver does not guarantee full credit for documentation and CRC explanation.

package org.howard.edu.lsp.midterm.crccards;

import java.util.List;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Instructor-provided verification driver for Question 1. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class Driver {
    private static int passed = 0;
    private static int failed = 0;

    private static void check(String name, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("PASS - " + name);
        } else {
            failed++;
            System.out.println("FAIL - " + name);
        }
    }

    private static boolean containsIsbn(List<Book> books, String isbn) {
        if (books == null) return false;
        for (Book book : books) {
            if (book != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& isbn.equals(book.getIsbn())) return true;
        }
        return false;
    }

    public static void main(String\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[] args) {
        System.out.println("QUESTION 1 - LIBRARY LENDING SYSTEM TESTS");
        Library library = new Library();
        Book b1 = new Book("B101", "Effective Java", "Joshua Bloch");
        Book b2 = new Book("B102", "Clean Code", "Robert Martin");
        Book b3 = new Book("B103", "Java Concurrency", "Brian Goetz");
        Book b4 = new Book("B104", "Clean Architecture", "Robert Martin");

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nBOOK INITIALIZATION");
        check("ISBN getter", "B101".equals(b1.getIsbn()));
        check("Title getter", "Effective Java".equals(b1.getTitle()));
        check("Author getter", "Joshua Bloch".equals(b1.getAuthor()));
        check("New books start available", b1.isAvailable());
        check("Available book string", "B101 Effective Java by Joshua Bloch \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[AVAILABLE]".equals(b1.toString()));

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nLIBRARY ADD AND LOOKUP");
        library.addBook(b3);
        library.addBook(b1);
        library.addBook(b4);
        library.addBook(b2);
        check("Find existing book returns same object", library.findBook("B102") == b2);
        check("Find missing book returns null", library.findBook("B999") == null);
        check("Initially four available", library.getAvailableBooks() != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getAvailableBooks().size() == 4);
        check("Initially zero borrowed", library.getBorrowedBookCount() == 0);
        try {
            library.addBook(new Book("B102", "Duplicate", "Other"));
            check("Duplicate ISBN rejected", false);
        } catch (IllegalArgumentException ex) {
            check("Duplicate ISBN rejected", true);
        } catch (Exception ex) {
            check("Duplicate ISBN rejected (wrong exception)", false);
        }
        check("Duplicate did not replace original", library.findBook("B102") == b2);
        check("Duplicate did not alter available count", library.getAvailableBooks().size() == 4);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nAUTHOR SEARCH");
        List<Book> martin = library.getBooksByAuthor("Robert Martin");
        check("Author search finds both matches", martin != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& martin.size() == 2 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& containsIsbn(martin, "B102") \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& containsIsbn(martin, "B104"));
        check("Author comparison case sensitive", library.getBooksByAuthor("robert martin") != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBooksByAuthor("robert martin").isEmpty());
        check("Unknown author returns empty list", library.getBooksByAuthor("Nobody") != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBooksByAuthor("Nobody").isEmpty());

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nSORTED ISBN RETRIEVAL");
        List<Book> sorted = library.getBooksSortedByIsbn();
        check("Sorted list contains all books", sorted != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& sorted.size() == 4);
        check("Books returned in ascending ISBN order", sorted != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& sorted.size() == 4
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B101".equals(sorted.get(0).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B102".equals(sorted.get(1).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B103".equals(sorted.get(2).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B104".equals(sorted.get(3).getIsbn()));
        check("Sorting does not change library", library.getAvailableBooks().size() == 4
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBorrowedBookCount() == 0);
        Library emptyLibrary = new Library();
        check("Empty library returns empty sorted list", emptyLibrary.getBooksSortedByIsbn() != null
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& emptyLibrary.getBooksSortedByIsbn().isEmpty());

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nBORROWING AND LIMIT");
        library.borrowBook("B101");
        check("Borrow makes book unavailable", !b1.isAvailable());
        check("Borrowed book string", "B101 Effective Java by Joshua Bloch \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[BORROWED]".equals(b1.toString()));
        check("Borrow count increments", library.getBorrowedBookCount() == 1);
        check("Available list excludes borrowed book", library.getAvailableBooks().size() == 3 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& !containsIsbn(library.getAvailableBooks(), "B101"));
        try {
            library.borrowBook("B101");
            check("Already borrowed book rejected", false);
        } catch (IllegalStateException ex) {
            check("Already borrowed book rejected", true);
        } catch (Exception ex) {
            check("Already borrowed book rejected (wrong exception)", false);
        }
        check("Failed borrow does not change count", library.getBorrowedBookCount() == 1);
        library.borrowBook("B102");
        library.borrowBook("B103");
        check("Three borrowed", library.getBorrowedBookCount() == 3);
        try {
            library.borrowBook("B104");
            check("Fourth borrow rejected", false);
        } catch (IllegalStateException ex) {
            check("Fourth borrow rejected", true);
        } catch (Exception ex) {
            check("Fourth borrow rejected (wrong exception)", false);
        }
        check("Limit failure leaves fourth book available", b4.isAvailable());
        check("Limit failure leaves count at three", library.getBorrowedBookCount() == 3);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nRETURNING AND REBORROWING");
        library.returnBook("B101");
        check("Return makes book available", b1.isAvailable());
        check("Return reduces count", library.getBorrowedBookCount() == 2);
        check("Returned book appears in available list", containsIsbn(library.getAvailableBooks(), "B101"));
        try {
            library.returnBook("B101");
            check("Returning available book rejected", false);
        } catch (IllegalStateException ex) {
            check("Returning available book rejected", true);
        } catch (Exception ex) {
            check("Returning available book rejected (wrong exception)", false);
        }
        check("Invalid return leaves count unchanged", library.getBorrowedBookCount() == 2);
        library.borrowBook("B104");
        check("Borrow succeeds after return", !b4.isAvailable() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBorrowedBookCount() == 3);

        List<Book> sortedAfterBorrow = library.getBooksSortedByIsbn();
        check("Sorted retrieval includes borrowed books", sortedAfterBorrow != null
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& sortedAfterBorrow.size() == 4 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B101".equals(sortedAfterBorrow.get(0).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B104".equals(sortedAfterBorrow.get(3).getIsbn()));

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nMISSING ISBN OPERATIONS");
        try {
            library.borrowBook("B999");
            check("Borrow missing ISBN rejected", false);
        } catch (IllegalArgumentException ex) {
            check("Borrow missing ISBN rejected", true);
        } catch (Exception ex) {
            check("Borrow missing ISBN rejected (wrong exception)", false);
        }
        try {
            library.returnBook("B999");
            check("Return missing ISBN rejected", false);
        } catch (IllegalArgumentException ex) {
            check("Return missing ISBN rejected", true);
        } catch (Exception ex) {
            check("Return missing ISBN rejected (wrong exception)", false);
        }
        check("Missing ISBN operations leave count unchanged", library.getBorrowedBookCount() == 3);
        check("Author search includes borrowed books", library.getBooksByAuthor("Robert Martin").size() == 2);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nDIRECT BOOK STATE VALIDATION");
        Book standalone = new Book("B200", "Standalone", "Test Author");
        standalone.borrowBook();
        check("Direct borrow changes state", !standalone.isAvailable());
        try {
            standalone.borrowBook();
            check("Direct double borrow rejected", false);
        } catch (IllegalStateException ex) {
            check("Direct double borrow rejected", true);
        } catch (Exception ex) {
            check("Direct double borrow rejected (wrong exception)", false);
        }
        standalone.returnBook();
        check("Direct return changes state", standalone.isAvailable());
        try {
            standalone.returnBook();
            check("Direct double return rejected", false);
        } catch (IllegalStateException ex) {
            check("Direct double return rejected", true);
        } catch (Exception ex) {
            check("Direct double return rejected (wrong exception)", false);
        }

System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nRESULT: " + passed + " PASSED, " + failed + " FAILED");
System.out.printf("FUNCTIONAL SCORE: %.2f / 25%n", 25.0 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* passed / (passed + failed));
    }
}
Expected Driver Result
With a correct implementation, every individual check prints PASS and the final summary is:
RESULT: 44 PASSED, 0 FAILED
FUNCTIONAL SCORE: 25.00 / 25
The Driver prints individual PASS/FAIL results and calculates the functional score. An unexpected exception may interrupt execution; ensure your solution compiles and handles all specified operations.
Grading Rubric (35 points)
The Driver verifies required functionality. The functional component is worth 25 points; documentation and design explanations account for the remaining 10 points.
Question 2 – Evaluating Object-Oriented Design (25 points)
The following class is part of a university course registration system. Evaluate its object-oriented design using principles discussed in class, including Arthur Riel’s object-oriented design heuristics. Study the code carefully and answer the questions that follow.
Provided Class
import java.io.FileWriter;
import java.util.Date;
 
public class CourseRegistration {
 
    public String studentId;
    public String studentName;
    public String email;
    public String courseCode;
    public int creditHours;
 
    public void registerStudent() {
        // calculate tuition
        double tuition = creditHours \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* 750.0;
 
        // apply discount for heavy course load
        if (creditHours >= 12) {
            tuition = tuition \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* 0.90;
        }
 
        // print registration confirmation
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseCode);
        System.out.println("Tuition: " + tuition);
 
        // save registration to file
        try {
            FileWriter writer = new FileWriter("registrations.txt", true);
            writer.write(studentId + "," + courseCode + "," + tuition + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        // send confirmation email
        System.out.println("Sending confirmation email to " + email);
 
        // log registration
        System.out.println("Registration processed at " + new Date());
    }
}
Part 1 – Design Evaluation (8 points)
Evaluate the design of the CourseRegistration class. Describe the object-oriented design issues you observe and explain why they may lead to poor structure, maintainability, extensibility, or correctness. You must reference Arthur Riel’s design heuristics discussed in class.
Submit your evaluation in evaluation.md in org/howard/edu/lsp/midterm/design/doc.
Part 2 – Proposed Improved Design Using CRC Cards (8 points)
Propose an improved object-oriented design for this system. Use CRC cards to identify major classes, their responsibilities, and their collaborators. You are not required to implement the redesigned classes in Java.
Submit your CRC cards in design.md in org/howard/edu/lsp/midterm/design/doc. Use the following format for each card:
Class:
Responsibilities:
Collaborators:
Part 3 – Evolving Requirements and Design Rationale (4 points)
The university now needs to support two storage options for registration records: a local file or a database, selected according to the deployment environment. It must also support sending confirmations by either email or text message.
Explain how your proposed CRC-based design would accommodate these changes. Identify any changes you would make to your CRC cards and justify one important decision about which class should own a particular responsibility. Your explanation must be consistent with your Part 2 design.
Submit your response in design\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_rationale.md in org/howard/edu/lsp/midterm/design/doc.
Part 4 – Development Log (5 points)
Create development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_q2.md in org/howard/edu/lsp/midterm/design/doc. Document all external resources used, including AI tools, internet searches, documentation, lecture notes, and textbooks. For AI assistance, include the complete conversation transcript (all prompts and responses) or a working shareable conversation URL that provides the full exchange. For websites, include URLs and how they helped; cite offline sources and how they helped. If no external assistance was used, state that clearly.
Question 2 – Grading Rubric
Submission reminder: Push all required files to your GitHub repository before the exam ends. Work with other people is prohibited; permitted resources include notes, books, the internet, and AI tools, subject to the development-log requirements.

Question 3 – Refactoring with Inheritance and Polymorphism (30 points)
The following class calculates employee pay using a conditional statement to select behavior. Refactor the design to use inheritance, method overriding, and polymorphism. Do not use a design pattern for this question.
Provided Class
public class EmployeePayCalculator {
    public double calculatePay(String employeeType,
                               double hoursWorked,
                               double hourlyRate) {
        if (employeeType.equals("FULL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_TIME")) {
            return hoursWorked \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* hourlyRate;
        }
        if (employeeType.equals("PART\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_TIME")) {
            return hoursWorked \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* hourlyRate;
        }
        if (employeeType.equals("CONTRACTOR")) {
            return hoursWorked \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* hourlyRate \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* 1.15;
        }
        return 0.0;
    }
}
Part 1 – Refactor the Implementation (23 points)
Refactor the provided design using inheritance, method overriding, and polymorphism. Each class must be in its own .java file in the package org.howard.edu.lsp.midterm.inheritance.
Use the provided Driver to determine the classes, public constructors, method signatures, and required behavior. Your implementation must compile and execute with the Driver without modifying it.
You may introduce any appropriate fields, constructors, or supporting methods needed for your design. Assume hoursWorked and hourlyRate are nonnegative. As part of the refactoring, full-time employees must receive overtime pay at 1.5 times their hourly rate for hours worked beyond 40 per week. Part-time employees receive straight hourly pay, and contractors receive a 15% premium on all hours worked.
Include Javadoc comments for all classes, public constructors, and public methods. No separate design explanation is required.
Part 2 – Provided Driver (Do Not Modify)
package org.howard.edu.lsp.midterm.inheritance;
 
public class Driver {
    private static int passed = 0;
    private static int failed = 0;
 
    private static void check(String label, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("PASS: " + label);
        } else {
            failed++;
            System.out.println("FAIL: " + label);
        }
    }
 
    private static boolean equal(double actual, double expected) {
        return Math.abs(actual - expected) < 0.000001;
    }
 
    private static void test(String label, Employee employee,
                             double expected) {
        try {
            check(label, equal(employee.calculatePay(), expected));
        } catch (Exception e) {
            check(label, false);
        }
    }
 
    public static void main(String\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[] args) {
        test("Full-time 0 hours", new FullTimeEmployee(0, 20), 0);
        test("Full-time 30 hours", new FullTimeEmployee(30, 20), 600);
        test("Full-time 40 hours", new FullTimeEmployee(40, 20), 800);
        test("Full-time 45 hours", new FullTimeEmployee(45, 20), 950);
        test("Full-time 50 hours", new FullTimeEmployee(50, 10), 550);
        test("Part-time 0 hours", new PartTimeEmployee(0, 20), 0);
        test("Part-time 30 hours", new PartTimeEmployee(30, 20), 600);
        test("Part-time 45 hours", new PartTimeEmployee(45, 20), 900);
        test("Contractor 0 hours", new Contractor(0, 20), 0);
        test("Contractor 30 hours", new Contractor(30, 20), 690);
        test("Contractor 45 hours", new Contractor(45, 20), 1035);
        test("Contractor 40 hours", new Contractor(40, 10), 460);
        System.out.println("RESULT: " + passed + " PASSED, "
                           + failed + " FAILED");
    }
}
Expected result for a correct implementation: RESULT: 12 PASSED, 0 FAILED. Each test is worth an equal share of the 13 functional-test points. The inheritance/polymorphism design is assessed separately.
Part 3 – Development Log (5 points)
Create development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_q3.md in org/howard/edu/lsp/midterm/inheritance/doc. Document all external resources used while completing this question. For AI assistance, include the complete conversation transcript; for online sources, include URLs and how they helped; for offline sources, provide identifying citations. If no external assistance was used, write: "No external assistance was used."
Question 3 – Grading Rubric
Submission reminder: Push all Java and documentation files to GitHub before the exam ends. Do not modify the provided Driver. Collaboration with other people is prohibited.

Question 4 – Personal Reflection on AI in Software Development (10 points)
Throughout this semester, you have had opportunities to use artificial intelligence (AI) tools while studying object-oriented programming and completing coursework. Reflect on your own experience in this course.
In your response, address the following:
Benefits: Explain how AI has helped your learning or software development this semester. Include at least one specific example from this course.
Challenges: Describe a situation in which AI was incorrect, misleading, unhelpful, or made learning more difficult. Explain what you learned from that experience. If you did not encounter such a situation, explain a limitation or risk you have observed and how you address it.
Moving Forward: Explain how you intend to use AI in future courses or professional software development while continuing to develop your own technical skills.
IMPORTANT — NO AI ASSISTANCE FOR QUESTION 4. Your response must be written entirely by you, in your own words. Do not use AI tools to generate, rewrite, edit, or evaluate any portion of your response. AI remains permitted for Questions 1–3 under the exam’s resource and disclosure rules.
Submit your response in ai\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_reflection.md, located in org/howard/edu/lsp/midterm/reflection/doc.
Your response should be thoughtful and personal. There are no predetermined correct opinions about AI. You will be graded on completeness, specificity, and reflection, not whether your view is favorable or unfavorable.
Question 4 – Grading Rubric
Final submission reminder: The entire exam is worth 100 points. Push all required Java and Markdown files to your GitHub repository before the exam ends. Do not collaborate with other people. AI use is prohibited for Question 4 only.

Table 1
Class | Responsibilities | Collaborators
Book | Store book information; maintain availability; validate borrowing/returning; provide book details | None
Library | Maintain books; add and find books; coordinate borrowing/returning; enforce borrowing limit; retrieve books by criteria | Book

Table 2
Component | Points
Driver functional tests (44 checks; proportional PASS/FAIL score) | 25
Javadoc: class descriptions (1), public method documentation (2) | 3
Development log: file present (1), complete resource disclosures (2) | 3
CRC explanation: collaboration direction (2), library-level limit rationale (2) | 4
TOTAL | 35

Table 3
Component | Points
Design evaluation and explanation | 8
CRC-based redesigned architecture | 8
Evolving requirements and design rationale | 4
Development log | 5
TOTAL | 25

Table 4
Component | Points
Inheritance hierarchy, overriding, and polymorphism | 10
Driver functional tests (12 equal checks) | 13
Javadoc documentation | 2
Development log | 5
Total | 30

Table 5
Component | Points
Benefits with specific example | 3
Challenges or limitations with specific example | 3
Future use and independent skill development | 3
Completeness and clarity | 1
TOTAL | 10
````

## Delivered source and written answers

The following files are the AI-assisted deliverables. Driver.java files are unchanged instructor code. Development logs are not recursively embedded inside themselves. Their disclosure text is present at the beginning of each log.

### START\_HERE.md

````markdown
# Midterm Questions 1 through 3

The org folder contains the required submission files for Questions 1, 2, and 3. It is ready to copy into the root of your existing LSP\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_REPO\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_FALL2026 repository. If the repository already has an org folder, merge the folders rather than deleting the existing one. Do not put this work inside assignment1, assignment2, or another assignment folder. This instruction file does not need to be submitted.

## Before submitting

1. Review all code and written responses. The Javadoc author is Ngoc-Mai Huynh, and the logs explicitly disclose that ChatGPT generated the implementation and written answers.
2. Question 2 uses published Riel heuristics. Your lecture notes were not supplied, so check that the terminology matches what your class covered. Add any notes or other resources you consult to the development logs.
3. The development logs contain the visible conversation through the delivery response, the attached exam text, and the generated code and design documents. If you continue using AI after this download, append all subsequent prompts and responses to each affected question's log before the deadline. A link alone does not replace the transcript requirement for Questions 1 and 3.
4. Complete Question 4 independently in org/howard/edu/lsp/midterm/reflection/doc/ai\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_reflection.md. No reflection answer or template is included.
5. Submit before the exam ends. Do not change the submission after the exam ends.

## Files included

Question 1: Book.java, Library.java, Driver.java, doc/crccards.md, doc/development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log.md in org/howard/edu/lsp/midterm/crccards.

Question 2: evaluation.md, design.md, design\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_rationale.md, development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_q2.md in org/howard/edu/lsp/midterm/design/doc.

Question 3: Employee.java, FullTimeEmployee.java, PartTimeEmployee.java, Contractor.java, Driver.java, doc/development\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_log\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_q3.md in org/howard/edu/lsp/midterm/inheritance.

The instructor's two Driver.java files were copied from the exam without code changes. There are no .class files or IDE project files in this download.

## Test in PowerShell

Open PowerShell in the root of your local repository. These commands put compiled files in your temporary directory, outside the repository. They require an installed JDK with javac and java available.

```powershell
$midtermBuild = Join-Path $env:TEMP "lsp-midterm-build"
New-Item -ItemType Directory -Force -Path $midtermBuild | Out-Null
javac -d $midtermBuild org/howard/edu/lsp/midterm/crccards/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*.java org/howard/edu/lsp/midterm/inheritance/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*.java
java -cp $midtermBuild org.howard.edu.lsp.midterm.crccards.Driver
java -cp $midtermBuild org.howard.edu.lsp.midterm.inheritance.Driver
```

Expected results:

```text
Question 1:
RESULT: 44 PASSED, 0 FAILED
FUNCTIONAL SCORE: 25.00 / 25

Question 3:
RESULT: 12 PASSED, 0 FAILED
```

ChatGPT compiled the code using OpenJDK 17 with all compiler warnings enabled, ran both supplied drivers, and checked Javadoc for errors. All checks passed. These results cover the supplied functional checks, not a guarantee of full credit for written or design requirements.

## Upload with Git

After reviewing the files, updating any disclosures, and writing your own Question 4, run the following from the repository root before the exam ends:

```powershell
git status
git add org/howard/edu/lsp/midterm
git diff --cached --stat
```

Check that the staged files include all required Java and Markdown files, including Question 4 and the logs, and exclude compiled .class files. Then run:

```powershell
git commit -m "Add midterm exam submission"
git push
```

Open your GitHub repository and verify that the new files appear under org/howard/edu/lsp/midterm. If git push reports an error, the upload is not complete. Do not make any changes after the exam has ended.

If you are uploading through the GitHub website instead, open the repository's main page, choose Add file > Upload files, and drag the extracted org folder into the upload area. Check the displayed paths before committing. Upload the extracted files, not the ZIP. Verify your reflection and all logs are present before the deadline.

````

### org/howard/edu/lsp/midterm/crccards/Book.java

````java
package org.howard.edu.lsp.midterm.crccards;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Stores a book's identifying information and controls its availability.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @author Ngoc-Mai Huynh
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private boolean available;

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Creates an available book.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param isbn the book's ISBN
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param title the book's title
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param author the book's author
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Returns the ISBN.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the ISBN
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public String getIsbn() {
        return isbn;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Returns the title.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the title
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public String getTitle() {
        return title;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Returns the author.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the author
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public String getAuthor() {
        return author;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Reports whether the book is available.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return true if the book is available, otherwise false
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public boolean isAvailable() {
        return available;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Marks an available book as borrowed.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalStateException if the book is already borrowed
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public void borrowBook() {
        if (!available) {
            throw new IllegalStateException("Book is already borrowed.");
        }
        available = false;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Marks a borrowed book as available.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalStateException if the book is already available
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public void returnBook() {
        if (available) {
            throw new IllegalStateException("Book is already available.");
        }
        available = true;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Returns the book's identifying information and availability label.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the formatted book description
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    @Override
    public String toString() {
        return isbn + " " + title + " by " + author
                + (available ? " \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[AVAILABLE]" : " \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[BORROWED]");
    }
}

````

### org/howard/edu/lsp/midterm/crccards/Driver.java

````java
package org.howard.edu.lsp.midterm.crccards;

import java.util.List;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Instructor-provided verification driver for Question 1. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class Driver {
    private static int passed = 0;
    private static int failed = 0;

    private static void check(String name, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("PASS - " + name);
        } else {
            failed++;
            System.out.println("FAIL - " + name);
        }
    }

    private static boolean containsIsbn(List<Book> books, String isbn) {
        if (books == null) return false;
        for (Book book : books) {
            if (book != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& isbn.equals(book.getIsbn())) return true;
        }
        return false;
    }

    public static void main(String\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[] args) {
        System.out.println("QUESTION 1 - LIBRARY LENDING SYSTEM TESTS");
        Library library = new Library();
        Book b1 = new Book("B101", "Effective Java", "Joshua Bloch");
        Book b2 = new Book("B102", "Clean Code", "Robert Martin");
        Book b3 = new Book("B103", "Java Concurrency", "Brian Goetz");
        Book b4 = new Book("B104", "Clean Architecture", "Robert Martin");

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nBOOK INITIALIZATION");
        check("ISBN getter", "B101".equals(b1.getIsbn()));
        check("Title getter", "Effective Java".equals(b1.getTitle()));
        check("Author getter", "Joshua Bloch".equals(b1.getAuthor()));
        check("New books start available", b1.isAvailable());
        check("Available book string", "B101 Effective Java by Joshua Bloch \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[AVAILABLE]".equals(b1.toString()));

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nLIBRARY ADD AND LOOKUP");
        library.addBook(b3);
        library.addBook(b1);
        library.addBook(b4);
        library.addBook(b2);
        check("Find existing book returns same object", library.findBook("B102") == b2);
        check("Find missing book returns null", library.findBook("B999") == null);
        check("Initially four available", library.getAvailableBooks() != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getAvailableBooks().size() == 4);
        check("Initially zero borrowed", library.getBorrowedBookCount() == 0);
        try {
            library.addBook(new Book("B102", "Duplicate", "Other"));
            check("Duplicate ISBN rejected", false);
        } catch (IllegalArgumentException ex) {
            check("Duplicate ISBN rejected", true);
        } catch (Exception ex) {
            check("Duplicate ISBN rejected (wrong exception)", false);
        }
        check("Duplicate did not replace original", library.findBook("B102") == b2);
        check("Duplicate did not alter available count", library.getAvailableBooks().size() == 4);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nAUTHOR SEARCH");
        List<Book> martin = library.getBooksByAuthor("Robert Martin");
        check("Author search finds both matches", martin != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& martin.size() == 2 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& containsIsbn(martin, "B102") \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& containsIsbn(martin, "B104"));
        check("Author comparison case sensitive", library.getBooksByAuthor("robert martin") != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBooksByAuthor("robert martin").isEmpty());
        check("Unknown author returns empty list", library.getBooksByAuthor("Nobody") != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBooksByAuthor("Nobody").isEmpty());

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nSORTED ISBN RETRIEVAL");
        List<Book> sorted = library.getBooksSortedByIsbn();
        check("Sorted list contains all books", sorted != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& sorted.size() == 4);
        check("Books returned in ascending ISBN order", sorted != null \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& sorted.size() == 4
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B101".equals(sorted.get(0).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B102".equals(sorted.get(1).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B103".equals(sorted.get(2).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B104".equals(sorted.get(3).getIsbn()));
        check("Sorting does not change library", library.getAvailableBooks().size() == 4
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBorrowedBookCount() == 0);
        Library emptyLibrary = new Library();
        check("Empty library returns empty sorted list", emptyLibrary.getBooksSortedByIsbn() != null
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& emptyLibrary.getBooksSortedByIsbn().isEmpty());

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nBORROWING AND LIMIT");
        library.borrowBook("B101");
        check("Borrow makes book unavailable", !b1.isAvailable());
        check("Borrowed book string", "B101 Effective Java by Joshua Bloch \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[BORROWED]".equals(b1.toString()));
        check("Borrow count increments", library.getBorrowedBookCount() == 1);
        check("Available list excludes borrowed book", library.getAvailableBooks().size() == 3 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& !containsIsbn(library.getAvailableBooks(), "B101"));
        try {
            library.borrowBook("B101");
            check("Already borrowed book rejected", false);
        } catch (IllegalStateException ex) {
            check("Already borrowed book rejected", true);
        } catch (Exception ex) {
            check("Already borrowed book rejected (wrong exception)", false);
        }
        check("Failed borrow does not change count", library.getBorrowedBookCount() == 1);
        library.borrowBook("B102");
        library.borrowBook("B103");
        check("Three borrowed", library.getBorrowedBookCount() == 3);
        try {
            library.borrowBook("B104");
            check("Fourth borrow rejected", false);
        } catch (IllegalStateException ex) {
            check("Fourth borrow rejected", true);
        } catch (Exception ex) {
            check("Fourth borrow rejected (wrong exception)", false);
        }
        check("Limit failure leaves fourth book available", b4.isAvailable());
        check("Limit failure leaves count at three", library.getBorrowedBookCount() == 3);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nRETURNING AND REBORROWING");
        library.returnBook("B101");
        check("Return makes book available", b1.isAvailable());
        check("Return reduces count", library.getBorrowedBookCount() == 2);
        check("Returned book appears in available list", containsIsbn(library.getAvailableBooks(), "B101"));
        try {
            library.returnBook("B101");
            check("Returning available book rejected", false);
        } catch (IllegalStateException ex) {
            check("Returning available book rejected", true);
        } catch (Exception ex) {
            check("Returning available book rejected (wrong exception)", false);
        }
        check("Invalid return leaves count unchanged", library.getBorrowedBookCount() == 2);
        library.borrowBook("B104");
        check("Borrow succeeds after return", !b4.isAvailable() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& library.getBorrowedBookCount() == 3);

        List<Book> sortedAfterBorrow = library.getBooksSortedByIsbn();
        check("Sorted retrieval includes borrowed books", sortedAfterBorrow != null
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& sortedAfterBorrow.size() == 4 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B101".equals(sortedAfterBorrow.get(0).getIsbn())
                \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\&\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\& "B104".equals(sortedAfterBorrow.get(3).getIsbn()));

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nMISSING ISBN OPERATIONS");
        try {
            library.borrowBook("B999");
            check("Borrow missing ISBN rejected", false);
        } catch (IllegalArgumentException ex) {
            check("Borrow missing ISBN rejected", true);
        } catch (Exception ex) {
            check("Borrow missing ISBN rejected (wrong exception)", false);
        }
        try {
            library.returnBook("B999");
            check("Return missing ISBN rejected", false);
        } catch (IllegalArgumentException ex) {
            check("Return missing ISBN rejected", true);
        } catch (Exception ex) {
            check("Return missing ISBN rejected (wrong exception)", false);
        }
        check("Missing ISBN operations leave count unchanged", library.getBorrowedBookCount() == 3);
        check("Author search includes borrowed books", library.getBooksByAuthor("Robert Martin").size() == 2);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nDIRECT BOOK STATE VALIDATION");
        Book standalone = new Book("B200", "Standalone", "Test Author");
        standalone.borrowBook();
        check("Direct borrow changes state", !standalone.isAvailable());
        try {
            standalone.borrowBook();
            check("Direct double borrow rejected", false);
        } catch (IllegalStateException ex) {
            check("Direct double borrow rejected", true);
        } catch (Exception ex) {
            check("Direct double borrow rejected (wrong exception)", false);
        }
        standalone.returnBook();
        check("Direct return changes state", standalone.isAvailable());
        try {
            standalone.returnBook();
            check("Direct double return rejected", false);
        } catch (IllegalStateException ex) {
            check("Direct double return rejected", true);
        } catch (Exception ex) {
            check("Direct double return rejected (wrong exception)", false);
        }

System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nRESULT: " + passed + " PASSED, " + failed + " FAILED");
System.out.printf("FUNCTIONAL SCORE: %.2f / 25%n", 25.0 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* passed / (passed + failed));
    }
}

````

### org/howard/edu/lsp/midterm/crccards/Library.java

````java
package org.howard.edu.lsp.midterm.crccards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Maintains books by ISBN and enforces a library-wide borrowing limit.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Borrowing and returning library books must occur through this class.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @author Ngoc-Mai Huynh
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class Library {
    private static final int BORROW\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_LIMIT = 3;
    private final Map<String, Book> books = new TreeMap<>();

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Creates an empty library. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public Library() {
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Adds a book without replacing an existing ISBN.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param book the book to add
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalArgumentException if the ISBN is already present
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            throw new IllegalArgumentException("ISBN already exists.");
        }
        books.put(book.getIsbn(), book);
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Finds the stored book with the given ISBN.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param isbn the ISBN to find
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the stored book, or null if it is not found
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public Book findBook(String isbn) {
        return books.get(isbn);
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Borrows a book if it is available and the limit allows it.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param isbn the ISBN to borrow
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalArgumentException if the ISBN is not present
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalStateException if already borrowed or the limit is reached
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            throw new IllegalArgumentException("ISBN not found.");
        }
        if (getBorrowedBookCount() >= BORROW\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_LIMIT) {
            throw new IllegalStateException("Borrowing limit reached.");
        }
        book.borrowBook();
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Returns a borrowed book to the library.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param isbn the ISBN to return
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalArgumentException if the ISBN is not present
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @throws IllegalStateException if the book is already available
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book == null) {
            throw new IllegalArgumentException("ISBN not found.");
        }
        book.returnBook();
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Collects the available books.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return a new list of available books, or an empty list
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Finds all books with an exactly matching author name.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param author the case-sensitive author name
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return a new list of matching books, including borrowed books
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public List<Book> getBooksByAuthor(String author) {
        List<Book> matchingBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equals(author)) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Retrieves all books in ascending lexicographical ISBN order.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return a new sorted list, or an empty list if no books are stored
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public List<Book> getBooksSortedByIsbn() {
        return new ArrayList<>(books.values());
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Counts books that are currently borrowed.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the number of unavailable books in the library
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public int getBorrowedBookCount() {
        int count = 0;
        for (Book book : books.values()) {
            if (!book.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}

````

### org/howard/edu/lsp/midterm/crccards/doc/crccards.md

````markdown
# CRC explanation

Library collaborates with Book because its CRC responsibilities include maintaining the collection, finding books, and coordinating borrowing and returning. Book manages its own information and availability, so Library calls its public methods instead of changing its fields directly. Book does not need to know about Library because it can validate its own borrowing and returning state, even when used by itself. Library enforces the three-book limit because that rule depends on the state of the entire collection, which an individual Book does not know.

````

### org/howard/edu/lsp/midterm/design/doc/design.md

````markdown
# Proposed CRC cards

These cards separate enrollment information from tuition rules, storage, and communication. RegistrationService coordinates the steps, but the collaborators own the actual work. RegistrationRepository and ConfirmationSender are interfaces; the other entries are classes.

Class: Student

Responsibilities:
- Keep the student's ID, name, and email private.
- Validate required identifying and contact information.
- Provide controlled access to student details.

Collaborators: None.

Class: Course

Responsibilities:
- Store and validate the course code and credit hours.
- Provide course details needed for registration and tuition.

Collaborators: None.

Class: Registration

Responsibilities:
- Associate a Student with a Course.
- Store the agreed tuition amount and registration time.
- Preserve a valid enrollment record with controlled access to its information.

Collaborators: Student, Course.

Class: TuitionPolicy

Responsibilities:
- Own the per-credit rate and heavy-load discount rules.
- Calculate tuition using the credits being billed and the applicable total course load.
- Apply a consistent money rounding rule.

Collaborators: Course.

Class: RegistrationService

Responsibilities:
- Accept a Student, Course, and explicitly identified semester credit total.
- Request tuition from TuitionPolicy and create a Registration.
- Ask RegistrationRepository to save the record before requesting confirmation.
- Report storage and notification outcomes separately and request audit logging.

Collaborators: Student, Course, Registration, TuitionPolicy, RegistrationRepository, ConfirmationSender, AuditLogger.

Class: RegistrationRepository (interface)

Responsibilities:
- Define the operation for saving a Registration.
- Define how callers are informed of storage failures without exposing storage details.

Collaborators: Registration.

Class: FileRegistrationRepository

Responsibilities:
- Implement RegistrationRepository using a configured local file.
- Serialize registration details, close file resources, and report write failures.

Collaborators: RegistrationRepository, Registration.

Class: ConfirmationSender (interface)

Responsibilities:
- Define delivery of a confirmation for a saved Registration.
- Report delivery failures independently of persistence.

Collaborators: Registration.

Class: EmailConfirmationSender

Responsibilities:
- Implement ConfirmationSender by preparing and sending an email.
- Use the registered student's email address and report delivery errors.

Collaborators: ConfirmationSender, Registration, Student.

Class: RegistrationView

Responsibilities:
- Display registration details and the result returned by RegistrationService.
- Show accurate success, storage failure, or notification failure messages.

Collaborators: RegistrationService, Registration.

Class: AuditLogger

Responsibilities:
- Record the registration identifier details, event time, and outcome.
- Distinguish successful storage from failed storage or failed notification.

Collaborators: Registration.

The service receives its repository, sender, tuition policy, and logger through its constructor. Startup code supplies these collaborators. Student, Course, and Registration do not depend on the view, file format, or message-delivery mechanism. The current tuition rule remains 750 per billed credit with a 10 percent discount when the relevant load reaches 12 credits; the billed credits and semester load are passed explicitly so the rule is not accidentally applied to the wrong quantity.

````

### org/howard/edu/lsp/midterm/design/doc/design\_rationale.md

````markdown
# Evolving requirements and design rationale

The Part 2 design already separates saving and confirmation behind RegistrationRepository and ConfirmationSender. Startup code can read the deployment settings, construct the appropriate implementations, and pass them to RegistrationService. For example, one environment can use FileRegistrationRepository with EmailConfirmationSender, while another uses DatabaseRegistrationRepository with TextMessageConfirmationSender. The service still calls the same save and send operations, so it does not need repeated file/database or email/text conditionals.

I would add these CRC cards:

Class: DatabaseRegistrationRepository

Responsibilities:
- Implement RegistrationRepository by storing registration records in a database.
- Own database connections, parameterized statements, and transaction commit or rollback.
- Report persistence failures through the repository contract.

Collaborators: RegistrationRepository, Registration.

Class: TextMessageConfirmationSender

Responsibilities:
- Implement ConfirmationSender by preparing and sending a text confirmation.
- Validate that a usable phone destination exists and report delivery failures.

Collaborators: ConfirmationSender, Registration, Student.

I would update Student's card to include a private phone number and controlled validation and access for that contact method. EmailConfirmationSender would continue to require an email address, while TextMessageConfirmationSender would require a phone number. I would also update the repository and sender interface documentation to state that the new implementations follow the same success and failure contracts. The existing file and email cards remain valid, and RegistrationService keeps the same responsibilities and interface collaborators.

An important ownership decision is that each repository implementation manages its own storage resources. DatabaseRegistrationRepository should own transaction handling because it knows when a database operation can be committed or needs rollback. RegistrationService should only decide when to request a save and what to do with the result. This prevents database details from spreading into the registration workflow and keeps switching storage options practical.

The service requests confirmation only after a successful save. If delivery fails afterward, the enrollment remains saved and the result says that confirmation failed. This avoids treating a notification error as a failed enrollment or automatically inserting another record during a notification retry.

````

### org/howard/edu/lsp/midterm/design/doc/evaluation.md

````markdown
# Design evaluation

CourseRegistration combines several responsibilities and exposes its data directly. This makes a small example work, but it creates problems when the system needs to change.

1. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*Public fields weaken encapsulation.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Any caller can change studentId, studentName, email, courseCode, or creditHours without validation. For example, negative credit hours would produce negative tuition. Riel's heuristic 2.1 says data should be hidden within its class. Private fields and validated constructors or methods would give each object control over its state.

2. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*The class represents too many concepts.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Student information, course information, tuition rules, persistence, notifications, and output are all mixed together. Riel's heuristics 2.8 and 2.9 favor a focused abstraction with its related data and behavior together. Student should own student information, Course should own course information, and Registration should represent the enrollment connecting them. Changing a student's contact information should not require changing the tuition or file-writing code.

3. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*One method owns nearly all the work.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* registerStudent() calculates tuition, applies a discount, prints a confirmation, writes a file, simulates an email, and logs the event. This conflicts with Riel's heuristics 3.1 and 3.2 about distributing responsibilities and avoiding god classes. A registration service can coordinate the process, while collaborators perform tuition calculation, storage, and delivery. Otherwise, even an email change risks breaking registration or billing behavior.

4. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*Business logic depends on output and storage details.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* The method hard-codes registrations.txt and console output. Riel's heuristic 3.5 separates the model from the user interface. A view should display registration results, while a repository handles saving. Depending on small storage and notification interfaces would also make it easier to test the registration flow without writing actual files or sending messages.

5. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*Failure handling can misrepresent the result.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* The code prints confirmation before attempting to save. If saving fails, the broad catch prints a stack trace and execution still reaches the email and success-style log messages. A caller receives no clear failure result. The service should report a failed save and only confirm a successful registration after persistence succeeds. If a later notification fails, it should report that separately instead of implying that saving also failed. File handling should use try-with-resources so the writer closes even when writing throws an exception.

6. \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*Several domain details are unclear or fragile.\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* The rate of 750 and the 10 percent discount are embedded in the workflow. The meaning of creditHours is also unclear: a single course's credits are different from a student's total semester load. The improved design should make that distinction explicit before applying the discount. The email line only prints text, so it does not actually send an email. A real implementation should also define duplicate-registration handling and a consistent money representation and rounding rule.

References: Arthur J. Riel, \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*Object-Oriented Design Heuristics\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*, Addison-Wesley, 1996, chapters 2 and 3. Online excerpts consulted:

- https://www.oreilly.com/library/view/object-oriented-design-heuristics/020163385X/apa.html
- https://flylib.com/books/en/4.425.1.24/1/
- https://flylib.com/books/en/4.425.1.129/1/

````

### org/howard/edu/lsp/midterm/inheritance/Contractor.java

````java
package org.howard.edu.lsp.midterm.inheritance;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Represents a contractor paid a 15 percent premium on every hour.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @author Ngoc-Mai Huynh
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class Contractor extends Employee {
    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Creates a contractor.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hoursWorked the nonnegative hours worked
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hourlyRate the nonnegative hourly rate
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public Contractor(double hoursWorked, double hourlyRate) {
        super(hoursWorked, hourlyRate);
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Calculates hourly pay with a 15 percent premium.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return total pay
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    @Override
    public double calculatePay() {
        return getHoursWorked() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* getHourlyRate() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* 1.15;
    }
}

````

### org/howard/edu/lsp/midterm/inheritance/Driver.java

````java
package org.howard.edu.lsp.midterm.inheritance;
 
public class Driver {
    private static int passed = 0;
    private static int failed = 0;
 
    private static void check(String label, boolean condition) {
        if (condition) {
            passed++;
            System.out.println("PASS: " + label);
        } else {
            failed++;
            System.out.println("FAIL: " + label);
        }
    }
 
    private static boolean equal(double actual, double expected) {
        return Math.abs(actual - expected) < 0.000001;
    }
 
    private static void test(String label, Employee employee,
                             double expected) {
        try {
            check(label, equal(employee.calculatePay(), expected));
        } catch (Exception e) {
            check(label, false);
        }
    }
 
    public static void main(String\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\[] args) {
        test("Full-time 0 hours", new FullTimeEmployee(0, 20), 0);
        test("Full-time 30 hours", new FullTimeEmployee(30, 20), 600);
        test("Full-time 40 hours", new FullTimeEmployee(40, 20), 800);
        test("Full-time 45 hours", new FullTimeEmployee(45, 20), 950);
        test("Full-time 50 hours", new FullTimeEmployee(50, 10), 550);
        test("Part-time 0 hours", new PartTimeEmployee(0, 20), 0);
        test("Part-time 30 hours", new PartTimeEmployee(30, 20), 600);
        test("Part-time 45 hours", new PartTimeEmployee(45, 20), 900);
        test("Contractor 0 hours", new Contractor(0, 20), 0);
        test("Contractor 30 hours", new Contractor(30, 20), 690);
        test("Contractor 45 hours", new Contractor(45, 20), 1035);
        test("Contractor 40 hours", new Contractor(40, 10), 460);
        System.out.println("RESULT: " + passed + " PASSED, "
                           + failed + " FAILED");
    }
}

````

### org/howard/edu/lsp/midterm/inheritance/Employee.java

````java
package org.howard.edu.lsp.midterm.inheritance;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Provides shared employee pay data and a polymorphic pay operation.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @author Ngoc-Mai Huynh
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public abstract class Employee {
    private final double hoursWorked;
    private final double hourlyRate;

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Initializes the data shared by employee types.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hoursWorked the nonnegative number of hours worked
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hourlyRate the nonnegative hourly rate
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    protected Employee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Provides hours worked to subclasses.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return hours worked
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    protected double getHoursWorked() {
        return hoursWorked;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Provides the hourly rate to subclasses.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the hourly rate
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    protected double getHourlyRate() {
        return hourlyRate;
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Calculates pay according to the employee's type.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return the calculated pay
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public abstract double calculatePay();
}

````

### org/howard/edu/lsp/midterm/inheritance/FullTimeEmployee.java

````java
package org.howard.edu.lsp.midterm.inheritance;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Represents an employee who receives overtime pay beyond 40 hours.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @author Ngoc-Mai Huynh
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class FullTimeEmployee extends Employee {
    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Creates a full-time employee.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hoursWorked the nonnegative weekly hours worked
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hourlyRate the nonnegative hourly rate
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public FullTimeEmployee(double hoursWorked, double hourlyRate) {
        super(hoursWorked, hourlyRate);
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Calculates regular pay plus time-and-a-half for hours beyond 40.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return total weekly pay
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    @Override
    public double calculatePay() {
        double regularHours = Math.min(getHoursWorked(), 40.0);
        double overtimeHours = Math.max(getHoursWorked() - 40.0, 0.0);
        return regularHours \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* getHourlyRate()
                + overtimeHours \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* getHourlyRate() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* 1.5;
    }
}

````

### org/howard/edu/lsp/midterm/inheritance/PartTimeEmployee.java

````java
package org.howard.edu.lsp.midterm.inheritance;

/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Represents an employee paid the straight hourly rate for all hours.
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @author Ngoc-Mai Huynh
 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
public class PartTimeEmployee extends Employee {
    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Creates a part-time employee.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hoursWorked the nonnegative hours worked
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @param hourlyRate the nonnegative hourly rate
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    public PartTimeEmployee(double hoursWorked, double hourlyRate) {
        super(hoursWorked, hourlyRate);
    }

    /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* Calculates straight hourly pay without overtime.
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* @return total pay
     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*/
    @Override
    public double calculatePay() {
        return getHoursWorked() \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* getHourlyRate();
    }
}

````

