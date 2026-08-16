# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## DP State Trace

Input:

```text
first = "abcde", second = "ace"
```

The table or array is initialized, then each state is calculated from its required predecessor states.

Final answer:

```text
LCS length = 3
```
