# 11 — Dry Run

## Complete Program

```java
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    Queue<Integer> first = new LinkedList<>();
    Queue<Integer> second = new LinkedList<>();

    void push(int value) {
        second.offer(value);
        while (!first.isEmpty()) second.offer(first.poll());
        Queue<Integer> temp = first;
        first = second;
        second = temp;
    }

    int pop() { return first.poll(); }

    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(10);
        stack.push(20);
        System.out.println("Popped = " + stack.pop());
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: push(10), push(20), pop()
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
Popped = 20
```
