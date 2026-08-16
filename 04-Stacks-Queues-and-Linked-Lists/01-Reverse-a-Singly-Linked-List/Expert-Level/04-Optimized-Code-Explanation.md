# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class ReverseSinglyLinkedList {
    static class Node { int data; Node next; Node(int data) { this.data = data; } }

    static Node reverse(Node head) {
        Node previous = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = reverse(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
```

## Expert Explanation

The expert solution focuses on the invariant that makes the operation efficient.

### What to Explain

1. What each pointer or data structure represents.
2. Why each movement is safe.
3. How the loop terminates.
4. Why the final state is the answer.
5. Why the stated complexity is achieved.
