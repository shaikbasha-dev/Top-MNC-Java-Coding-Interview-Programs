# 05 — Optimized Dry Run

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

## Expert Dry Run

1. Initialize the required pointers, boundaries or data structure.
2. Process the first important state.
3. Apply the algorithm's invariant.
4. Eliminate the portion that cannot contain the answer or maintain the required result.
5. Repeat until the search or processing range is complete.
6. Produce the final answer.

### Sample Result

```text
[0, 0, 1, 1, 2, 2]
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
