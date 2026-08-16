# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class EditDistance {
    static int editDistance(String first, String second) {
        int m = first.length();
        int n = second.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int insert = dp[i][j - 1];
                    int delete = dp[i - 1][j];
                    int replace = dp[i - 1][j - 1];

                    dp[i][j] = 1 + Math.min(
                        replace,
                        Math.min(insert, delete)
                    );
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String first = "horse";
        String second = "ros";

        System.out.println("Edit distance = "
                + editDistance(first, second));
    }
}
```

## DP State Trace

Input:

```text
first = "horse", second = "ros"
```

The table or array is initialized, then each state is calculated from its required predecessor states.

Final answer:

```text
Edit distance = 3
```
