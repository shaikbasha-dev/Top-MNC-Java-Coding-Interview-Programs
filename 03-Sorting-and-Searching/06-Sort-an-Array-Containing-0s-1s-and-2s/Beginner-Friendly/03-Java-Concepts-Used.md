# 03 — Java Concepts Used

## Concepts List

1. Arrays
2. Two-pointer technique
3. Dutch National Flag algorithm
4. Loops
5. Swapping
6. Conditional statements

## Expanded Explanation

### Arrays

An array stores multiple values of the same type using indexes.

**General Example:**
```java
int[] a = {3, 1, 2};
```

### Two-pointer technique

Two or more indexes move through the data while maintaining regions or boundaries.

**General Example:**
```java
int low=0, high=n-1;
```

### Dutch National Flag algorithm

This partitions 0s, 1s and 2s into three regions using three pointers.

**General Example:**
```java
0-region | 1-region | unknown | 2-region
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

### Conditional statements

Conditions choose the correct branch based on the current data.

**General Example:**
```java
if (a[i] < target) { }
```
