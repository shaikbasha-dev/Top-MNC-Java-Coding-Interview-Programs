# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
public class FindMiddleOfLinkedList {
    static class Node { int data; Node next; Node(int data) { this.data = data; } }

    static Node findMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("Middle = " + findMiddle(head).data);
    }
}
```

## Line-by-Line Beginner Explanation

Read the program from top to bottom.

- The class contains the complete solution.
- The `Node` class represents one linked-list element where applicable.
- The constructor stores the initial node data.
- `main()` creates the sample input and calls the solution.
- The core method performs the requested operation.
- Every loop moves through the structure according to the algorithm.
- Every condition protects the program from an invalid movement or incorrect operation.
- References such as `current`, `slow`, `fast`, `previous` or `next` identify positions in the linked list.
- Stack and queue methods enforce LIFO and FIFO behavior.
- The final `System.out` statement displays the answer.

**Beginner tip:** For every pointer, say aloud: “What node does this reference currently point to?” That makes linked-list code much easier to understand.
