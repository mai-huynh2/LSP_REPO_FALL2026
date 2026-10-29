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
