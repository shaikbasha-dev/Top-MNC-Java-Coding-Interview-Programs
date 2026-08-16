# 05 — Methods Used

## Methods Used in This Program

1. `main()` — starts execution and provides the sample input.
2. Core DP method — creates the DP state and calculates the answer.
3. Java helper/library methods — support comparisons or array initialization where required.

## Method Definitions and Examples

### `main()`

**Definition:** The standard entry point of a Java application.

**General Example:**
```java
public static void main(String[] args) {
    // program starts here
}
```

**Why used here:** It creates the input and calls the DP method.

**If not used:** A normal standalone Java application would not have its standard entry point.

### Core DP Method

**Definition:** A method containing the DP state definition and state transitions.

**General Example:**
```java
static int solve(int n) {
    int[] dp = new int[n + 1];
    return dp[n];
}
```

**Why used here:** It separates the algorithm from input and output.

**If not used:** `main()` becomes unnecessarily large and difficult to understand.

### `Math.min()` / `Math.max()`

**Definition:** Java methods that return the smaller or larger of two values.

**General Example:**
```java
int best = Math.max(a, b);
int minimum = Math.min(a, b);
```

**Why used here:** Several DP problems require choosing the best, largest, smallest, or cheapest alternative.

**If not used:** The same logic could be written with `if` statements, but the code would be less concise.
