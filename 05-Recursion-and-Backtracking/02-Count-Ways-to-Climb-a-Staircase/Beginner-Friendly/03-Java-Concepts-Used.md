# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Base case
3. Recursive case
4. Methods
5. Conditional statements

## Expanded Explanation

### Recursion

A method calls itself with a smaller problem.

**General Example:**
```java
static int f(int n) { if (n == 0) return 1; return f(n - 1); }
```

### Base case

The base case stops recursive calls.

**General Example:**
```java
if (n == 0) return 1;
```

### Recursive case

The recursive case reduces the problem and calls the same method again.

**General Example:**
```java
return f(n - 1) + f(n - 2);
```

### Methods

Methods divide the solution into focused reusable operations.

**General Example:**
```java
static boolean isSafe(...) { }
```

### Conditional statements

Conditions decide whether a choice is valid.

**General Example:**
```java
if (isSafe(...)) { }
```
