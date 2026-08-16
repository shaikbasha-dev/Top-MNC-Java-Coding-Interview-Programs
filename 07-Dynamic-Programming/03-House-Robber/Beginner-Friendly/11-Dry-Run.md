# 11 — Dry Run

## Complete Program

```java
public class HouseRobber {
    static int rob(int[] money) {
        if (money.length == 0) return 0;
        if (money.length == 1) return money[0];

        int[] dp = new int[money.length];
        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < money.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
        }

        return dp[money.length - 1];
    }

    public static void main(String[] args) {
        int[] money = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount = " + rob(money));
    }
}
```

## Dry Run — Step by Step

### Step 1 — Input

```text
money = [2, 7, 9, 3, 1]
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
Maximum amount = 12
```
