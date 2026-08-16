# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. Edit operations
3. Two-dimensional DP
4. Character comparison
5. Math.min

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### Edit operations

Edit distance commonly uses insertion, deletion and replacement.

**General Example:**
```java
insert, delete, replace
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

### Math.min

Math.min returns the smaller value.

**General Example:**
```java
int best = Math.min(a, b);
```
