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
