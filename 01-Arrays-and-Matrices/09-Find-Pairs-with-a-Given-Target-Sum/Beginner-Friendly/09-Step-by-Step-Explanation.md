# Step-by-Step Explanation — Find Pairs with a Given Target Sum

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class FindPairswithaGivenTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6};
        int target = 9;
        int arraySize = numbers.length;

        System.out.println("Pairs:");

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[j];
                int sum = firstNumber + secondNumber;

                if (sum == target) {
                    System.out.println("(" + firstNumber + ", " + secondNumber + ")");
                }
            }
        }
    }
}
```

## Step-by-Step Walkthrough

### Step 1

```java
public class FindPairswithaGivenTargetSum {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {2, 7, 11, 15, 3, 6};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int target = 9;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 5

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 6

```java
System.out.println("Pairs:");
```

This line displays part of the final result on the console.

### Step 7

```java
for (int i = 0; i < arraySize - 1; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 8

```java
for (int j = i + 1; j < arraySize; j++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 9

```java
int firstNumber = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 10

```java
int secondNumber = numbers[j];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
int sum = firstNumber + secondNumber;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 12

```java
if (sum == target) {
```

This line makes a decision based on the current values.

### Step 13

```java
System.out.println("(" + firstNumber + ", " + secondNumber + ")");
```

This line displays part of the final result on the console.
