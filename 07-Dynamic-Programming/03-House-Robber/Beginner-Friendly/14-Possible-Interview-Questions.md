# 14 — Possible Interview Questions

## 1. What is Dynamic Programming?

**Answer:** Dynamic Programming solves problems by storing results of smaller overlapping subproblems and reusing those results.

**Example:** Fibonacci values can be stored in `dp[]` instead of recalculated repeatedly.

## 2. What are the two major properties needed for DP?

**Answer:** Overlapping subproblems and optimal substructure.

**Example:** In House Robber, the best answer at one house depends on best answers from earlier houses.

## 3. What is a DP state?

**Answer:** A DP state precisely describes what a stored value represents.

**Example:**
```java
dp[i] = the answer for the first i elements
```

## 4. What is a state transition?

**Answer:** It is the rule used to calculate a state from previously calculated states.

**Example:**
```java
dp[i] = dp[i - 1] + dp[i - 2];
```

## 5. What is memoization?

**Answer:** Memoization is top-down DP. Recursive calls are made, but their results are stored and reused.

## 6. What is tabulation?

**Answer:** Tabulation is bottom-up DP. States are calculated iteratively starting from base cases.

## 7. Why is DP usually faster than naive recursion?

**Answer:** Naive recursion may solve the same subproblem many times. DP stores each subproblem result and reuses it.

## 8. Can DP space be optimized?

**Answer:** Yes. If the current state depends only on a few previous states, a full table can sometimes be replaced by a few variables.

## 9. How should this problem be explained in an interview?

**Answer:** Define the state, explain the base cases, derive the transition, demonstrate a small example, and state time and space complexity.
