# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Backtracking
3. String
4. Substring
5. ArrayList

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

### String

String represents text and can be processed character by character.

**General Example:**
```java
char ch = text.charAt(0);
```

### Substring

substring extracts a portion of a string.

**General Example:**
```java
text.substring(start, end + 1);
```

### ArrayList

ArrayList is a resizable collection useful for a temporary current solution.

**General Example:**
```java
List<Integer> current = new ArrayList<>();
```
