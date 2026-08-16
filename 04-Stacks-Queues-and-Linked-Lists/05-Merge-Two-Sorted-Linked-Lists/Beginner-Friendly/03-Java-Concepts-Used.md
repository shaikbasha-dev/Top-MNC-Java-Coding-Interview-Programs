# 03 — Java Concepts Used

## Concepts List

1. Singly linked list
2. Node class
3. Dummy node
4. Two sorted lists
5. while loop

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

### Dummy node

A temporary node simplifies operations involving the head.

**General Example:**
```java
Node dummy = new Node(0);
```

### Two sorted lists

Two lists whose values are already ordered.

**General Example:**
```java
1 -> 3 -> 5
```

### while loop

Repeats a block while a condition is true.

**General Example:**
```java
while (current != null) { current = current.next; }
```
