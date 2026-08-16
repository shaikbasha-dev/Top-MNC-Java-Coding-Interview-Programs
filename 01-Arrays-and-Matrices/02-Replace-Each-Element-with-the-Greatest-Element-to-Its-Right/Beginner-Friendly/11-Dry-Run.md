# Dry Run — Replace Each Element with the Greatest Element to Its Right

## Complete Program

```java
public class ReplaceEachElementwiththeGreatestElementtoItsRight {
    public static void main(String[] args) {
        int[] numbers = {17, 18, 5, 4, 6, 1};
        int arraySize = numbers.length;

        for (int i = 0; i < arraySize - 1; i++) {
            int greatestRight = numbers[i + 1];

            for (int j = i + 2; j < arraySize; j++) {
                int currentNumber = numbers[j];

                if (currentNumber > greatestRight) {
                    greatestRight = currentNumber;
                }
            }

            numbers[i] = greatestRight;
        }

        numbers[arraySize - 1] = -1;

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
Result = [18, 6, 6, 6, 1, -1]
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
