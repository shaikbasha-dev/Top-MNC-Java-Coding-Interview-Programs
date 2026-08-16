# 02 — Algorithm

1. Let dp[i] be the minimum cost to reach step i.
2. For every step, reach it from one or two steps below.
3. Choose the cheaper previous route.
4. Return dp[n].
