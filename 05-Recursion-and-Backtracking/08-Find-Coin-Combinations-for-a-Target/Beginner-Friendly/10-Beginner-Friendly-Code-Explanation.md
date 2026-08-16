# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.*;

public class CoinCombinations {
    static void find(int[] coins, int index, int target, List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }

        if (target < 0 || index == coins.length) return;

        current.add(coins[index]);
        find(coins, index, target - coins[index], current);

        current.remove(current.size() - 1);
        find(coins, index + 1, target, current);
    }

    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        find(coins, 0, 7, new ArrayList<>());
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
