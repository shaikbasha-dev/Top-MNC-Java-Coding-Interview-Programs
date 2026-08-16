# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class SortAnArrayContaining0s1sAnd2s {
    public static void main(String[] args) {
        int[] a = {2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                int t = a[low]; a[low++] = a[mid]; a[mid++] = t;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int t = a[mid]; a[mid] = a[high]; a[high--] = t;
            }
        }

        System.out.print("Sorted Array = ");
        for (int x : a) System.out.print(x + " ");
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
