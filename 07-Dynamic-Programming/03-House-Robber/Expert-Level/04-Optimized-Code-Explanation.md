# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The solution uses tabulation to calculate each required state exactly once.

### Expert Points

1. The state definition determines the DP design.
2. Base states are established before dependent states.
3. Every transition uses already calculated states.
4. Unnecessary recursive recomputation is avoided.
5. Space can sometimes be reduced when only recent states are needed.
