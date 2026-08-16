# 10 — Beginner-Friendly Code Explanation

## Complete Code

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
