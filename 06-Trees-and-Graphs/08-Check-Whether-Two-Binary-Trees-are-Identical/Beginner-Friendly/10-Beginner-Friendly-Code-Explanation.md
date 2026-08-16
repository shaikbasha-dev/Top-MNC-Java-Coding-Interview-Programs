# 10 — Beginner-Friendly Code Explanation

## Complete Code

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
