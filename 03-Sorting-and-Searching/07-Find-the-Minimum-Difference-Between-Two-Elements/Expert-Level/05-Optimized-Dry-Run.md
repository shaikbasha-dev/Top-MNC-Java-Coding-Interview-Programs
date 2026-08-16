# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
import java.util.Arrays;

public class FindMinimumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 19, 18, 25};
        Arrays.sort(a);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            min = Math.min(min, a[i] - a[i - 1]);
        }

        System.out.println("Minimum Difference = " + min);
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
Minimum Difference = 1
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
