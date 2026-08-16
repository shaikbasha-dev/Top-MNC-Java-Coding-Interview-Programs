# 02 — Algorithm

1. Set every dp[i] to 1 because each element forms an increasing subsequence of length one.
2. For every pair j before i, if numbers[j] < numbers[i], extend the subsequence.
3. Track the maximum length.
4. Return it.
