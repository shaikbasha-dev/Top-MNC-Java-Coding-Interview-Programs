# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Input

```text
coins = [1, 2, 5], amount = 11
```

### Step 2 — Create DP State

The required array or table is created.

### Step 3 — Initialize Base States

States whose answers are already known are filled first.

### Step 4 — Calculate Next State

The algorithm uses previous states according to the transition rule.

### Step 5 — Continue Filling

Each state is calculated from smaller states until the complete input has been processed.

### Step 6 — Final State

The final state represents the answer to the original problem.

### Final Result

```text
Minimum coins = 3
```
