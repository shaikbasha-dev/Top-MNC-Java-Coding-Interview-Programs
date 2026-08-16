# 10 — Beginner-Friendly Code Explanation

## Complete Code

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

## Line-by-Line Beginner Explanation

- The class contains the complete solution.
- `main()` creates the starting input.
- The recursive method receives the current state.
- The base case answers the question: **“Have we completed one valid solution?”**
- If not, the program tries one possible choice.
- The recursive call means: **“Now solve the remaining smaller problem.”**
- After returning, the program undoes the choice.
- This undo operation is the heart of backtracking.
- The loop tries the next possible choice.
- The process continues until all valid branches are explored.

### Easy Way to Remember

**Choose → Explore → Undo → Choose another.**
