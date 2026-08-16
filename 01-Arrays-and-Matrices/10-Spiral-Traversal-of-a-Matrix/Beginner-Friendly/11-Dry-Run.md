# Dry Run — Spiral Traversal of a Matrix

## Complete Program

```java
public class SpiralTraversalofaMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        System.out.print("Spiral Order = ");

        while (top <= bottom && left <= right) {

            for (int column = left; column <= right; column++) {
                System.out.print(matrix[top][column] + " ");
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int column = right; column >= left; column--) {
                    System.out.print(matrix[bottom][column] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
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
Spiral Order = 1 2 3 6 9 8 7 4 5
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
