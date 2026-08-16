# 09 — Step-by-Step Explanation

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

## Explanation After Each Program Step

1. **Program setup:** Create the required class, nodes, array, stack or queue.
2. **Input construction:** Build the sample data structure.
3. **Initialization:** Set the pointers or data structures required by the algorithm.
4. **Core processing:** Execute the main loop or data-structure operations.
5. **Invariant maintenance:** After each operation, verify that the required ordering or link relationship remains correct.
6. **Boundary handling:** Stop safely at null, empty, front, rear or end conditions.
7. **Result:** Return or print the final answer.
