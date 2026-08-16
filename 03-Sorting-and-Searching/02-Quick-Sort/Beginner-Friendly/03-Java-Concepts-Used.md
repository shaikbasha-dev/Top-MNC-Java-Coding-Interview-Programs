# 03 — Java Concepts Used

## Concepts List

1. Class and main method
2. Arrays
3. Recursion
4. Divide and conquer
5. Pivot
6. Partitioning
7. Loops
8. Swapping

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

### Pivot

A pivot is the reference value used to partition an array in Quick Sort.

**General Example:**
```java
int pivot = a[high];
```

### Partitioning

Partitioning rearranges data so elements fall into logical groups around a boundary.

**General Example:**
```java
small values | pivot | large values
```

### Loops

Loops repeat processing for multiple values.

**General Example:**
```java
for (int i = 0; i < a.length; i++) { }
```

### Swapping

Swapping exchanges two values.

**General Example:**
```java
int t=a[i]; a[i]=a[j]; a[j]=t;
```
