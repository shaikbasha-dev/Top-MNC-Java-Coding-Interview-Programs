# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
import java.util.*;

public class GenerateAllPermutations {
    static void generate(int[] numbers, int index) {
        if (index == numbers.length) {
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            swap(numbers, index, i);
            generate(numbers, index + 1);
            swap(numbers, index, i);
        }
    }

    static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0);
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
