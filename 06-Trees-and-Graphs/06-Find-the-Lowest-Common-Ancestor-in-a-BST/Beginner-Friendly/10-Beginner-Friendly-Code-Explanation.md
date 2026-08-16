# 10 — Beginner-Friendly Code Explanation

## Complete Code

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
