# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `sort()`

### General Definition
Sorts interval rows by their starting value.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
Sorting makes overlapping intervals appear next to each other.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `add()`

### General Definition
Adds a merged interval to the result list.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
The result must store each completed non-overlapping interval.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
