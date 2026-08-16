# 11 — Dry Run

## Complete Program

```java
import java.util.*;

public class GenerateAllSubsets {
    static void generate(int[] numbers, int index, List<Integer> current) {
        if (index == numbers.length) {
            System.out.println(current);
            return;
        }

        current.add(numbers[index]);
        generate(numbers, index + 1, current);

        current.remove(current.size() - 1);
        generate(numbers, index + 1, current);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        generate(numbers, 0, new ArrayList<>());
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: numbers = [1, 2, 3]
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
[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]
```
