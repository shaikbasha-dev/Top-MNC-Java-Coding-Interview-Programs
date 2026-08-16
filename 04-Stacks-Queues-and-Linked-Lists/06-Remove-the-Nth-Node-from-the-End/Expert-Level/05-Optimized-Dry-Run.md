# 05 — Optimized Dry Run

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

## Dry Run

Track the pointers, node links, stack contents or queue contents after every important operation.

### Final Result

```text
1 2 3 5
```
