# 11 — Dry Run

## Complete Program

```java
public class LCAOfTwoNodes {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static Node lca(Node root, Node a, Node b) {
        if (root == null || root == a || root == b) return root;

        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node result = lca(root, root.left.left, root.left.right);
        System.out.println("LCA = " + result.data);
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Tree 1-2,1-3; node 2 has 4,5; targets 4 and 5
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
LCA = 2
```
