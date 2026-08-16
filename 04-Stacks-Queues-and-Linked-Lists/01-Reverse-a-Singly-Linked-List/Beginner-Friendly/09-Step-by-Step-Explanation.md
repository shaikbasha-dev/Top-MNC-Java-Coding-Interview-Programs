# 09 — Step-by-Step Explanation

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

## Explanation After Each Program Step

1. **Program setup:** Create the required class, nodes, array, stack or queue.
2. **Input construction:** Build the sample data structure.
3. **Initialization:** Set the pointers or data structures required by the algorithm.
4. **Core processing:** Execute the main loop or data-structure operations.
5. **Invariant maintenance:** After each operation, verify that the required ordering or link relationship remains correct.
6. **Boundary handling:** Stop safely at null, empty, front, rear or end conditions.
7. **Result:** Return or print the final answer.
