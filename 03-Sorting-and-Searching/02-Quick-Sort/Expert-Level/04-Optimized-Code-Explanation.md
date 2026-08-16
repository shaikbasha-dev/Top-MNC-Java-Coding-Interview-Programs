# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        quickSort(a, 0, a.length - 1);

        System.out.print("Sorted Array = ");
        for (int x : a) System.out.print(x + " ");
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) return;
        int p = partition(a, low, high);
        quickSort(a, low, p - 1);
        quickSort(a, p + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high], i = low;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                int t = a[i]; a[i++] = a[j]; a[j] = t;
            }
        }
        int t = a[i]; a[i] = a[high]; a[high] = t;
        return i;
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
