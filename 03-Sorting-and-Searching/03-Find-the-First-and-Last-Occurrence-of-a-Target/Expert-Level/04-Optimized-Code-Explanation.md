# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] a = {2, 4, 4, 4, 7, 9};
        int target = 4;
        System.out.println("First Occurrence = " + boundary(a, target, true));
        System.out.println("Last Occurrence = " + boundary(a, target, false));
    }

    private static int boundary(int[] a, int target, boolean first) {
        int low = 0, high = a.length - 1, answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                answer = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } else if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return answer;
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
