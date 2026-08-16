# 07 — Algorithm

1. Create dp[i][j] for the first i characters of the first string and first j characters of the second.
2. If characters match, extend the diagonal result.
3. Otherwise take the better result from top or left.
4. Return dp[m][n].
