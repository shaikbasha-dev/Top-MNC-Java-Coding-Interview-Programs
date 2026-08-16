# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class TreeTraversals {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.print("\nPreorder: ");
        preorder(root);
        System.out.print("\nPostorder: ");
        postorder(root);
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
