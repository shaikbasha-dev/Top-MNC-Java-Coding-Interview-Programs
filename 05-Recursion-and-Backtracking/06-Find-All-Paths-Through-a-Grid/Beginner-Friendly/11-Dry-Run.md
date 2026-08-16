# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: 2 rows × 3 columns
```

### Step 2 — First Recursive Call

The algorithm starts with an empty or initial state.

### Step 3 — Make the First Choice

One candidate is selected and added to the current state.

### Step 4 — Recursive Exploration

The method calls itself with the remaining problem.

### Step 5 — Base Case

When the required state is complete, the solution is recorded or displayed.

### Step 6 — Backtrack

The last choice is removed or restored.

### Step 7 — Try the Next Choice

The next candidate is selected and the same process repeats.

### Final Result

```text
DRR, RDR, RRD
```
