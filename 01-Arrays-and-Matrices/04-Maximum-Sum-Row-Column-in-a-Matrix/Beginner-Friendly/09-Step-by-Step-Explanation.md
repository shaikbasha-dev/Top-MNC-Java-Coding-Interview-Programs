# Step-by-Step Explanation — Maximum Sum Row/Column in a Matrix

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

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

## Step-by-Step Walkthrough

### Step 1

```java
public class MaximumSumRowColumninaMatrix {
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
int maximumSum = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
for (int i = 0; i < rows; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 12

```java
int rowSum = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 13

```java
for (int j = 0; j < columns; j++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 14

```java
rowSum = rowSum + matrix[i][j];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 15

```java
if (i == 0 || rowSum > maximumSum) {
```

This line makes a decision based on the current values.

### Step 16

```java
maximumSum = rowSum;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 17

```java
for (int j = 0; j < columns; j++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 18

```java
int columnSum = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 19

```java
for (int i = 0; i < rows; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 20

```java
columnSum = columnSum + matrix[i][j];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 21

```java
if (columnSum > maximumSum) {
```

This line makes a decision based on the current values.

### Step 22

```java
maximumSum = columnSum;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 23

```java
System.out.println("Maximum Sum = " + maximumSum);
```

This line displays part of the final result on the console.
