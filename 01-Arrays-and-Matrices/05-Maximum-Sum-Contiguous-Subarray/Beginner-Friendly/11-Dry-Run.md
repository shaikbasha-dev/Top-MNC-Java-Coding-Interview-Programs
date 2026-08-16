# Dry Run — Maximum Sum Contiguous Subarray

## Complete Program

```java
public class MaximumSumContiguousSubarray {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arraySize = numbers.length;

        int currentSum = numbers[0];
        int maximumSum = numbers[0];

        for (int i = 1; i < arraySize; i++) {
            int currentNumber = numbers[i];
            int newSum = currentSum + currentNumber;

            if (currentNumber > newSum) {
                currentSum = currentNumber;
            } else {
                currentSum = newSum;
            }

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        System.out.println("Maximum Sum = " + maximumSum);
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
Maximum Sum = 6
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
