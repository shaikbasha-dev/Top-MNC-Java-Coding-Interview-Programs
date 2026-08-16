# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElementUsingStack {
    static int[] nextGreater(int[] numbers) {
        int[] result = new int[numbers.length];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) stack.pop();
            if (!stack.isEmpty()) result[i] = stack.peek();
            stack.push(numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(nextGreater(numbers)));
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
