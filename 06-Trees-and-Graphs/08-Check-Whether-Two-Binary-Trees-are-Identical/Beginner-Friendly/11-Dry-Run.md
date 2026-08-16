# 11 — Dry Run

## Complete Program

```java
public class IdenticalBinaryTrees {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static boolean identical(Node first, Node second) {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        if (first.data != second.data) return false;

        return identical(first.left, second.left)
            && identical(first.right, second.right);
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        first.left = new Node(2);
        first.right = new Node(3);

        Node second = new Node(1);
        second.left = new Node(2);
        second.right = new Node(3);

        System.out.println("Identical = " + identical(first, second));
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Two trees with structure and values 1,2,3
```

### Step 2 — Start

Begin at the root or starting graph vertex.

### Step 3 — Process Current Node/Vertex

Apply the algorithm to the current element.

### Step 4 — Explore

Move to the required child or neighboring vertex.

### Step 5 — Maintain State

Update height, diameter, queue, visited array, parent reference or result as required.

### Step 6 — Continue

Repeat until all required nodes/vertices have been processed.

### Final Result

```text
Identical = true
```
