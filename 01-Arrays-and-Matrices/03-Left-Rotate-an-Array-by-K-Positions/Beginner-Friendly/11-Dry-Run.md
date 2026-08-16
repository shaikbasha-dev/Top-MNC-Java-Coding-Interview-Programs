# Dry Run — Left Rotate an Array by K Positions

## Complete Program

```java
public class LeftRotateanArraybyKPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int arraySize = numbers.length;

        k = k % arraySize;

        int[] rotatedArray = new int[arraySize];
        int newIndex = 0;

        for (int i = k; i < arraySize; i++) {
            rotatedArray[newIndex] = numbers[i];
            newIndex++;
        }

        for (int i = 0; i < k; i++) {
            rotatedArray[newIndex] = numbers[i];
            newIndex++;
        }

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(rotatedArray[i]);
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
Result = [4, 5, 6, 7, 1, 2, 3]
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
