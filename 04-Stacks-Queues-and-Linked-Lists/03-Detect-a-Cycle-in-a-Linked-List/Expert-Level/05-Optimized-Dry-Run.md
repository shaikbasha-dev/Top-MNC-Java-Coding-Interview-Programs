# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class DetectCycleInLinkedList {
    static class Node { int data; Node next; Node(int data) { this.data = data; } }

    static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;
        System.out.println("Cycle Detected = " + hasCycle(head));
    }
}
```

## Dry Run

Track the pointers, node links, stack contents or queue contents after every important operation.

### Final Result

```text
Cycle Detected = true
```
