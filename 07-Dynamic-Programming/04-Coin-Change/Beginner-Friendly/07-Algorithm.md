# 07 — Algorithm

1. Create dp where dp[x] is the minimum coins needed for amount x.
2. Set dp[0] to zero and other states to a large value.
3. Try every coin for every amount.
4. Update using dp[current - coin] + 1.
5. Return the result or -1.
