# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: [1, 2, 3, 4]
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
4 3 2 1
```
