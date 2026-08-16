# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. Boolean DP
3. Include/exclude choice
4. Two-dimensional array
5. State transition

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### Boolean DP

A boolean DP table stores whether a state is possible.

**General Example:**
```java
boolean[][] dp = new boolean[n + 1][target + 1];
```

### Include/exclude choice

For each item, consider taking it or skipping it.

**General Example:**
```java
dp[i][sum] = dp[i-1][sum] || dp[i-1][sum-value];
```

### Two-dimensional array

A two-dimensional array stores values in rows and columns.

**General Example:**
```java
int[][] table = new int[rows][columns];
```

### State transition

A transition calculates a new state from earlier states.

**General Example:**
```java
dp[i] = Math.max(dp[i-1], dp[i-2] + value);
```
