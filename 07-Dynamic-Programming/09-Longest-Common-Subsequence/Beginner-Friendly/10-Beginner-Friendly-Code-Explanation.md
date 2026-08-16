# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
public class LongestCommonSubsequence {
    static int lcs(String first, String second) {
        int m = first.length();
        int n = second.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String first = "abcde";
        String second = "ace";

        System.out.println("LCS length = " + lcs(first, second));
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
