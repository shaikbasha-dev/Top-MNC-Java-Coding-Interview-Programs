# 06 — Why Methods Are Used

Every method in the program has a specific responsibility. Separating responsibilities keeps the code readable and makes the algorithm easier to explain and test.

## `add()`

### General Definition
Adds an element to a PriorityQueue.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
The heap maintains the smallest value among the current k largest elements.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.

## `poll()`

### General Definition
Removes the smallest element from the min-heap.

### Simple General Example
```java
// The method performs one focused responsibility.
```

### Why It Is Used Here
It discards the smallest candidate when more than k elements are stored.

### What Happens If It Is Not Used

- The same logic must be placed somewhere else.
- The main method becomes more difficult to read.
- Testing individual logic becomes harder.
- Explaining the program during an interview becomes less structured.
