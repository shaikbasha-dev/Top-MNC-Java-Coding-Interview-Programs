# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] a = {2, 4, 4, 4, 7, 9};
        int target = 4;
        System.out.println("First Occurrence = " + boundary(a, target, true));
        System.out.println("Last Occurrence = " + boundary(a, target, false));
    }

    private static int boundary(int[] a, int target, boolean first) {
        int low = 0, high = a.length - 1, answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                answer = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } else if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return answer;
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
First Occurrence = 1, Last Occurrence = 3
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
