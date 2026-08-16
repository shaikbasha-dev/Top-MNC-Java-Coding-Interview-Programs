# 02 — Optimized Algorithm

1. Start at row 0 and the last column.
2. If current value equals target, return its position.
3. If current value is greater than target, move left.
4. If current value is smaller than target, move down.
5. Stop when row or column becomes invalid.

The optimized implementation should preserve correctness while reducing unnecessary comparisons, scans or storage where the problem allows it.
