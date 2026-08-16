# Optimized Dry Run — Find Pairs with a Given Target Sum

## Complete Expert Program

```java
import java.util.HashSet;
import java.util.Set;

public class FindPairswithaGivenTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6};
        int target = 9;

        Set<Integer> seen = new HashSet<>();

        System.out.println("Pairs:");

        for (int number : numbers) {
            int requiredNumber = target - number;

            if (seen.contains(requiredNumber)) {
                System.out.println("(" + requiredNumber + ", " + number + ")");
            }

            seen.add(number);
        }
    }
}
```

## Execution Walkthrough

### Step 1

The program enters `main()` and creates the input.

### Step 2

The optimized variables are initialized.

### Step 3

The first iteration processes the first relevant value.

### Step 4

Each subsequent iteration updates the maintained state rather than recomputing the whole answer.

### Step 5

The final iteration completes the required traversal.

### Step 6

The result is displayed.

## Final Output

```text
Pairs = (2, 7), (3, 6)
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
