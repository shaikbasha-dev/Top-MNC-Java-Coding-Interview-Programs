# 02 — Algorithm

1. Create dp where dp[i] is the maximum money obtainable from the first i+1 houses.
2. For each house, either skip it or rob it together with the best result two houses earlier.
3. Take the larger choice.
4. Return the final value.
