# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `search()`

### General Definition
Starts at the top-right cell and eliminates one row or one column at every step.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It uses both row-wise and column-wise ordering to avoid checking every cell.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
