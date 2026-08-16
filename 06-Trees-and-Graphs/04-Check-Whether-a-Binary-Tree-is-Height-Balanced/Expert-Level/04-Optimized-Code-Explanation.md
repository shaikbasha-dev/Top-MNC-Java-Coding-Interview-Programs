# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class HeightBalancedBinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    static int checkHeight(Node root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1;

        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Balanced = " + isBalanced(root));
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
