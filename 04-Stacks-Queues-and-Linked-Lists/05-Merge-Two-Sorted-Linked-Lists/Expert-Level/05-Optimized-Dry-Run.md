# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## Dry Run

Track the pointers, node links, stack contents or queue contents after every important operation.

### Final Result

```text
1 2 3 4 5 6
```
