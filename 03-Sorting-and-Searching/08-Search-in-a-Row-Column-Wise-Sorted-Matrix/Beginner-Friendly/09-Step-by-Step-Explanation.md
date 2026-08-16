# 09 — Step-by-Step Explanation

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

## Explanation of the Program

### Step 1
```java
public class SearchInARowColumnWiseSortedMatrix {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[][] matrix = {
```

This initializes or updates an important variable used by the algorithm.

### Step 4
```java
{10, 20, 30, 40},
```

This statement performs a supporting operation required by the algorithm.

### Step 5
```java
{15, 25, 35, 45},
```

This statement performs a supporting operation required by the algorithm.

### Step 6
```java
{27, 29, 37, 48},
```

This statement performs a supporting operation required by the algorithm.

### Step 7
```java
{32, 33, 39, 50}
```

This statement performs a supporting operation required by the algorithm.

### Step 8
```java
};
```

This statement performs a supporting operation required by the algorithm.

### Step 10
```java
int target = 29;
```

This initializes or updates an important variable used by the algorithm.

### Step 11
```java
search(matrix, target);
```

This statement performs a supporting operation required by the algorithm.

### Step 12
```java
}
```

This marks the beginning or end of a Java block.

### Step 14
```java
static void search(int[][] matrix, int target) {
```

This statement performs a supporting operation required by the algorithm.

### Step 15
```java
int row = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 16
```java
int column = matrix[0].length - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 18
```java
while (row < matrix.length && column >= 0) {
```

This loop repeats the operation over the required range of values.

### Step 19
```java
if (matrix[row][column] == target) {
```

This condition decides which branch of the algorithm should execute.

### Step 20
```java
System.out.println("Target Found at Row = " + row +
```

This displays the result on the console.

### Step 21
```java
", Column = " + column);
```

This initializes or updates an important variable used by the algorithm.

### Step 22
```java
return;
```

This returns the required result or stops the current method.

### Step 23
```java
}
```

This marks the beginning or end of a Java block.

### Step 25
```java
if (matrix[row][column] > target) {
```

This condition decides which branch of the algorithm should execute.

### Step 26
```java
column--;
```

This statement performs a supporting operation required by the algorithm.

### Step 27
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 28
```java
row++;
```

This statement performs a supporting operation required by the algorithm.

### Step 29
```java
}
```

This marks the beginning or end of a Java block.

### Step 30
```java
}
```

This marks the beginning or end of a Java block.

### Step 32
```java
System.out.println("Target Not Found");
```

This displays the result on the console.

### Step 33
```java
}
```

This marks the beginning or end of a Java block.

### Step 34
```java
}
```

This marks the beginning or end of a Java block.
