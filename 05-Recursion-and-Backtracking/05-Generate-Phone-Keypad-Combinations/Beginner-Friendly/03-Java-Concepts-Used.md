# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Backtracking
3. String
4. StringBuilder
5. Character arithmetic

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

### StringBuilder

StringBuilder allows efficient modification of a mutable character sequence.

**General Example:**
```java
StringBuilder current = new StringBuilder();
```

### Character arithmetic

Digit characters can be converted to indexes by subtracting '0'.

**General Example:**
```java
int digit = ch - '0';
```
