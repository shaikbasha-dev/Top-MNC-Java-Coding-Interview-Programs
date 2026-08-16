# 08 — Pseudocode

```text
START
    Read the input
    Define the base case
    If base case is reached
        record or display the result
        RETURN
    END IF

    For every valid choice
        make the choice
        recursively solve the smaller problem
        undo the choice
    END FOR
END
```

## Key Idea

The recursive calls form a decision tree. Backtracking ensures that each branch starts from the correct previous state.
