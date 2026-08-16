# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Backtracking
3. Two-dimensional arrays
4. String
5. Conditional statements

## Expanded Explanation

### Recursion

A method calls itself with a smaller problem.

**General Example:**
```java
static int f(int n) { if (n == 0) return 1; return f(n - 1); }
```

### Backtracking

Backtracking makes a choice, explores it, then reverses the choice.

**General Example:**
```java
current.add(x); solve(); current.remove(current.size()-1);
```

### Two-dimensional arrays

A 2D array represents rows and columns, useful for grids and boards.

**General Example:**
```java
int[][] board = new int[4][4];
```

### String

String represents text and can be processed character by character.

**General Example:**
```java
char ch = text.charAt(0);
```

### Conditional statements

Conditions decide whether a choice is valid.

**General Example:**
```java
if (isSafe(...)) { }
```
