# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class RemoveNthNodeFromEnd {
    static class Node { int data; Node next; Node(int data) { this.data = data; } }

    static Node remove(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;

        for (int i = 0; i < n; i++) fast = fast.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2); head.next.next = new Node(3);
        head.next.next.next = new Node(4); head.next.next.next.next = new Node(5);
        Node result = remove(head, 2);
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
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
