# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Backtracking
3. Matrix
4. Boolean validation
5. State restoration

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

### Matrix

A matrix is a rectangular 2D arrangement of values.

**General Example:**
```java
char[][] board = new char[9][9];
```

### Boolean validation

A boolean method returns whether a condition is satisfied.

**General Example:**
```java
return isValid(board, row, col, digit);
```

### State restoration

Backtracking restores the previous state before trying another choice.

**General Example:**
```java
board[row][col] = 0;
```
