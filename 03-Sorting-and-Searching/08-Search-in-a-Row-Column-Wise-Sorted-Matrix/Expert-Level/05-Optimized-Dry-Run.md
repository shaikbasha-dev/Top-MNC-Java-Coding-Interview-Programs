# 05 — Optimized Dry Run

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

## Expert Dry Run

1. Initialize the required pointers, boundaries or data structure.
2. Process the first important state.
3. Apply the algorithm's invariant.
4. Eliminate the portion that cannot contain the answer or maintain the required result.
5. Repeat until the search or processing range is complete.
6. Produce the final answer.

### Sample Result

```text
Target Found at Row = 2, Column = 1
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
