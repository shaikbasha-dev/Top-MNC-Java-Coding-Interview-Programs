# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `search()`

### General Definition
Performs modified binary search and determines which half is sorted at each step.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
A normal binary search assumes the whole range is sorted; rotation requires modified logic.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
