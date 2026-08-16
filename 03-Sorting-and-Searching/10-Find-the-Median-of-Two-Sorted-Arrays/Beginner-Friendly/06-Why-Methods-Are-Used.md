# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `findMedian()`

### General Definition
Finds a valid partition between two sorted arrays and derives the median from the boundary values.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It solves the problem without fully merging the arrays.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `max()/min()`

### General Definition
Selects the correct partition boundary values.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
The median depends on the largest left-side value and smallest right-side value.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
