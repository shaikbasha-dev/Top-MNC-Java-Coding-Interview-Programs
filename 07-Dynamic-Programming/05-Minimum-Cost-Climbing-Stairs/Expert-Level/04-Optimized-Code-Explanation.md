# 04 — Optimized Code Explanation

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

## Expert Explanation

The solution uses tabulation to calculate each required state exactly once.

### Expert Points

1. The state definition determines the DP design.
2. Base states are established before dependent states.
3. Every transition uses already calculated states.
4. Unnecessary recursive recomputation is avoided.
5. Space can sometimes be reduced when only recent states are needed.
