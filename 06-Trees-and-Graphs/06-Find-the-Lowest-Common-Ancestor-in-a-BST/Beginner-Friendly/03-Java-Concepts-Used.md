# 03 — Java Concepts Used

## Concepts List

1. Binary search tree
2. BST property
3. Iteration
4. References
5. Lowest common ancestor

## Expanded Explanation

### Binary search tree

A BST keeps smaller values on the left and larger values on the right.

**General Example:**
```java
if (key < root.data) root = root.left;
```

### BST property

For each BST node, left values are smaller and right values are larger under the usual rule.

**General Example:**
```java
left < root < right
```

### Iteration

A loop repeats operations without recursive calls.

**General Example:**
```java
while (root != null) { ... }
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
