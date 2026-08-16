# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The implementation uses the strongest property of the selected data structure.

### Key Points

1. Each node or vertex is processed only when necessary.
2. Recursive results are combined without redundant full traversals where possible.
3. BFS uses FIFO ordering.
4. DFS uses depth-first exploration.
5. BST search uses ordering to eliminate entire subtrees.
6. Graph cycle detection uses visited and parent state.
