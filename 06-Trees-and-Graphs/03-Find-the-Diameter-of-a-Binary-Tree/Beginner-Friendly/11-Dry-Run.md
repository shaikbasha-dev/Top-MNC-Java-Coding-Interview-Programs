# 11 — Dry Run

## Complete Program

```java
public class BinaryTreeDiameter {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static int diameter = 0;

    static int height(Node root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight + 1);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        height(root);
        System.out.println("Diameter = " + diameter);
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Root 1; children 2,3; node 2 has children 4,5
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
Diameter = 4
```
