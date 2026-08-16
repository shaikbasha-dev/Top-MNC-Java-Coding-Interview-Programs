# 05 — Optimized Dry Run

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

## State Trace

Start with:

```text
numbers = [1, 2, 3]
```

Then repeatedly:

```text
Choose -> Recurse -> Reach base case or reject -> Undo -> Try next choice
```

Final result:

```text
[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]
```
