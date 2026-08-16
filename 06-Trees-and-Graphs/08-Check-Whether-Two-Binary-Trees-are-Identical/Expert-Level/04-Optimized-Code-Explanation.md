# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The implementation uses the strongest property of the selected data structure.

### Key Points

1. Each node or vertex is processed only when necessary.
2. Recursive results are combined without redundant full traversals where possible.
3. BFS uses FIFO ordering.
4. DFS uses depth-first exploration.
5. BST search uses ordering to eliminate entire subtrees.
6. Graph cycle detection uses visited and parent state.
