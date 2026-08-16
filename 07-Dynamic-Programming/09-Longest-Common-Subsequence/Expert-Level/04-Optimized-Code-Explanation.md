# 04 — Optimized Code Explanation

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

## Expert Explanation

The solution uses tabulation to calculate each required state exactly once.

### Expert Points

1. The state definition determines the DP design.
2. Base states are established before dependent states.
3. Every transition uses already calculated states.
4. Unnecessary recursive recomputation is avoided.
5. Space can sometimes be reduced when only recent states are needed.
