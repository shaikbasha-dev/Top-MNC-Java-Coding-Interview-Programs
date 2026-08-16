# 05 — Methods Used

## Methods Used in This Program

1. `main()` — starts execution and supplies sample input.
2. Core recursive method — explores the smaller problem.
3. Validation/helper method where required — checks whether a choice is legal.
4. State-management operations — add, remove, swap, place or restore choices.

## Method Definitions and Examples

### `main()`

**Definition:** The standard entry point of a Java application.

**General Example:**
```java
public static void main(String[] args) {
    // start execution
}
```

**Why used here:** It creates the starting state and calls the recursive solution.

**If not used:** A standalone Java program would not have its standard entry point.

### Core Recursive Method

**Definition:** A recursive method calls itself with a smaller or more constrained problem.

**General Example:**
```java
static void solve(int index) {
    if (index == end) return;
    solve(index + 1);
}
```

**Why used here:** The problem naturally forms a decision tree.

**If not used:** Every possible branch would need to be written manually, which is impractical.

### Validation / Helper Method

**Definition:** A helper method isolates a repeated check.

**General Example:**
```java
static boolean isValid(...) {
    return true;
}
```

**Why used here:** It keeps the recursive method focused on choices and recursion.

**If not used:** Validation logic would be mixed into the recursive method and become harder to understand.

### State-Management Operation

**Definition:** Backtracking changes a temporary state and later restores it.

**General Example:**
```java
current.add(choice);
solve();
current.remove(current.size() - 1);
```

**Why used here:** It allows the same data structure to be reused for different branches.

**If not used:** Earlier choices could incorrectly remain active in later branches.
