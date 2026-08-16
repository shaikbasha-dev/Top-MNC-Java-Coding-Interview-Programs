# 03 — Java Concepts Used

## Concepts List

1. Binary tree
2. Recursion
3. Structural comparison
4. Boolean result
5. Base case

## Expanded Explanation

### Binary tree

A tree in which each node has at most two children.

**General Example:**
```java
Node root = new Node(1);
```

### Recursion

A method solves a smaller version of the same tree problem by calling itself.

**General Example:**
```java
height(root.left);
```

### Structural comparison

Two trees must have the same shape and corresponding values to be identical.

**General Example:**
```java
compare left and right recursively.
```

### Boolean result

A boolean represents true or false.

**General Example:**
```java
return first.data == second.data;
```

### Base case

A base case stops recursion at an empty node.

**General Example:**
```java
if (root == null) return 0;
```
