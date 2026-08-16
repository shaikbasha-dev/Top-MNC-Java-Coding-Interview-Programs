# 05 — Optimized Dry Run

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

## DP State Trace

Input:

```text
weights = [1,3,4,5], values = [1,4,5,7], capacity = 7
```

The table or array is initialized, then each state is calculated from its required predecessor states.

Final answer:

```text
Maximum value = 9
```
