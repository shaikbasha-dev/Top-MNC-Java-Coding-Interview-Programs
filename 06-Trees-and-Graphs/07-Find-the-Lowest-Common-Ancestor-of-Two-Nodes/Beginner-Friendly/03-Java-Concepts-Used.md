# 03 — Java Concepts Used

## Concepts List

1. Binary tree
2. Recursion
3. References
4. Lowest common ancestor
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

### References

A reference variable points to an object.

**General Example:**
```java
Node current = root;
```

### Lowest common ancestor

The LCA is the deepest node that is an ancestor of both targets.

**General Example:**
```java
LCA(4,5) = 2
```

### Base case

A base case stops recursion at an empty node.

**General Example:**
```java
if (root == null) return 0;
```
