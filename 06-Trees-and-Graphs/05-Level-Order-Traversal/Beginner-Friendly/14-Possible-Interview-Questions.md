# 14 — Possible Interview Questions

## 1. What is the main idea?

**Answer:** Process the tree or graph according to the required traversal/search rule while maintaining the correct state.

**Example:** In BFS, use a queue; in DFS, use recursion or a stack.

## 2. Why is this data structure appropriate?

**Answer:** Trees naturally support recursive child processing, while graphs require explicit neighbor relationships and visited tracking.

## 3. What is the base case?

**Answer:** Usually a null tree node or an already visited graph vertex condition stops unnecessary processing.

## 4. Why is a visited array needed in graphs?

**Answer:** Graphs can contain cycles and multiple paths to the same vertex. Visited tracking prevents repeated processing.

## 5. What is the time complexity?

**Answer:** Tree traversals are generally O(n). Graph BFS/DFS is O(V + E).

## 6. Can the solution be optimized?

**Answer:** Choose the correct representation and avoid repeated traversals. For example, diameter and balanced-tree checks can combine height calculation with the required result.

## 7. How would you explain this in an interview?

**Answer:** Draw the structure, define the traversal/search rule, explain the base case, walk through one example, and state time and space complexity.
