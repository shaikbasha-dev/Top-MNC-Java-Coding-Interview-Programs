# Dry Run — Maximum Sum Row/Column in a Matrix

## Complete Program

```java
public class MaximumSumRowColumninaMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;
        int maximumSum = 0;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;

            for (int j = 0; j < columns; j++) {
                rowSum = rowSum + matrix[i][j];
            }

            if (i == 0 || rowSum > maximumSum) {
                maximumSum = rowSum;
            }
        }

        for (int j = 0; j < columns; j++) {
            int columnSum = 0;

            for (int i = 0; i < rows; i++) {
                columnSum = columnSum + matrix[i][j];
            }

            if (columnSum > maximumSum) {
                maximumSum = columnSum;
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
Maximum Sum = 24
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
