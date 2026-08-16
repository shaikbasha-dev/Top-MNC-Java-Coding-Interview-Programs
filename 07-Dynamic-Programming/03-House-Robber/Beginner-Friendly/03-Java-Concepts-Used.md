# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. Optimal substructure
3. State transition
4. Math.max
5. Array

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### Optimal substructure

An optimal solution can be built from optimal solutions to smaller subproblems.

**General Example:**
```java
best = Math.max(previousBest, currentChoice);
```

### State transition

A transition calculates a new state from earlier states.

**General Example:**
```java
dp[i] = Math.max(dp[i-1], dp[i-2] + value);
```

### Math.max

Math.max returns the larger of two values.

**General Example:**
```java
int best = Math.max(a, b);
```

### Array

An array stores values using indexed positions.

**General Example:**
```java
int[] values = {1,2,3};
```
