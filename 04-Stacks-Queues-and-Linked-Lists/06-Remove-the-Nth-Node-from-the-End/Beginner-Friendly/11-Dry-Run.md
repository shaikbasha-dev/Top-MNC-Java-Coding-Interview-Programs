# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: [1,2,3,4,5], n=2
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
1 2 3 5
```
