# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `sort()`

### General Definition
Orders the array so nearby values are adjacent.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
After sorting, the minimum difference must occur between adjacent values.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `abs()`

### General Definition
Returns the non-negative absolute value of a number.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It expresses the difference as a distance rather than a signed value.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
