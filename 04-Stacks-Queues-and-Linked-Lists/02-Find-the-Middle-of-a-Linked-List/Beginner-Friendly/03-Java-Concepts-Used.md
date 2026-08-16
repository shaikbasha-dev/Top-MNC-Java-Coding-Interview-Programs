# 03 — Java Concepts Used

## Concepts List

1. Singly linked list
2. Node class
3. Fast and slow pointers
4. while loop
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

### Fast and slow pointers

Two references move at different speeds.

**General Example:**
```java
slow = slow.next; fast = fast.next.next;
```

### while loop

Repeats a block while a condition is true.

**General Example:**
```java
while (current != null) { current = current.next; }
```

### Object references

A reference variable lets Java access an object.

**General Example:**
```java
Node current = head;
```
