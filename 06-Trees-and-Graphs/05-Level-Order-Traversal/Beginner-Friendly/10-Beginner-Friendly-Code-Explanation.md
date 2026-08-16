# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.*;

public class LevelOrderTraversal {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        levelOrder(root);
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
