# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.Arrays;

public class CoinChange {
    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int current = 1; current <= amount; current++) {
            for (int coin : coins) {
                if (coin <= current) {
                    dp[current] = Math.min(
                        dp[current],
                        dp[current - coin] + 1
                    );
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Minimum coins = " + coinChange(coins, amount));
    }
}
```

## Beginner-Friendly Explanation

Think of the DP array or table as a notebook.

- Each `dp` position represents one smaller question.
- First, write the answers that are already known.
- Calculate the next answer using the answers already written.
- Because those smaller answers are stored, the same subproblem is not solved repeatedly.
- `for` loops move through the states in the required order.
- `Math.max()` is useful when the problem asks for the best/largest choice.
- `Math.min()` is useful when the problem asks for the cheapest/smallest choice.
- A boolean DP table stores whether a target is possible.
- A two-dimensional table is used when two changing values define the state.

### Easy Way to Remember

**DP = Store Small Answers → Reuse Them → Build the Big Answer**
