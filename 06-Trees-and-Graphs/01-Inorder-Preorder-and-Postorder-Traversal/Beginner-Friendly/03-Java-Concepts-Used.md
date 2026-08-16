# 03 — Java Concepts Used

## Concepts List

1. Binary tree
2. Node class
3. Recursion
4. Tree traversal
5. Base case

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

### Tree traversal

Traversal means visiting tree nodes in a defined order.

**General Example:**
```java
inorder(root.left); visit(root); inorder(root.right);
```

### Base case

A base case stops recursion at an empty node.

**General Example:**
```java
if (root == null) return 0;
```
