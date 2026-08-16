# 03 — Java Concepts Used

## Concepts List

1. Class and main method
2. Arrays
3. Recursion
4. Divide and conquer
5. Loops
6. Conditional statements
7. Methods
8. Temporary arrays

## Expanded Explanation

### Class and main method

A class groups the program and the main method is where execution starts.

**General Example:**
```java
public static void main(String[] args) { }
```

### Arrays

An array stores multiple values of the same type using indexes.

**General Example:**
```java
int[] a = {3, 1, 2};
```

### Recursion

A method calls itself on a smaller part of the same problem.

**General Example:**
```java
sort(a, left, middle);
```

### Divide and conquer

Break a large problem into smaller independent subproblems, solve them, then combine the results.

**General Example:**
```java
Divide -> Solve -> Combine
```

### Loops

Loops repeat processing for multiple values.

**General Example:**
```java
for (int i = 0; i < a.length; i++) { }
```

### Conditional statements

Conditions choose the correct branch based on the current data.

**General Example:**
```java
if (a[i] < target) { }
```

### Methods

Methods isolate a logical task and make code easier to test and explain.

**General Example:**
```java
static int solve(...) { }
```

### Temporary arrays

Temporary arrays hold intermediate data during merging.

**General Example:**
```java
int[] temp = new int[5];
```
