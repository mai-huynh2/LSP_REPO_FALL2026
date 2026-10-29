# Design evaluation

CourseRegistration combines several responsibilities and exposes its data directly. This makes a small example work, but it creates problems when the system needs to change.

1. **Public fields weaken encapsulation.** Any caller can change studentId, studentName, email, courseCode, or creditHours without validation. For example, negative credit hours would produce negative tuition. Riel's heuristic 2.1 says data should be hidden within its class. Private fields and validated constructors or methods would give each object control over its state.

2. **The class represents too many concepts.** Student information, course information, tuition rules, persistence, notifications, and output are all mixed together. Riel's heuristics 2.8 and 2.9 favor a focused abstraction with its related data and behavior together. Student should own student information, Course should own course information, and Registration should represent the enrollment connecting them. Changing a student's contact information should not require changing the tuition or file-writing code.

3. **One method owns nearly all the work.** registerStudent() calculates tuition, applies a discount, prints a confirmation, writes a file, simulates an email, and logs the event. This conflicts with Riel's heuristics 3.1 and 3.2 about distributing responsibilities and avoiding god classes. A registration service can coordinate the process, while collaborators perform tuition calculation, storage, and delivery. Otherwise, even an email change risks breaking registration or billing behavior.

4. **Business logic depends on output and storage details.** The method hard-codes registrations.txt and console output. Riel's heuristic 3.5 separates the model from the user interface. A view should display registration results, while a repository handles saving. Depending on small storage and notification interfaces would also make it easier to test the registration flow without writing actual files or sending messages.

5. **Failure handling can misrepresent the result.** The code prints confirmation before attempting to save. If saving fails, the broad catch prints a stack trace and execution still reaches the email and success-style log messages. A caller receives no clear failure result. The service should report a failed save and only confirm a successful registration after persistence succeeds. If a later notification fails, it should report that separately instead of implying that saving also failed. File handling should use try-with-resources so the writer closes even when writing throws an exception.

6. **Several domain details are unclear or fragile.** The rate of 750 and the 10 percent discount are embedded in the workflow. The meaning of creditHours is also unclear: a single course's credits are different from a student's total semester load. The improved design should make that distinction explicit before applying the discount. The email line only prints text, so it does not actually send an email. A real implementation should also define duplicate-registration handling and a consistent money representation and rounding rule.

References: Arthur J. Riel, *Object-Oriented Design Heuristics*, Addison-Wesley, 1996, chapters 2 and 3. Online excerpts consulted:

- https://www.oreilly.com/library/view/object-oriented-design-heuristics/020163385X/apa.html
- https://flylib.com/books/en/4.425.1.24/1/
- https://flylib.com/books/en/4.425.1.129/1/
