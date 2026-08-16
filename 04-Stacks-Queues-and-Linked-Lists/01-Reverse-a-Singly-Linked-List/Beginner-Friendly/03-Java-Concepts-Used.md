# 03 — Java Concepts Used

## Concepts List

1. Class and main method
2. Singly linked list
3. Node class
4. Object references
5. while loop

## Expanded Explanation

### Class and main method

A class groups program code and main is the starting point of execution.

**General Example:**
```java
public static void main(String[] args) { }
```

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

### Object references

A reference variable lets Java access an object.

**General Example:**
```java
Node current = head;
```

### while loop

Repeats a block while a condition is true.

**General Example:**
```java
while (current != null) { current = current.next; }
```
