# 09 — Step-by-Step Explanation

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

## Step-by-Step Program Explanation

1. **Program setup:** Define the class and required helper methods.
2. **Input setup:** Create the sample data.
3. **Initial call:** Start recursion with the initial index, position or state.
4. **Base-case check:** Determine whether the complete solution has been formed.
5. **Make a choice:** Select one possible candidate.
6. **Recursive call:** Solve the remaining smaller problem.
7. **Backtrack:** Undo the choice so another branch can be explored.
8. **Repeat:** Continue until every required branch has been processed.
9. **Output:** Display or return the generated result.
