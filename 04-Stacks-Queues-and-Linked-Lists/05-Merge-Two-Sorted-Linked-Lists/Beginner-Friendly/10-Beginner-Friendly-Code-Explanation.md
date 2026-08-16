# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
public class MergeTwoSortedLinkedLists {
    static class Node { int data; Node next; Node(int data) { this.data = data; } }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0), current = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                current.next = a; a = a.next;
            } else {
                current.next = b; b = b.next;
            }
            current = current.next;
        }
        current.next = (a != null) ? a : b;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1); a.next = new Node(3); a.next.next = new Node(5);
        Node b = new Node(2); b.next = new Node(4); b.next.next = new Node(6);
        Node result = merge(a, b);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
```

## Line-by-Line Beginner Explanation

Read the program from top to bottom.

- The class contains the complete solution.
- The `Node` class represents one linked-list element where applicable.
- The constructor stores the initial node data.
- `main()` creates the sample input and calls the solution.
- The core method performs the requested operation.
- Every loop moves through the structure according to the algorithm.
- Every condition protects the program from an invalid movement or incorrect operation.
- References such as `current`, `slow`, `fast`, `previous` or `next` identify positions in the linked list.
- Stack and queue methods enforce LIFO and FIFO behavior.
- The final `System.out` statement displays the answer.

**Beginner tip:** For every pointer, say aloud: “What node does this reference currently point to?” That makes linked-list code much easier to understand.
