# 09 — Step-by-Step Explanation

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

## Step-by-Step Program Explanation

1. **Program setup:** Define the class and required helper methods.
2. **Input setup:** Create the sample data.
3. **Initial call:** Start recursion with the initial index, position or state.
4. **Base-case check:** Determine whether the complete solution has been formed.
5. **Make a choice:** Select one possible candidate.
6. **Recursive call:** Solve the remaining smaller problem.
7. **Backtrack:** Undo the choice so another branch can be explored.
8. **Repeat:** Continue until every required branch has been processed.
9. **Output:** Display or return the generated result.
