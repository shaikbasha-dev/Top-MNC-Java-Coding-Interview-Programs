# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `quickSort()`

### General Definition
Recursively sorts the portions on both sides of the pivot.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It breaks the complete sorting task into smaller sorting tasks.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `partition()`

### General Definition
Places the chosen pivot into its correct final position.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It separates smaller and larger values around the pivot.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
