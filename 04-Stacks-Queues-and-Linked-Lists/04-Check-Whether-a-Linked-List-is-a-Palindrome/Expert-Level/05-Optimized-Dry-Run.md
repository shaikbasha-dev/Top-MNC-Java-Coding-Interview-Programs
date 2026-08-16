# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## Dry Run

Track the pointers, node links, stack contents or queue contents after every important operation.

### Final Result

```text
Palindrome = true
```
