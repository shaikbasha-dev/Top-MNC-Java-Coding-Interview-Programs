# 03 — Java Concepts Used

## Concepts List

1. Binary tree
2. Queue
3. FIFO
4. Level-order traversal
5. Iteration

## Expanded Explanation

### Binary tree

A tree in which each node has at most two children.

**General Example:**
```java
Node root = new Node(1);
```

### Queue

A queue follows FIFO order.

**General Example:**
```java
queue.offer(root);
```

### FIFO

First In, First Out means the earliest inserted item leaves first.

**General Example:**
```java
10 enters before 20, so 10 leaves first.
```

### Level-order traversal

Visits a tree level by level, normally using a queue.

**General Example:**
```java
while (!queue.isEmpty()) { ... }
```

### Iteration

A loop repeats operations without recursive calls.

**General Example:**
```java
while (root != null) { ... }
```
