# 11 — Dry Run

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: offer(10), offer(20), poll()
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
Removed = 10
```
