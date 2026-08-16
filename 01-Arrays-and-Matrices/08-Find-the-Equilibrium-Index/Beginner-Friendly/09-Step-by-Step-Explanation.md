# Step-by-Step Explanation — Find the Equilibrium Index

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class FindtheEquilibriumIndex {
    public static void main(String[] args) {
        int[] numbers = {-7, 1, 5, 2, -4, 3, 0};
        int arraySize = numbers.length;

        int totalSum = 0;

        for (int i = 0; i < arraySize; i++) {
            totalSum = totalSum + numbers[i];
        }

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < arraySize; i++) {
            int currentNumber = numbers[i];
            int rightSum = totalSum - leftSum - currentNumber;

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum = leftSum + currentNumber;
        }

        System.out.println("Equilibrium Index = " + equilibriumIndex);
    }
}
```

## Step-by-Step Walkthrough

### Step 1

```java
public class FindtheEquilibriumIndex {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {-7, 1, 5, 2, -4, 3, 0};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 5

```java
int totalSum = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 6

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 7

```java
totalSum = totalSum + numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 8

```java
int leftSum = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 9

```java
int equilibriumIndex = -1;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 10

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 11

```java
int currentNumber = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 12

```java
int rightSum = totalSum - leftSum - currentNumber;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 13

```java
if (leftSum == rightSum) {
```

This line makes a decision based on the current values.

### Step 14

```java
equilibriumIndex = i;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 15

```java
break;
```

This line performs part of the program's processing.

### Step 16

```java
leftSum = leftSum + currentNumber;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 17

```java
System.out.println("Equilibrium Index = " + equilibriumIndex);
```

This line displays part of the final result on the console.
