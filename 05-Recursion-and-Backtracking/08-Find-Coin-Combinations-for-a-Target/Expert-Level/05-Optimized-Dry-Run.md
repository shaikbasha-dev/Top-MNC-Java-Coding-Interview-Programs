# 05 — Optimized Dry Run

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

## State Trace

Start with:

```text
coins = [2,3,5], target = 7
```

Then repeatedly:

```text
Choose -> Recurse -> Reach base case or reject -> Undo -> Try next choice
```

Final result:

```text
[2,2,3], [2,5]
```
