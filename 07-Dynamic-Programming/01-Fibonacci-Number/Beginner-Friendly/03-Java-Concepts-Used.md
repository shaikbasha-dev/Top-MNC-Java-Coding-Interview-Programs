# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. DP array
3. Base case
4. Recurrence relation
5. Loop

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### DP array

A DP array stores the answer for smaller states.

**General Example:**
```java
dp[i] = dp[i - 1] + dp[i - 2];
```

### Base case

Initial states provide known answers before transitions are calculated.

**General Example:**
```java
dp[0] = 0;
```

### Recurrence relation

A recurrence describes how a current answer is built from previous answers.

**General Example:**
```java
dp[i] = dp[i - 1] + dp[i - 2];
```

### Loop

A loop fills DP states in an order where required previous states are already known.

**General Example:**
```java
for (int i = 2; i <= n; i++) { }
```
