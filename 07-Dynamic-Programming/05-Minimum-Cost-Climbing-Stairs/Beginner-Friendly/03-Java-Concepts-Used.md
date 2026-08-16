# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. State definition
3. State transition
4. Math.min
5. Array

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### State definition

A DP state precisely describes what the stored value means.

**General Example:**
```java
dp[i] = minimum cost to reach step i.
```

### State transition

A transition calculates a new state from earlier states.

**General Example:**
```java
dp[i] = Math.max(dp[i-1], dp[i-2] + value);
```

### Math.min

Math.min returns the smaller value.

**General Example:**
```java
int best = Math.min(a, b);
```

### Array

An array stores values using indexed positions.

**General Example:**
```java
int[] values = {1,2,3};
```
