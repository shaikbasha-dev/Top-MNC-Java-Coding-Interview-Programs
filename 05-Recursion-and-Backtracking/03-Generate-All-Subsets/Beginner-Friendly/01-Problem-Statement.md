# 01 — Problem Statement

## Complete Question

Write a Java program to **Generate all subsets**.

The program must explore the required possibilities using recursion or backtracking, correctly stop at the base case, restore state when necessary, handle boundary conditions, and produce the required result.

### Sample Input

```text
numbers = [1, 2, 3]
```

### Expected Output

```text
[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]
```

## Step-by-Step Understanding

1. Understand the input and required result.
2. Identify the smaller version of the same problem.
3. Define the base case that stops recursion.
4. Define the recursive or backtracking choices.
5. Make a choice and explore it.
6. Restore the state when the choice must be undone.
7. Continue until all required possibilities are processed.
8. Display the result.
