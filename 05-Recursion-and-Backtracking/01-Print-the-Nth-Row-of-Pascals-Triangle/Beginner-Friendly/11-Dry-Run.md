# 11 — Dry Run

## Complete Program

```java
import java.util.*;

public class PascalNthRow {
    static List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            row.add(1);
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(getRow(n));
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: n = 4
```

### Step 2 — First Recursive Call

The algorithm starts with an empty or initial state.

### Step 3 — Make the First Choice

One candidate is selected and added to the current state.

### Step 4 — Recursive Exploration

The method calls itself with the remaining problem.

### Step 5 — Base Case

When the required state is complete, the solution is recorded or displayed.

### Step 6 — Backtrack

The last choice is removed or restored.

### Step 7 — Try the Next Choice

The next candidate is selected and the same process repeats.

### Final Result

```text
[1, 4, 6, 4, 1]
```
