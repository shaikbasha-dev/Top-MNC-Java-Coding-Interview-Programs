# 11 — Dry Run

## Complete Program

```java
public class SearchInARowColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int target = 29;
        search(matrix, target);
    }

    static void search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                System.out.println("Target Found at Row = " + row +
                                   ", Column = " + column);
                return;
            }

            if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }

        System.out.println("Target Not Found");
    }
}
```

## Dry Run — Every Important Step

### Step 1
Start at row 0, last column: value 40.

### Step 2
40 is greater than 29, so move left to 30.

### Step 3
30 is greater than 29, so move left to 20.

### Step 4
20 is smaller than 29, so move down to 25 and then 29.

### Step 5
Target 29 is found at row 2, column 1.

### Final Result
```text
Target Found at Row = 2, Column = 1
```
