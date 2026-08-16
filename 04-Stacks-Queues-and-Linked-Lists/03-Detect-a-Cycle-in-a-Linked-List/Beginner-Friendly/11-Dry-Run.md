# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: 1 -> 2 -> 3 -> 2 ...
```

### Step 2 — Initialize

Create the required nodes, pointers, stack or queue.

### Step 3 — First Operation

Apply the first operation from the algorithm and update the structure.

### Step 4 — Continue Processing

Repeat the operation while the loop condition remains true. After every operation, track the changed reference, node link, stack content or queue content.

### Step 5 — Termination

The algorithm stops when the required boundary condition is reached.

### Step 6 — Final State

```text
Cycle Detected = true
```
