# 06 — Methods Used

## Why Each Method Is Used

1. `main()` — starts execution and builds the sample input.
2. Core problem method — performs the required traversal, search or calculation.
3. Helper methods — perform recursion, validation, edge insertion or traversal support.

## Method Definitions and Examples

### `main()`

**Definition:** Standard Java entry point.

**General Example:**
```java
public static void main(String[] args) {
    // program starts here
}
```

**Why used here:** It builds the sample tree/graph and calls the solution.

**If not used:** A normal standalone Java application would not have its standard entry point.

### Core Problem Method

**Definition:** A method containing the main algorithm.

**General Example:**
```java
static int solve(Node root) {
    // algorithm
    return 0;
}
```

**Why used here:** It separates the algorithm from input construction and output.

**If not used:** The main method becomes large and difficult to test or explain.

### Helper Method

**Definition:** A helper method performs a focused repeated operation.

**General Example:**
```java
static boolean isValid(...) {
    return true;
}
```

**Why used here:** It keeps the main algorithm readable.

**If not used:** Repeated logic becomes mixed into the main method and is harder to maintain.
