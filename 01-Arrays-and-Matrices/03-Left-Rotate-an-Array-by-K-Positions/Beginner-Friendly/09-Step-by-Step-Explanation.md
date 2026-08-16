# Step-by-Step Explanation — Left Rotate an Array by K Positions

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class LeftRotateanArraybyKPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int arraySize = numbers.length;

        k = k % arraySize;

        int[] rotatedArray = new int[arraySize];
        int newIndex = 0;

        for (int i = k; i < arraySize; i++) {
            rotatedArray[newIndex] = numbers[i];
            newIndex++;
        }

        for (int i = 0; i < k; i++) {
            rotatedArray[newIndex] = numbers[i];
            newIndex++;
        }

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(rotatedArray[i]);
            if (i < arraySize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
```

## Step-by-Step Walkthrough

### Step 1

```java
public class LeftRotateanArraybyKPositions {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int k = 3;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 5

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 6

```java
k = k % arraySize;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 7

```java
int[] rotatedArray = new int[arraySize];
```

This line creates and initializes the array used as the program's input data.

### Step 8

```java
int newIndex = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 9

```java
for (int i = k; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 10

```java
rotatedArray[newIndex] = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
newIndex++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 12

```java
for (int i = 0; i < k; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 13

```java
rotatedArray[newIndex] = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 14

```java
newIndex++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 15

```java
System.out.print("Result = [");
```

This line displays part of the final result on the console.

### Step 16

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 17

```java
System.out.print(rotatedArray[i]);
```

This line displays part of the final result on the console.

### Step 18

```java
if (i < arraySize - 1) {
```

This line makes a decision based on the current values.

### Step 19

```java
System.out.print(", ");
```

This line displays part of the final result on the console.

### Step 20

```java
System.out.println("]");
```

This line displays part of the final result on the console.
