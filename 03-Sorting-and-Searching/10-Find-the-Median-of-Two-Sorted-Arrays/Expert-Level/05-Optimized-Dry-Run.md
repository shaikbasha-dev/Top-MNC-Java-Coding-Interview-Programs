# 05 — Optimized Dry Run

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

## Expert Dry Run

1. Initialize the required pointers, boundaries or data structure.
2. Process the first important state.
3. Apply the algorithm's invariant.
4. Eliminate the portion that cannot contain the answer or maintain the required result.
5. Repeat until the search or processing range is complete.
6. Produce the final answer.

### Sample Result

```text
Median = 2.0
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
