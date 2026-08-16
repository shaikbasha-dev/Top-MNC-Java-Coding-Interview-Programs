# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class MinimumCostClimbingStairs {
    static int minCost(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(
                dp[i - 1] + cost[i - 1],
                dp[i - 2] + cost[i - 2]
            );
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println("Minimum cost = " + minCost(cost));
    }
}
```

## DP State Trace

Input:

```text
cost = [10, 15, 20]
```

The table or array is initialized, then each state is calculated from its required predecessor states.

Final answer:

```text
Minimum cost = 15
```
