# Optimized Dry Run — Rearrange Positive and Negative Numbers Alternately

## Complete Expert Program

```java
public class RearrangePositiveandNegativeNumbersAlternately {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, -1, 4};
        int[] positives = new int[numbers.length];
        int[] negatives = new int[numbers.length];

        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : numbers) {
            if (number >= 0) {
                positives[positiveCount] = number;
                positiveCount++;
            } else {
                negatives[negativeCount] = number;
                negativeCount++;
            }
        }

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && positiveIndex < positiveCount) {
                numbers[i] = positives[positiveIndex];
                positiveIndex++;
            } else if (negativeIndex < negativeCount) {
                numbers[i] = negatives[negativeIndex];
                negativeIndex++;
            } else if (positiveIndex < positiveCount) {
                numbers[i] = positives[positiveIndex];
                positiveIndex++;
            }
        }

        System.out.print("Result = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println("]");
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
Result = [1, -4, 2, -1, 3, 4]
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
