# 11 — Dry Run

## Complete Program

```java
public class LCAInBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static Node lca(Node root, int a, int b) {
        while (root != null) {
            if (a < root.data && b < root.data) {
                root = root.left;
            } else if (a > root.data && b > root.data) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);

        Node result = lca(root, 2, 8);
        System.out.println("LCA = " + result.data);
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
BST with root 6; targets 2 and 8
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
LCA = 6
```
