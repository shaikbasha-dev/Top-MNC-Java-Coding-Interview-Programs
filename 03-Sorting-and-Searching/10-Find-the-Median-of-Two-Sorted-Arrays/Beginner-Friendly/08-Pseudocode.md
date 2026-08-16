# 08 — Pseudocode

```text
START
    Always binary-search the smaller array.
    Choose a partition in the smaller array.
    Derive the corresponding partition in the other array.
    Check whether all left values are <= all right values.
    If valid, calculate the median.
    Otherwise move the partition left or right.
    DISPLAY result
END
```

## Purpose

The pseudocode describes the algorithm without Java syntax. It should be understandable even before reading the implementation.
