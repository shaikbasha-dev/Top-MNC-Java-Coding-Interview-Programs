# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. Two-dimensional DP
3. 0/1 choice
4. Capacity state
5. Math.max

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### Two-dimensional DP

A 2D table stores states that depend on two variables.

**General Example:**
```java
int[][] dp = new int[n + 1][capacity + 1];
```

### 0/1 choice

Each item can be selected at most once.

**General Example:**
```java
include item OR exclude item.
```

### Capacity state

A capacity dimension records how much capacity remains or is available.

**General Example:**
```java
dp[i][w]
```

### Math.max

Math.max returns the larger of two values.

**General Example:**
```java
int best = Math.max(a, b);
```
