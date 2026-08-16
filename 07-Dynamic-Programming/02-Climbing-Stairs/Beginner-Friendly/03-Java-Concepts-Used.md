# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. DP array
3. State definition
4. Recurrence relation
5. Initialization

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

### State definition

A DP state precisely describes what the stored value means.

**General Example:**
```java
dp[i] = minimum cost to reach step i.
```

### Recurrence relation

A recurrence describes how a current answer is built from previous answers.

**General Example:**
```java
dp[i] = dp[i - 1] + dp[i - 2];
```

### Initialization

Initialization sets states whose answers are known immediately.

**General Example:**
```java
dp[0] = 1;
```
