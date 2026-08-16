# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## State Trace

Start:

```text
Tree 1-2,1-3; node 2 has 4,5; targets 4 and 5
```

Then track the root/current vertex, child/neighbor selection, queue/recursion state and final result after every major operation.

Final:

```text
LCA = 2
```
