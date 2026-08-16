# 09 — Step-by-Step Explanation

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

## Explanation After Each Program Step

1. **Program setup:** Create the required class, nodes, array, stack or queue.
2. **Input construction:** Build the sample data structure.
3. **Initialization:** Set the pointers or data structures required by the algorithm.
4. **Core processing:** Execute the main loop or data-structure operations.
5. **Invariant maintenance:** After each operation, verify that the required ordering or link relationship remains correct.
6. **Boundary handling:** Stop safely at null, empty, front, rear or end conditions.
7. **Result:** Return or print the final answer.
