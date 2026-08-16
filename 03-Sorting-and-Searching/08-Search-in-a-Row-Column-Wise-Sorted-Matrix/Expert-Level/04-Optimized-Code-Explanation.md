# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class SearchInARowColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] m = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target = 29;
        int r = 0, c = m[0].length - 1;

        while (r < m.length && c >= 0) {
            if (m[r][c] == target) {
                System.out.println("Target Found at Row = " + r + ", Column = " + c);
                return;
            }
            if (m[r][c] > target) c--;
            else r++;
        }
        System.out.println("Target Not Found");
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
