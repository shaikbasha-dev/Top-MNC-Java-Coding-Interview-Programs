# 03 — Java Concepts Used

## Concepts List

1. Recursion
2. Backtracking
3. Arrays
4. Swap operation
5. Loops

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

### Arrays

An array stores values at indexed positions.

**General Example:**
```java
int[] numbers = {1,2,3};
```

### Swap operation

Swapping exchanges two array elements to generate different arrangements.

**General Example:**
```java
int temp=a[i]; a[i]=a[j]; a[j]=temp;
```

### Loops

Loops repeat a block for multiple candidates or positions.

**General Example:**
```java
for (int i=0; i<3; i++) { }
```
