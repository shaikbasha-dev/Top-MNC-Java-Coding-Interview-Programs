# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The implementation maintains a compact recursive state and explores only the choices necessary for the current branch.

### Important Expert Points

1. The base case guarantees termination.
2. Each recursive call reduces or advances the problem.
3. Backtracking restores state before another branch begins.
4. Validation or pruning prevents invalid states from being explored further.
5. The complexity depends on the size of the recursion tree.
