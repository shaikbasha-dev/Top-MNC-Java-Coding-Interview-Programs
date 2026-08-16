# 02 — Algorithm

1. Create a table where dp[i][w] is the maximum value using the first i items and capacity w.
2. For each item, first exclude it.
3. If it fits, compare exclusion with inclusion.
4. Return dp[n][capacity].
