# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
import java.util.*;

public class GridPaths {
    static void findPaths(int row, int col, int rows, int cols, String path) {
        if (row == rows - 1 && col == cols - 1) {
            System.out.println(path);
            return;
        }

        if (row < rows - 1) {
            findPaths(row + 1, col, rows, cols, path + "D");
        }

        if (col < cols - 1) {
            findPaths(row, col + 1, rows, cols, path + "R");
        }
    }

    public static void main(String[] args) {
        findPaths(0, 0, 2, 3, "");
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
