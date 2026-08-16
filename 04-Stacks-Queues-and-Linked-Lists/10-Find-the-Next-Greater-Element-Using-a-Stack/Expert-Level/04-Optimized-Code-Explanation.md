# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The expert solution focuses on the invariant that makes the operation efficient.

### What to Explain

1. What each pointer or data structure represents.
2. Why each movement is safe.
3. How the loop terminates.
4. Why the final state is the answer.
5. Why the stated complexity is achieved.
