# 02 — Optimized Algorithm

1. Find the middle index.
2. If middle equals target, return it.
3. Determine whether the left half is sorted.
4. If target lies in the sorted half, search there; otherwise search the other half.
5. Repeat until the range is empty.

The optimized implementation should preserve correctness while reducing unnecessary comparisons, scans or storage where the problem allows it.
