# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `findFirst()`

### General Definition
Uses binary search but continues toward the left after finding the target.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
A normal binary search can stop at any matching occurrence; this method finds the first one.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `findLast()`

### General Definition
Uses binary search but continues toward the right after finding the target.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It identifies the final occurrence without scanning the whole duplicate block.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
