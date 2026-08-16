# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
public class Knapsack01 {
    static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                dp[i][w] = dp[i - 1][w];

                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        dp[i][w],
                        values[i - 1] + dp[i - 1][w - weights[i - 1]]
                    );
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;

        System.out.println("Maximum value = "
                + knapsack(weights, values, capacity));
    }
}
```

## Expert Explanation

The solution uses tabulation to calculate each required state exactly once.

### Expert Points

1. The state definition determines the DP design.
2. Base states are established before dependent states.
3. Every transition uses already calculated states.
4. Unnecessary recursive recomputation is avoided.
5. Space can sometimes be reduced when only recent states are needed.
