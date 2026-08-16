# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## Dry Run

Track the pointers, node links, stack contents or queue contents after every important operation.

### Final Result

```text
Removed = 10
```
