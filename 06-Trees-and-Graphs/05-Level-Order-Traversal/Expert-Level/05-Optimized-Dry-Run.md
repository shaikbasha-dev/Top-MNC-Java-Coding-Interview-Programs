# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## State Trace

Start:

```text
Tree: 1 with children 2,3; node 2 has children 4,5
```

Then track the root/current vertex, child/neighbor selection, queue/recursion state and final result after every major operation.

Final:

```text
1 2 3 4 5
```
