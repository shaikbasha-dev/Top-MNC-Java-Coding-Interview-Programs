# 08 — Pseudocode

```text
START
    Sort intervals by start value.
    Take the first interval as the current interval.
    For every next interval, compare its start with current end.
    If they overlap, extend the current end.
    Otherwise, store the current interval and start a new one.
    Store the final interval.
    DISPLAY result
END
```

## Purpose

The pseudocode describes the algorithm without Java syntax. It should be understandable even before reading the implementation.
