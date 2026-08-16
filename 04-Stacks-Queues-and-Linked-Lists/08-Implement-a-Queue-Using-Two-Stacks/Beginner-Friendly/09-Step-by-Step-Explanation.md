# 09 — Step-by-Step Explanation

## Complete Program

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingTwoStacks {
    Deque<Integer> input = new ArrayDeque<>();
    Deque<Integer> output = new ArrayDeque<>();

    void offer(int value) { input.push(value); }

    int poll() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) output.push(input.pop());
        }
        return output.pop();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.offer(10);
        queue.offer(20);
        System.out.println("Removed = " + queue.poll());
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
