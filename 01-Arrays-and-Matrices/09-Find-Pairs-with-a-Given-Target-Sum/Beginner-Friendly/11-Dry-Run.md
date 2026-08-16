# Dry Run — Find Pairs with a Given Target Sum

## Complete Program

```java
public class FindPairswithaGivenTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6};
        int target = 9;
        int arraySize = numbers.length;

        System.out.println("Pairs:");

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[j];
                int sum = firstNumber + secondNumber;

                if (sum == target) {
                    System.out.println("(" + firstNumber + ", " + secondNumber + ")");
                }
            }
        }
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
Pairs = (2, 7), (3, 6)
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
