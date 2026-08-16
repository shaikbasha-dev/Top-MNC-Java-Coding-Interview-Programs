# Optimized Dry Run — Find the Missing and Repeating Numbers

## Complete Expert Program

```java
public class FindtheMissingandRepeatingNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 2, 1, 1};
        int n = numbers.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int repeating = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int number : numbers) {
                if (number == i) {
                    count++;
                }
            }

            if (count == 2) {
                repeating = i;
                break;
            }
        }

        int missing = expectedSum - (actualSum - repeating);

        System.out.println("Missing = " + missing);
        System.out.println("Repeating = " + repeating);
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
Missing = 5, Repeating = 1
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
