# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The expert solution focuses on the invariant that makes the operation efficient.

### What to Explain

1. What each pointer or data structure represents.
2. Why each movement is safe.
3. How the loop terminates.
4. Why the final state is the answer.
5. Why the stated complexity is achieved.
