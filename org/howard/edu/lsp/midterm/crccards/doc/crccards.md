# CRC explanation

Library collaborates with Book because its CRC responsibilities include maintaining the collection, finding books, and coordinating borrowing and returning. Book manages its own information and availability, so Library calls its public methods instead of changing its fields directly. Book does not need to know about Library because it can validate its own borrowing and returning state, even when used by itself. Library enforces the three-book limit because that rule depends on the state of the entire collection, which an individual Book does not know.
