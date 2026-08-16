# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. String
3. Two-dimensional DP
4. Character comparison
5. Math.max

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### String

A String stores a sequence of characters.

**General Example:**
```java
String text = "hello";
```

### Two-dimensional DP

A 2D table stores states that depend on two variables.

**General Example:**
```java
int[][] dp = new int[n + 1][capacity + 1];
```

### Character comparison

Characters can be compared to decide whether a DP transition follows a matching case.

**General Example:**
```java
if (first.charAt(i-1) == second.charAt(j-1))
```

### Math.max

Math.max returns the larger of two values.

**General Example:**
```java
int best = Math.max(a, b);
```
