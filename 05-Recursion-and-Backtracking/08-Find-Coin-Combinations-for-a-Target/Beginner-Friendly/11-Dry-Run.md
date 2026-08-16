# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: coins = [2,3,5], target = 7
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
[2,2,3], [2,5]
```
