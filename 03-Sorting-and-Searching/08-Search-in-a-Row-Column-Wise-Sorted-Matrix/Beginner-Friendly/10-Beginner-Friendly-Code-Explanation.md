# 10 — Beginner-Friendly Code Explanation

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

## Line-by-Line Beginner Explanation

### Line 1
```java
public class SearchInARowColumnWiseSortedMatrix {
```

This creates the class that contains the program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 3
```java
        int[][] matrix = {
```

This declares an array and stores the input data.

### Line 4
```java
            {10, 20, 30, 40},
```

This line supports the current algorithmic step.

### Line 5
```java
            {15, 25, 35, 45},
```

This line supports the current algorithmic step.

### Line 6
```java
            {27, 29, 37, 48},
```

This line supports the current algorithmic step.

### Line 7
```java
            {32, 33, 39, 50}
```

This line supports the current algorithmic step.

### Line 8
```java
        };
```

This line supports the current algorithmic step.

### Line 10
```java
        int target = 29;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 11
```java
        search(matrix, target);
```

This line supports the current algorithmic step.

### Line 12
```java
    }
```

This line supports the current algorithmic step.

### Line 14
```java
    static void search(int[][] matrix, int target) {
```

This declares an array and stores the input data.

### Line 15
```java
        int row = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 16
```java
        int column = matrix[0].length - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 18
```java
        while (row < matrix.length && column >= 0) {
```

This repeats the logic for the required elements.

### Line 19
```java
            if (matrix[row][column] == target) {
```

This checks a condition and selects the correct action.

### Line 20
```java
                System.out.println("Target Found at Row = " + row +
```

This prints the final result so we can verify the program.

### Line 21
```java
                                   ", Column = " + column);
```

This assigns or updates a variable that represents part of the algorithm.

### Line 22
```java
                return;
```

This sends control or a value back to the calling method.

### Line 23
```java
            }
```

This line supports the current algorithmic step.

### Line 25
```java
            if (matrix[row][column] > target) {
```

This checks a condition and selects the correct action.

### Line 26
```java
                column--;
```

This line supports the current algorithmic step.

### Line 27
```java
            } else {
```

This handles the alternative condition.

### Line 28
```java
                row++;
```

This line supports the current algorithmic step.

### Line 29
```java
            }
```

This line supports the current algorithmic step.

### Line 30
```java
        }
```

This line supports the current algorithmic step.

### Line 32
```java
        System.out.println("Target Not Found");
```

This prints the final result so we can verify the program.

### Line 33
```java
    }
```

This line supports the current algorithmic step.

### Line 34
```java
}
```

This line supports the current algorithmic step.
