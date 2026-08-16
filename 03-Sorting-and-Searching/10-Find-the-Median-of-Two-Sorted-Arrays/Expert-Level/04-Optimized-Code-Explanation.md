# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {2};
        System.out.println("Median = " + findMedian(a, b));
    }

    private static double findMedian(int[] a, int[] b) {
        if (a.length > b.length) return findMedian(b, a);

        int m = a.length, n = b.length;
        int low = 0, high = m;
        int half = (m + n + 1) / 2;

        while (low <= high) {
            int i = low + (high - low) / 2;
            int j = half - i;

            int leftA = i == 0 ? Integer.MIN_VALUE : a[i - 1];
            int rightA = i == m ? Integer.MAX_VALUE : a[i];
            int leftB = j == 0 ? Integer.MIN_VALUE : b[j - 1];
            int rightB = j == n ? Integer.MAX_VALUE : b[j];

            if (leftA <= rightB && leftB <= rightA) {
                if ((m + n) % 2 == 1) return Math.max(leftA, leftB);
                return (Math.max(leftA, leftB) + (long)Math.min(rightA, rightB)) / 2.0;
            }

            if (leftA > rightB) high = i - 1;
            else low = i + 1;
        }

        throw new IllegalArgumentException("Input arrays are invalid.");
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
