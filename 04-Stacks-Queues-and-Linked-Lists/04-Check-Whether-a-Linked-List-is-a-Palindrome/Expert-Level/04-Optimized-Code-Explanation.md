# 04 — Optimized Code Explanation

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

## Expert Explanation

The expert solution focuses on the invariant that makes the operation efficient.

### What to Explain

1. What each pointer or data structure represents.
2. Why each movement is safe.
3. How the loop terminates.
4. Why the final state is the answer.
5. Why the stated complexity is achieved.
