# 10 — Beginner-Friendly Code Explanation

## Complete Code

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
