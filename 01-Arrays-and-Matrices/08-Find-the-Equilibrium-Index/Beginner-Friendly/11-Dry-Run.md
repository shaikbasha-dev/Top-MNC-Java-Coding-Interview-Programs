# Dry Run — Find the Equilibrium Index

## Complete Program

```java
public class FindtheEquilibriumIndex {
    public static void main(String[] args) {
        int[] numbers = {-7, 1, 5, 2, -4, 3, 0};
        int arraySize = numbers.length;

        int totalSum = 0;

        for (int i = 0; i < arraySize; i++) {
            totalSum = totalSum + numbers[i];
        }

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < arraySize; i++) {
            int currentNumber = numbers[i];
            int rightSum = totalSum - leftSum - currentNumber;

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum = leftSum + currentNumber;
        }

        System.out.println("Equilibrium Index = " + equilibriumIndex);
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
Equilibrium Index = 3
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
