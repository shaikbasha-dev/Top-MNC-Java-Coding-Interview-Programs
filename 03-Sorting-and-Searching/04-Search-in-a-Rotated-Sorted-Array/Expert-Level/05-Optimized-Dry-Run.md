# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Target Index = " + search(a, 0));
    }

    private static int search(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;

            if (a[l] <= a[m]) {
                if (a[l] <= target && target < a[m]) r = m - 1;
                else l = m + 1;
            } else {
                if (a[m] < target && target <= a[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
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
Target Index = 4
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
