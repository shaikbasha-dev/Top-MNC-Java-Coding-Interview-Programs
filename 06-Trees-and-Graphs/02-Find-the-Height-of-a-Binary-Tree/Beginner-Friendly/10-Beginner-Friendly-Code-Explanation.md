# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
public class BinaryTreeHeight {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);

        System.out.println("Height = " + height(root));
    }
}
```

## Beginner-Friendly Explanation

- The `Node` class represents a tree node.
- `left` and `right` references connect a binary tree node to its children.
- `main()` creates the sample structure.
- The core method receives the root or graph and starts processing.
- In recursive tree problems, a null node means there is nothing more to process.
- In BFS, the queue stores nodes that still need to be processed.
- In DFS, recursion continues deeper into an unvisited neighbor.
- The visited array prevents repeated graph processing.
- In a BST, values tell us whether to move left or right.
- The final print statement displays the requested result.

### Beginner Tip

For every tree problem ask:

**“What should happen at the current node, and what should happen in its left and right subtrees?”**

For graph problems ask:

**“Which neighbors have I already visited?”**
