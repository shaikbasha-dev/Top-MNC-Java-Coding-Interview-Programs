# Expert Problem Approach — Spiral Traversal of a Matrix

## Problem Interpretation

Print all elements of a matrix in spiral order, moving across the top, down the right, across the bottom, and up the left.

## Key Observation

The expert solution looks for repeated work in the beginner solution and removes it where possible.

## Optimized Thinking

1. Identify the information that must be maintained.
2. Process the input in the most useful direction.
3. Avoid recalculating information that is already known.
4. Maintain an invariant that remains true during the traversal.
5. Produce the result after the necessary values have been processed.

## Interview Explanation

A strong interview answer should first explain the simple approach and then explain why the optimized approach performs less unnecessary work.

## Important Note

Optimization does not mean making the code difficult to read. The goal is to reduce unnecessary time or memory while keeping the algorithm correct and explainable.
