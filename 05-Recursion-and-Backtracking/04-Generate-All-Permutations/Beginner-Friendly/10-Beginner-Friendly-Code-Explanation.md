# 10 — Beginner-Friendly Code Explanation

## Complete Code

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

## Line-by-Line Beginner Explanation

- The class contains the complete solution.
- `main()` creates the starting input.
- The recursive method receives the current state.
- The base case answers the question: **“Have we completed one valid solution?”**
- If not, the program tries one possible choice.
- The recursive call means: **“Now solve the remaining smaller problem.”**
- After returning, the program undoes the choice.
- This undo operation is the heart of backtracking.
- The loop tries the next possible choice.
- The process continues until all valid branches are explored.

### Easy Way to Remember

**Choose → Explore → Undo → Choose another.**
