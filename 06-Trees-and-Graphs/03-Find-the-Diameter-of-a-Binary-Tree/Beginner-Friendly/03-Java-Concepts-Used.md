# 03 — Java Concepts Used

## Concepts List

1. Binary tree
2. Node class
3. Recursion
4. Height
5. Diameter

## Expanded Explanation

### Binary tree

A tree in which each node has at most two children.

**General Example:**
```java
Node root = new Node(1);
```

### Node class

A node stores data and references to child nodes.

**General Example:**
```java
class Node { int data; Node left, right; }
```

### Recursion

A method solves a smaller version of the same tree problem by calling itself.

**General Example:**
```java
height(root.left);
```

### Height

Height measures the longest root-to-leaf path according to the chosen convention.

**General Example:**
```java
1 + Math.max(left, right);
```

### Diameter

Tree diameter is the longest path between two nodes, often measured in nodes or edges.

**General Example:**
```java
leftHeight + rightHeight + 1
```
