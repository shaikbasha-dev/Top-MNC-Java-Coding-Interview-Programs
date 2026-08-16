# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] a = {{1,3},{2,6},{8,10},{9,12}};
        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));

        List<int[]> result = new ArrayList<>();
        int start = a[0][0], end = a[0][1];

        for (int i = 1; i < a.length; i++) {
            if (a[i][0] <= end) end = Math.max(end, a[i][1]);
            else {
                result.add(new int[]{start, end});
                start = a[i][0];
                end = a[i][1];
            }
        }
        result.add(new int[]{start, end});

        System.out.print("Merged Intervals = ");
        for (int[] x : result) System.out.print("[" + x[0] + "," + x[1] + "] ");
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
[[1,6],[8,12]]
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
