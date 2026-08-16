# 10 — Beginner-Friendly Code Explanation

## Complete Code

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
