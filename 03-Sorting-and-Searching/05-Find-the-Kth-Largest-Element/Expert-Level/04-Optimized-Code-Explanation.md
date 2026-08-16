# 04 — Optimized Code Explanation

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

## Expert Explanation

The expert implementation focuses on the invariant that makes the algorithm efficient.

### What to Identify

1. **Input representation** — how the problem data is stored.
2. **Core state** — pointers, boundaries, heap, partition or recursion state.
3. **Invariant** — what is guaranteed to be true after each major iteration.
4. **Decision** — how the current comparison determines the next move.
5. **Termination** — when the algorithm knows the answer is complete.
6. **Complexity** — why the optimized implementation achieves its stated bound.

### Interview Tip

Do not simply say that this code is faster. Explain exactly which repeated work the expert solution removes.
