# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: 1 -> 3 -> 5 and 2 -> 4 -> 6
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
1 2 3 4 5 6
```
