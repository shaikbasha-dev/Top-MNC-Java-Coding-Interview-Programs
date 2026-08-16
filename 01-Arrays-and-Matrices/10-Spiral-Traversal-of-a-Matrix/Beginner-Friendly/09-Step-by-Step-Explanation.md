# Step-by-Step Explanation — Spiral Traversal of a Matrix

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

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

## Step-by-Step Walkthrough

### Step 1

```java
public class SpiralTraversalofaMatrix {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[][] matrix = {
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
{1, 2, 3},
```

This line performs part of the program's processing.

### Step 5

```java
{4, 5, 6},
```

This line performs part of the program's processing.

### Step 6

```java
{7, 8, 9}
```

This line performs part of the program's processing.

### Step 7

```java
};
```

This line performs part of the program's processing.

### Step 8

```java
int rows = matrix.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 9

```java
int columns = matrix[0].length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 10

```java
int top = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
int bottom = rows - 1;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 12

```java
int left = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 13

```java
int right = columns - 1;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 14

```java
System.out.print("Spiral Order = ");
```

This line displays part of the final result on the console.

### Step 15

```java
while (top <= bottom && left <= right) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 16

```java
for (int column = left; column <= right; column++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 17

```java
System.out.print(matrix[top][column] + " ");
```

This line displays part of the final result on the console.

### Step 18

```java
top++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 19

```java
for (int row = top; row <= bottom; row++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 20

```java
System.out.print(matrix[row][right] + " ");
```

This line displays part of the final result on the console.

### Step 21

```java
right--;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 22

```java
if (top <= bottom) {
```

This line makes a decision based on the current values.

### Step 23

```java
for (int column = right; column >= left; column--) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 24

```java
System.out.print(matrix[bottom][column] + " ");
```

This line displays part of the final result on the console.

### Step 25

```java
bottom--;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 26

```java
if (left <= right) {
```

This line makes a decision based on the current values.

### Step 27

```java
for (int row = bottom; row >= top; row--) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 28

```java
System.out.print(matrix[row][left] + " ");
```

This line displays part of the final result on the console.

### Step 29

```java
left++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 30

```java
System.out.println();
```

This line displays part of the final result on the console.
