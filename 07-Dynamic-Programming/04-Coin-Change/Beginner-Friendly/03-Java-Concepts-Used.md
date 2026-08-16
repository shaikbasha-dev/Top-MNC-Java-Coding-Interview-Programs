# 03 — Java Concepts Used

## Concepts List

1. Dynamic programming
2. Minimum optimization
3. Sentinel value
4. Math.min
5. Nested loops

## Expanded Explanation

### Dynamic programming

Dynamic programming solves overlapping subproblems by storing results so they are not recalculated.

**General Example:**
```java
int[] dp = new int[n + 1];
```

### Minimum optimization

The algorithm chooses the smallest valid cost.

**General Example:**
```java
answer = Math.min(answer, candidate);
```

### Sentinel value

A sentinel represents an initially unreachable or special state.

**General Example:**
```java
Arrays.fill(dp, amount + 1);
```

### Math.min

Math.min returns the smaller value.

**General Example:**
```java
int best = Math.min(a, b);
```

### Nested loops

Nested loops process pairs of dimensions such as items and capacity.

**General Example:**
```java
for (int i=1; i<=n; i++) for (int j=1; j<=m; j++) { }
```
