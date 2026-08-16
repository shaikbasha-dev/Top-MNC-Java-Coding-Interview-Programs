# 04 — Methods Used

## Methods Used in This Program

1. `main()` — starts program execution.
2. Constructor methods — create Node objects where required.
3. Problem-specific method — performs the core algorithm.
4. Data-structure operations — push/pop or offer/poll where required.

## Method Definitions and Examples

### `main()`

**Definition:** The JVM starts normal execution from the main method.

**General Example:**
```java
public static void main(String[] args) {
    // program starts here
}
```

**Why used here:** It creates the entry point for the complete demonstration.

**If not used:** A normal standalone Java application would not have its standard entry point.

### Constructor

**Definition:** A constructor initializes a newly created object.

**General Example:**
```java
Node(int data) {
    this.data = data;
}
```

**Why used here:** It initializes linked-list nodes with their data.

**If not used:** Node fields would need to be initialized separately.

### Problem-Specific Method

**Definition:** A method groups the core logic of the problem into one reusable unit.

**General Example:**
```java
static Object solve(Object input) {
    // algorithm
}
```

**Why used here:** It keeps the algorithm separate from setup and output.

**If not used:** The main method becomes harder to read, test and explain.

### Data-Structure Operations

**Definition:** Operations such as push, pop, offer and poll implement the access rules of stacks and queues.

**General Example:**
```java
stack.push(10);
queue.offer(20);
```

**Why used here:** They enforce LIFO or FIFO behavior.

**If not used:** The intended stack/queue behavior would have to be implemented manually.
