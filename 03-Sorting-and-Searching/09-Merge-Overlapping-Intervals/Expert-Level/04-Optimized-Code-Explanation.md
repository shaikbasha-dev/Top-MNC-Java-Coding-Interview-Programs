# 04 — Optimized Code Explanation

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
