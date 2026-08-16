# Optimized Dry Run — Maximum Sum Row/Column in a Matrix

## Complete Expert Program

```java
public class MaximumSumRowColumninaMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
        int rows = matrix.length;
        int columns = matrix[0].length;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) rowSum += matrix[i][j];
            maximumSum = Math.max(maximumSum, rowSum);
        }

        for (int j = 0; j < columns; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) columnSum += matrix[i][j];
            maximumSum = Math.max(maximumSum, columnSum);
        }

        System.out.println("Maximum Sum = " + maximumSum);
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
Maximum Sum = 24
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
