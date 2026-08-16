# 05 — Optimized Dry Run

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

## State Trace

Start with:

```text
2 rows × 3 columns
```

Then repeatedly:

```text
Choose -> Recurse -> Reach base case or reject -> Undo -> Try next choice
```

Final result:

```text
DRR, RDR, RRD
```
