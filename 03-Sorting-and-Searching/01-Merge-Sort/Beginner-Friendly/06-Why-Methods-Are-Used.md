# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `mergeSort()`

### General Definition
Recursively divides the array into smaller ranges until each range contains one element.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
Without it, the divide-and-conquer structure would not be implemented.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `merge()`

### General Definition
Combines two already-sorted portions into one sorted portion.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
Without it, the sorted halves could not be combined into the final sorted range.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
