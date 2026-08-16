# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. Subsequence
3. DP array
4. Nested loops
5. Math.max

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### Subsequence

A subsequence preserves order but may skip elements.

**General Example:**
```java
[2,5,7] is a subsequence of [2,3,5,7].
```

### DP array

A DP array stores the answer for smaller states.

**General Example:**
```java
dp[i] = dp[i - 1] + dp[i - 2];
```

### Nested loops

Nested loops process pairs of dimensions such as items and capacity.

**General Example:**
```java
for (int i=1; i<=n; i++) for (int j=1; j<=m; j++) { }
```

### Math.max

Math.max returns the larger of two values.

**General Example:**
```java
int best = Math.max(a, b);
```
