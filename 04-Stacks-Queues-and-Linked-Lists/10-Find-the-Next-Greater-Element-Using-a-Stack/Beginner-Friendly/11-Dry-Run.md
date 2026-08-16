# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: [4,5,2,10,8]
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
[5, 10, 10, -1, -1]
```
