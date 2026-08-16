# 02 — Optimized Algorithm

1. Sort intervals by start value.
2. Take the first interval as the current interval.
3. For every next interval, compare its start with current end.
4. If they overlap, extend the current end.
5. Otherwise, store the current interval and start a new one.
6. Store the final interval.

The optimized implementation should preserve correctness while reducing unnecessary comparisons, scans or storage where the problem allows it.
