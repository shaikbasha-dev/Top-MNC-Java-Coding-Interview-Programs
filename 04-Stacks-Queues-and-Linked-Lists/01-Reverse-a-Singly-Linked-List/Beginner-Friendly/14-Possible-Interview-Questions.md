# 14 — Possible Interview Questions

## 1. What is the main idea?

**Answer:** Use the behavior of the selected data structure and maintain the correct invariant while processing the input.

**Example:** Explain the sample input and show the state after every major operation.

## 2. Why is this data structure appropriate?

**Answer:** It provides the ordering or access behavior required by the problem.

**Example:** A stack gives LIFO behavior, while a queue gives FIFO behavior.

## 3. What are the edge cases?

**Answer:** Empty input, one node, head/tail operations, duplicate values, invalid links and boundary conditions should be considered where applicable.

## 4. What is the time complexity?

**Answer:** See the complexity section and justify it by counting traversals and data-structure operations.

## 5. What is the space complexity?

**Answer:** Count additional collections, nodes, references and stack contents used beyond the input.

## 6. Can it be optimized?

**Answer:** Yes. Extra traversals or auxiliary collections can often be removed using two pointers, in-place reversal or a monotonic stack.

## 7. How would you explain it in an interview?

**Answer:** Start with the observation, define every important variable, explain the invariant, dry-run one example, then state time and space complexity.
