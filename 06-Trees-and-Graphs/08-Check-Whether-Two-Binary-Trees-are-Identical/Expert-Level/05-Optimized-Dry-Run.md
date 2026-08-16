# 05 — Optimized Dry Run

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

## State Trace

Start:

```text
Two trees with structure and values 1,2,3
```

Then track the root/current vertex, child/neighbor selection, queue/recursion state and final result after every major operation.

Final:

```text
Identical = true
```
