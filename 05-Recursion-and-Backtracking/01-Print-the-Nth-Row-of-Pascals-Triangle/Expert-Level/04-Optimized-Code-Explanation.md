# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
import java.util.*;

public class PascalNthRow {
    static List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            row.add(1);
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(getRow(n));
    }
}
```

## Expert Explanation

The implementation maintains a compact recursive state and explores only the choices necessary for the current branch.

### Important Expert Points

1. The base case guarantees termination.
2. Each recursive call reduces or advances the problem.
3. Backtracking restores state before another branch begins.
4. Validation or pruning prevents invalid states from being explored further.
5. The complexity depends on the size of the recursion tree.
