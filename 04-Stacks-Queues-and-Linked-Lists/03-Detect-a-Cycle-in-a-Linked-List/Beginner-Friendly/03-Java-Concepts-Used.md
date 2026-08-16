# 03 — Java Concepts Used

## Concepts List

1. Singly linked list
2. Node class
3. Floyd's cycle detection
4. Fast and slow pointers
5. Object references

## Expanded Explanation

### Singly linked list

A singly linked list contains nodes connected through next references.

**General Example:**
```java
10 -> 20 -> 30 -> null
```

### Node class

A Node stores data and a reference to the next node.

**General Example:**
```java
class Node { int data; Node next; }
```

### Floyd's cycle detection

Slow and fast references meeting indicates a cycle.

**General Example:**
```java
if (slow == fast) return true;
```

### Fast and slow pointers

Two references move at different speeds.

**General Example:**
```java
slow = slow.next; fast = fast.next.next;
```

### Object references

A reference variable lets Java access an object.

**General Example:**
```java
Node current = head;
```
