# 03 — Java Concepts Used

## Concepts List

1. Binary tree
2. Recursion
3. Height balance
4. -1 sentinel
5. Math.abs

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

### Height balance

A binary tree is height-balanced when subtree heights differ by no more than one at every node.

**General Example:**
```java
Math.abs(left - right) <= 1
```

### -1 sentinel

A special value such as -1 can signal that a subtree is already unbalanced.

**General Example:**
```java
if (left == -1) return -1;
```

### Math.abs

Math.abs returns the absolute value.

**General Example:**
```java
int difference = Math.abs(a - b);
```
