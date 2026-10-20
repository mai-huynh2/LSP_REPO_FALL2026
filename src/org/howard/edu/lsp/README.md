# Assignment 5: IntegerSet

Ngoc-Mai Huynh  
CSCI 363: Large Scale Programming  
Due: October 28, 2026, at 11:59 PM

## Overview

This assignment implements a Java class that represents a mathematical set of integers. The class supports basic set operations, subset and disjoint checks, and symmetric difference. Duplicate values are not allowed, and the internal data must remain encapsulated.

## Files

| File | Location |
| --- | --- |
| IntegerSet implementation | `src/org/howard/edu/lsp/assignment5/IntegerSet.java` |
| Instructor-provided driver, kept unchanged | `src/org/howard/edu/lsp/assignment5/Driver.java` |
| AI usage and external references report | `src/org/howard/edu/lsp/assignment5/doc/AI_Usage_Report.md` |
| Complete driver console output | `assignment5-output.txt` |

Both Java files must use the package `org.howard.edu.lsp.assignment5`.

## Required Behavior

| Method | Behavior |
| --- | --- |
| `clear()` | Removes all elements. |
| `length()` | Returns the number of elements. |
| `equals(IntegerSet b)` | Checks whether both sets contain the same elements, regardless of insertion order. |
| `contains(int value)` | Checks whether a value is present. |
| `largest()` | Returns the largest element; throws `IllegalStateException` if empty. |
| `smallest()` | Returns the smallest element; throws `IllegalStateException` if empty. |
| `add(int item)` | Adds an element, ignoring duplicates. |
| `remove(int item)` | Removes an element; does nothing if it is absent. |
| `union(IntegerSet b)` | Returns elements in either set. |
| `intersect(IntegerSet b)` | Returns elements shared by both sets. |
| `diff(IntegerSet b)` | Returns elements in the current set but not in `b`. |
| `complement(IntegerSet b)` | Returns elements in `b` but not in the current set. |
| `isSubsetOf(IntegerSet b)` | Checks whether every element of the current set is in `b`. |
| `isDisjoint(IntegerSet b)` | Checks whether the sets have no elements in common. |
| `symmetricDiff(IntegerSet b)` | Returns elements in exactly one of the two sets. |
| `isEmpty()` | Checks whether the set has no elements. |
| `toString()` | Returns elements in ascending order, formatted like `[-3, 0, 8, 15]`, or `[]` when empty. |

Every operation that returns an `IntegerSet` must create a new, independent result without changing either input set. An empty set is a subset of every set and is disjoint from every set.

The class and every public method require Javadoc. The `toString()` method must include `@Override`.

## Compile and Run

From the repository root, open PowerShell and run:

```powershell
New-Item -ItemType Directory -Force bin | Out-Null
javac -d bin src\org\howard\edu\lsp\assignment5\IntegerSet.java src\org\howard\edu\lsp\assignment5\Driver.java
if ($LASTEXITCODE -eq 0) {
    java -cp bin org.howard.edu.lsp.assignment5.Driver | Tee-Object -FilePath assignment5-output.txt
}
```

A Java Development Kit (JDK) is required. The commands compile the source files into `bin`, run the unchanged driver, and save its complete output to `assignment5-output.txt`.

If all driver tests pass, the summary will show:

```text
FUNCTIONAL SCORE: 92/92
TESTS PASSED: 47/47
```

These are the expected results for a fully passing implementation. The saved console output records the actual results. Javadoc is graded separately for 5 points, and the AI usage report is graded for 3 points.

## AI Usage and External References

https://chatgpt.com/share/6ad6db76-2440-83ea-8f0a-4fc82a9b7ebc

## Submission

Submit the source files in the required package structure, the completed AI usage report, and the full driver console output through the repository or ZIP submission. Keep `Driver.java` unchanged and retain earlier assignment folders in the repository. The generated `bin` folder is not needed.

No separate design rationale or implementation report is required.

