# 05 — Optimized Dry Run

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

## State Trace

Start:

```text
Tree: 1 with children 2,3; node 2 has children 4,5
```

Then track the root/current vertex, child/neighbor selection, queue/recursion state and final result after every major operation.

Final:

```text
Inorder: 4 2 5 1 3
Preorder: 1 2 4 5 3
Postorder: 4 5 2 3 1
```
