# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The implementation maintains a compact recursive state and explores only the choices necessary for the current branch.

### Important Expert Points

1. The base case guarantees termination.
2. Each recursive call reduces or advances the problem.
3. Backtracking restores state before another branch begins.
4. Validation or pruning prevents invalid states from being explored further.
5. The complexity depends on the size of the recursion tree.
