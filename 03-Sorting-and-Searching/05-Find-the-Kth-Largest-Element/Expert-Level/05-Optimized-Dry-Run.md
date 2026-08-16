# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
import java.util.PriorityQueue;

public class FindTheKthLargestElement {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int x : a) {
            heap.offer(x);
            if (heap.size() > k) heap.poll();
        }

        System.out.println("Kth Largest Element = " + heap.peek());
    }
}
```

## Expert Dry Run

1. Initialize the required pointers, boundaries or data structure.
2. Process the first important state.
3. Apply the algorithm's invariant.
4. Eliminate the portion that cannot contain the answer or maintain the required result.
5. Repeat until the search or processing range is complete.
6. Produce the final answer.

### Sample Result

```text
Kth Largest Element = 5
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
