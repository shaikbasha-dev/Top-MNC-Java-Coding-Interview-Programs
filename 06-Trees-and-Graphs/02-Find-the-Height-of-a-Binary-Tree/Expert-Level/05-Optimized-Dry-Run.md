# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## State Trace

Start:

```text
Root 1; path 1 -> 2 -> 4 -> 5
```

Then track the root/current vertex, child/neighbor selection, queue/recursion state and final result after every major operation.

Final:

```text
Height = 4
```
