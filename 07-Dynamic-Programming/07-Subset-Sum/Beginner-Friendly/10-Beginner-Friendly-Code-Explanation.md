# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
public class SubsetSum {
    static boolean subsetSum(int[] numbers, int target) {
        boolean[][] dp = new boolean[numbers.length + 1][target + 1];

        for (int i = 0; i <= numbers.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= numbers.length; i++) {
            for (int sum = 1; sum <= target; sum++) {
                dp[i][sum] = dp[i - 1][sum];

                if (numbers[i - 1] <= sum) {
                    dp[i][sum] = dp[i][sum]
                            || dp[i - 1][sum - numbers[i - 1]];
                }
            }
        }

        return dp[numbers.length][target];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 34, 4, 12, 5, 2};
        int target = 9;

        System.out.println("Subset exists = "
                + subsetSum(numbers, target));
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
