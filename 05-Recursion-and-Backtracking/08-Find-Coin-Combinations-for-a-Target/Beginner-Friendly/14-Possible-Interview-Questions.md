# 14 — Possible Interview Questions

## 1. What is recursion?

**Answer:** Recursion is a technique in which a method calls itself on a smaller problem until a base case is reached.

**Example:**
```java
static void countDown(int n) {
    if (n == 0) return;
    System.out.println(n);
    countDown(n - 1);
}
```

## 2. What is the base case?

**Answer:** The base case is the condition that stops recursive calls.

**Example:** `if (index == numbers.length) return;`

## 3. What is backtracking?

**Answer:** Backtracking makes a choice, explores it recursively, and then undoes the choice before trying another branch.

**Example:** `add -> recurse -> remove`.

## 4. Why is state restoration necessary?

**Answer:** It prevents a choice from one branch from affecting another branch.

## 5. What happens without a base case?

**Answer:** Recursive calls continue until the program exhausts the call stack and throws `StackOverflowError`.

## 6. Can recursion be optimized?

**Answer:** Depending on the problem, memoization, pruning, dynamic programming, bit manipulation or more efficient validation can remove repeated work.

## 7. How should this be explained in an interview?

**Answer:** Draw the decision tree, identify the base case, explain each choice, show the recursive call, explain the undo operation, then state complexity.
