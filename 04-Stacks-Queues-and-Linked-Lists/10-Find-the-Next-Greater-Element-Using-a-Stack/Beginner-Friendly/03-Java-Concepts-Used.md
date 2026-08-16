# 03 — Java Concepts Used

## Concepts List

1. Stack
2. Monotonic stack
3. Arrays
4. LIFO
5. while loop

## Expanded Explanation

### Stack

A LIFO data structure.

**General Example:**
```java
stack.push(10); stack.pop();
```

### Monotonic stack

A stack maintained in an ordered form while scanning values.

**General Example:**
```java
while (!stack.isEmpty() && stack.peek() <= x) stack.pop();
```

### Arrays

An indexed collection of values.

**General Example:**
```java
int[] a = {4,5,2};
```

### LIFO

Last In, First Out.

**General Example:**
```java
20 enters last, so 20 leaves first.
```

### while loop

Repeats a block while a condition is true.

**General Example:**
```java
while (current != null) { current = current.next; }
```
