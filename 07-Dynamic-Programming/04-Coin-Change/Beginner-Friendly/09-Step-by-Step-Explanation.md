# 09 — Step-by-Step Explanation

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

## Step-by-Step Program Explanation

1. **Class and method setup:** Java defines the class and required methods.
2. **Input setup:** The sample input is created in `main()`.
3. **DP state creation:** The required one-dimensional or two-dimensional DP structure is created.
4. **Base-case initialization:** Known answers are stored first.
5. **State transition:** Each new state is calculated from smaller previously solved states.
6. **Choice comparison:** Where alternatives exist, the required minimum, maximum, or boolean result is selected.
7. **Final state:** The state representing the complete problem contains the answer.
8. **Output:** The final answer is printed.
