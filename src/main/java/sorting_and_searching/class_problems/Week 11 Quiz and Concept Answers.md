# Week 11: Data Structures, Searching and Sorting (Category C)

## Part B: Quiz Answers

| Question | Answer | Reason |
|----------|--------|--------|
| 1 | B | A data structure defines how data is organised, stored and accessed efficiently for specific operations. |
| 2 | D | A non-primitive structure is built from primitive types and holds a collection of values. |
| 3 | C | Array access by a known index is O(1). |
| 4 | C | A loop nested inside another loop, each running n times, is O(n squared). |
| 5 | B | Two independent loops add up: O(m + n). |
| 6 | A, C, D | Deletion, traversal and updating are data structure operations. Debugging and compilation are not. |
| 7 | C | Sorting by date lets queries use binary search, which is O(log n). |
| 8 | D | A sorted array gives fast ordered searching, and inserts and deletes are rare. |
| 9 | C | Two pointers work best on sorted or otherwise ordered arrays, avoiding brute-force comparison. |
| 10 | C | A sliding window avoids recomputing overlapping subproblems, reducing O(n * k) or O(n squared) to O(n). |

## Part C: Concept Answers

**1. Primitive and non-primitive data structures.**
A primitive data structure holds a single basic value and is built into the language, such as an `int`, `char` or `boolean`. A non-primitive data structure is built from primitives and stores a collection of values, with operations to organise them. For example, a `boolean` flag (primitive) versus a `Stack` of undo actions in a text editor (non-primitive).

**2. Is a linked list non-linear?**
The reasoning is incorrect. Linear or non-linear describes how elements are logically arranged, not where they sit in memory. In a linked list every element has exactly one next element (and one previous in a doubly linked list), forming a single sequence, so it is linear. Non-linear structures such as trees and graphs let one element connect to many. Non-contiguous memory only changes the physical layout, not the logical order.

**3. O(m + n) versus nested loops.**
Two independent loops run one after the other, so their costs add: m steps for `listA` plus n steps for `listB`, giving O(m + n). When one loop is nested inside the other, the inner loop runs fully for every pass of the outer loop, so the costs multiply: m times n, giving O(m * n). The rule is that sequential work adds and nested work multiplies.

**4. Trading memory for time.**
A web application that serves a user profile on every page load can keep recently used profiles in an in-memory cache (a hash map keyed by user ID). The memory cost is higher, but each lookup becomes O(1) on average instead of a slow database or disk query. Space is being traded for time, because the operation is frequent and speed matters more than the extra memory.

**5. Hash map versus sorted array for employee records.**
- Hash map: access, search, insert and delete are O(1) on average (O(n) in the worst case), but the elements are not kept in any order.
- Sorted array: search is O(log n) with binary search and access by index is O(1), the data stays ordered for range queries and sorted listing, but insert and delete are O(n) because elements must shift.

If the main operation is looking up one employee by ID with frequent additions, a hash map is better. If searches dominate, the data rarely changes and ordered results or range queries are needed, a sorted array is better.
