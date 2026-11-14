# Step Semester 3

Coursework for the STEP training programme, Semester 3, at SRM Institute of Science and Technology.

**Author:** Sajith Rayhan M (RA2511030010208)
**Language:** Java

## Contents

| Session | Topic | Programs | Code |
|:-------:|-------|:--------:|------|
| 1 | Strings | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_1/src/main/java/string_fundamentals) |
| 2 | String operations | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_2/src/main/java/string_operations) |
| 4 | Programming fundamentals and arrays | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_4/src/main/java/programming_fundamentals) |
| 5 | Arrays and methods | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_5/src/main/java/arrays_methods) |
| 6 | Classes and objects revision | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_6/src/main/java/classes_objects) |
| 7 | Encapsulation | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_7/src/main/java/encapsulation) |
| 8 | Inheritance and polymorphism | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_8/src/main/java/inheritance_polymorphism) |
| 9 | Abstraction and interfaces | 10 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_9/src/main/java/abstraction_interface) |
| 10 | Data structures foundations | 15 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_10/src/main/java/data_structures) |
| 11 | Searching and sorting | 15 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_11/src/main/java/sorting_and_searching) |
| 12 | Linked lists and stacks | 11 | [Open](https://github.com/sajithrayhan/Step_semester_3/tree/feature/session_12/src/main/java/linked_lists_and_stacks) |

Session 3 was an introduction with no problems to submit.

## How the Repository Is Organised

The repository follows the branching model from the STEP GitHub structure guide.

| Branch | Purpose |
|--------|---------|
| main | Documentation and daily progress log (this README only) |
| develop | Empty Java project skeleton |
| feature/session_n | Solved problems for session n, created from develop |

Inside each feature branch the code is grouped by topic. Every topic contains two sub-packages:

- `class_problems`: practice problems from the class session.
- `assigment_problems`: take-home assignment problems (the spelling follows the guide).

## Running the Code

Open the repository in VS Code with the Java Extension Pack, check out a feature branch, and run any class with a `main` method. From a terminal:

```bash
git checkout feature/session_9
javac -d out $(find src -name "*.java")
java -cp out abstraction_interface.class_problems.GardenPlotAreaReport
```

---

## Date: 14-11-2026

**Today's Work:**
- Session 12: Campus staff salary, class report card, library return desk (stack and circular queue), payment processing, weekly rainfall analysis, hostel electricity bill (class problems); bus route stops, late comers in the line, book copy finder, cancel a booking, plate stack on a chain (assignment problems, all on a hand-written linked list).
- Every program was compiled and run against the sample input and output given in its problem statement.
- Time and space complexity of each solution is stated in the code comments, as the problems ask.

**Next Session Plan:**
- Attend the Final Assessment on 14-11-2026 and review the topics that need more practice afterwards.

**Issues Faced:**
- The five Week 12 homework assignments share one title in Classroom, so each was matched to its question by the attached PDF name.

---

## Date: 13-11-2026

**Today's Work:**
- Session 11: Library catalog lookup (binary search), warehouse bin grid scan, transaction duplicate check, employee ID lookup, pair with target sum, best single trade profit, insert position, spiral order traversal, pair sum in a sorted array, remove duplicates in place, with quiz and concept answers; height line-up (bubble sort), prize table (selection sort), library book shelf (insertion sort), queue order check, dice throw tally (counting sort).
- Every program was compiled and run against the sample input and output given in its problem statement, and the homework programs were also run on inputs of my own.
- Complexity of each solution is stated in the code comments, as the problems ask.

**Next Session Plan:**
- Prepare for the Final Assessment on 14-11-2026 by revising all topics up to sorting and searching.

**Issues Faced:**
- The Week 11 homework PDFs repeat earlier problems on each page, so each problem was identified from the page that introduces it.

---

## Date: 10-10-2026

**Today's Work:**
- Completed the class problems and assignment problems for Sessions 1, 2, 4, 5, 6, 7, 8, 9 and 10, one feature branch per session.
- Session 10: Vowel and consonant counter, word reverser and palindrome checker, even and odd counts, in-place array reversal, digit sum and reversal, prime checker, factorial, grade assignment, leap year detector, student result cards, with quiz and concept answers; busiest bus row, class attendance tracker, duty roster rotation, exam score band counter, second-best score (with complexity analysis).
- Session 9: Garden plot report, staff pay, library fines, electricity billing, travel booking; movie tickets, parcel shipping, college fees, cab fares, appliance energy report; quiz and concept answers.
- Session 8: Payment fees, library due dates, delivery fees, exam grader, transport fares; canteen billing, parking, hostel electricity, festival bonus, streaming renewals; quiz and concept answers.
- Session 7: Piggy bank, scorecard, name tag, locker, attendance sheet; health bar, playlist, password checker, traffic light, shopping cart.
- Session 6: Placement records, mess wallet, course credits, ID card references, static college data; library inventory, payroll, employee profiles, hall ticket references, static company data.
- Session 5: Score curve, duplicate finder, top three podium, grid classification, ranking engines.
- Session 4: Two Sum, stock profit, duplicates, merge, rotate; product except self, maximum subarray, 3Sum, subarray sum, rotated array minimum.
- Session 2: CSV parsing, extension validation, phone masking, reference validation; PIN check, word reversal, ISBN validation, word frequency.
- Session 1: Rock paper scissors, palindromes, BMI report, first non-repeating character, name reversal; seat duplicates, typing accuracy, signal streaks, inventory balance, word lengths.
- Every program was compiled and run against the sample input and output given in its problem statement.

**Next Session Plan:**
- Revise Week 1 to Week 10 topics for the assessment test.
- Add the next weekly problems on a new feature branch created from develop.

**Issues Faced:**
- The Week 8 delivery fee sample output in the problem PDF does not match its own pricing rules (the rules give 24.00 and 145.00, the sample shows 29.00 and 155.00). The solution follows the written rules.
- The Week 5 ranking problems leave the thresholds and scoring formula open, so these were derived from the sample outputs.
- Classroom pages loaded very slowly during Week 10 submission, so a few submissions needed retries.

---
