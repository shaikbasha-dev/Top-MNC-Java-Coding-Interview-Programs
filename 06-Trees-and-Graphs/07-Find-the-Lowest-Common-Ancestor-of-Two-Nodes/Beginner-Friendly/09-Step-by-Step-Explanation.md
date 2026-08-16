# 09 — Step-by-Step Explanation

## Complete Program

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

## Program Explanation

1. **Program setup:** Define the node class and required data structures.
2. **Input construction:** Build the sample tree or graph.
3. **Initialization:** Set the root, start vertex, queue, visited array or required variables.
4. **Boundary check:** Handle null nodes or already visited vertices.
5. **Core operation:** Apply traversal, recursion, BST search or graph search.
6. **Child/neighbor processing:** Explore the next required nodes.
7. **Result calculation:** Combine values or identify the requested node/result.
8. **Output:** Display the final answer.
