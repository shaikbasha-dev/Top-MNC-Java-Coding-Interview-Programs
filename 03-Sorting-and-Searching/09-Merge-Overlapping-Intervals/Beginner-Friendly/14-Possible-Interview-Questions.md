# 14 — Possible Interview Questions and Answers

## 1. What is the main idea of Merge Overlapping Intervals?

**Answer:** Overlapping intervals are intervals whose ranges intersect. The task is to combine all overlapping intervals into non-overlapping ranges.

**Example:** Use the sample input from this program and explain how each major algorithmic decision moves the input toward the final answer.

## 2. Why is this algorithm suitable for the problem?

**Answer:** It uses the structural property of the input instead of blindly checking every possibility.

**Example:** If the data is sorted, binary search can eliminate half of the remaining range after each comparison.

## 3. What is the time complexity?

**Answer:** The complexity depends on the exact implementation. The complexity analysis file for this program gives the expected beginner and expert bounds.

**Example:** Explain how many times the main loop, recursion level, or sorting operation executes.

## 4. What is the space complexity?

**Answer:** It is the additional memory used by temporary arrays, recursion, collections, or other auxiliary structures.

**Example:** A recursive divide-and-conquer algorithm may require stack space even when the input array itself is not copied.

## 5. What edge cases should be handled?

**Answer:** Empty input, one element, duplicate values, boundary indexes, already sorted input, reverse-sorted input, and values at the extremes should be considered where relevant.

**Example:** Searching for a value that does not exist should return a clearly defined result such as `-1`.

## 6. Can the solution be optimized?

**Answer:** Yes. The expert implementation uses the most useful property of the problem to reduce unnecessary work.

**Example:** Replace a full sort with a heap when only a Kth largest value is required.

## 7. What happens if the input violates the problem's assumptions?

**Answer:** The algorithm may no longer be correct or may require additional validation.

**Example:** A binary-search solution requires the relevant data to be sorted according to its stated assumptions.

## 8. How would you explain this code to an interviewer?

**Answer:** Explain the variables, invariant, main loop or recursion, termination condition, result calculation and complexity in that order.

**Example:** For every pointer, state what region of the array it represents and why moving it is safe.
