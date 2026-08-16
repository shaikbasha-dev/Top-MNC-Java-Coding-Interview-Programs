# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Backtracking
3. ArrayList
4. Arrays
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

### ArrayList

ArrayList is a resizable collection useful for a temporary current solution.

**General Example:**
```java
List<Integer> current = new ArrayList<>();
```

### Arrays

An array stores values at indexed positions.

**General Example:**
```java
int[] numbers = {1,2,3};
```

### Conditional statements

Conditions decide whether a choice is valid.

**General Example:**
```java
if (isSafe(...)) { }
```
