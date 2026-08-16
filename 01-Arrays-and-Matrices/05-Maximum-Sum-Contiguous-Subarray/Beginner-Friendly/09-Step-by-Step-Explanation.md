# Step-by-Step Explanation — Maximum Sum Contiguous Subarray

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class MaximumSumContiguousSubarray {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arraySize = numbers.length;

        int currentSum = numbers[0];
        int maximumSum = numbers[0];

        for (int i = 1; i < arraySize; i++) {
            int currentNumber = numbers[i];
            int newSum = currentSum + currentNumber;

            if (currentNumber > newSum) {
                currentSum = currentNumber;
            } else {
                currentSum = newSum;
            }

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        System.out.println("Maximum Sum = " + maximumSum);
    }
}
```

## Step-by-Step Walkthrough

### Step 1

```java
public class MaximumSumContiguousSubarray {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 5

```java
int currentSum = numbers[0];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 6

```java
int maximumSum = numbers[0];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 7

```java
for (int i = 1; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 8

```java
int currentNumber = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 9

```java
int newSum = currentSum + currentNumber;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 10

```java
if (currentNumber > newSum) {
```

This line makes a decision based on the current values.

### Step 11

```java
currentSum = currentNumber;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 12

```java
} else {
```

This line performs part of the program's processing.

### Step 13

```java
currentSum = newSum;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 14

```java
if (currentSum > maximumSum) {
```

This line makes a decision based on the current values.

### Step 15

```java
maximumSum = currentSum;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 16

```java
System.out.println("Maximum Sum = " + maximumSum);
```

This line displays part of the final result on the console.
