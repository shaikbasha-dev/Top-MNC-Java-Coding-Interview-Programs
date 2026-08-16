# 02 — Algorithm

1. Create dp[i][j] as the minimum edits to convert the first i characters into the first j characters.
2. Initialize empty-string cases.
3. If characters match, copy the diagonal value.
4. Otherwise choose the minimum of insert, delete and replace plus one.
5. Return dp[m][n].
