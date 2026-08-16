# Dry Run — Rearrange Positive and Negative Numbers Alternately

## Complete Program

```java
public class RearrangePositiveandNegativeNumbersAlternately {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, -1, 4};
        int arraySize = numbers.length;

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        int[] positives = new int[positiveCount];
        int[] negatives = new int[negativeCount];

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] >= 0) {
                positives[positiveIndex] = numbers[i];
                positiveIndex++;
            } else {
                negatives[negativeIndex] = numbers[i];
                negativeIndex++;
            }
        }

        int positivePosition = 0;
        int negativePosition = 0;

        for (int i = 0; i < arraySize; i++) {
            if (positivePosition < positiveCount && negativePosition < negativeCount) {
                if (i % 2 == 0) {
                    numbers[i] = positives[positivePosition];
                    positivePosition++;
                } else {
                    numbers[i] = negatives[negativePosition];
                    negativePosition++;
                }
            } else if (positivePosition < positiveCount) {
                numbers[i] = positives[positivePosition];
                positivePosition++;
            } else {
                numbers[i] = negatives[negativePosition];
                negativePosition++;
            }
        }

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i]);
            if (i < arraySize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
```

## Dry Run

The dry run follows the program as if we were the computer executing it.

### Step 1 — Program starts

Java enters the `main()` method and creates the input data.

### Step 2 — Initial values

The program creates the variables required by the algorithm and gives them their starting values.

### Step 3 — First processing step

The first required element, row, column, or boundary is processed according to the program's condition.

### Step 4 — Repeated processing

The loop continues. At each iteration, the program reads the current value, compares or calculates as required, and updates its variables.

### Step 5 — Important intermediate result

The program keeps the best/current result in its designated variable. Each later iteration either improves it or leaves it unchanged.

### Step 6 — Completion

After the final required element is processed, the loop ends and the final result is displayed.

### Final Result

```text
Result = [1, -4, 2, -1, 3, 4]
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
