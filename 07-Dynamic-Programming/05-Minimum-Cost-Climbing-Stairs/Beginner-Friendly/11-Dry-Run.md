# 11 — Dry Run

## Complete Program

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

## Dry Run — Step by Step

### Step 1 — Input

```text
cost = [10, 15, 20]
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
Minimum cost = 15
```
