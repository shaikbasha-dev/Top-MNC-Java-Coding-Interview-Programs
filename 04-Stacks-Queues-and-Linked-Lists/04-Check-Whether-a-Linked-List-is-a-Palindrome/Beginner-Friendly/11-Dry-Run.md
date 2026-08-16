# 11 — Dry Run

## Complete Program

```java
import java.util.ArrayList;

public class LinkedListPalindrome {
    static class Node { int data; Node next; Node(int data) { this.data = data; } }

    static boolean isPalindrome(Node head) {
        ArrayList<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.data);
            head = head.next;
        }
        int left = 0, right = values.size() - 1;
        while (left < right) {
            if (!values.get(left).equals(values.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        System.out.println("Palindrome = " + isPalindrome(head));
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: [1, 2, 2, 1]
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
Palindrome = true
```
