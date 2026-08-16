# Step-by-Step Explanation — Replace Each Element with the Greatest Element to Its Right

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class ReplaceEachElementwiththeGreatestElementtoItsRight {
    public static void main(String[] args) {
        int[] numbers = {17, 18, 5, 4, 6, 1};
        int arraySize = numbers.length;

        for (int i = 0; i < arraySize - 1; i++) {
            int greatestRight = numbers[i + 1];

            for (int j = i + 2; j < arraySize; j++) {
                int currentNumber = numbers[j];

                if (currentNumber > greatestRight) {
                    greatestRight = currentNumber;
                }
            }

            numbers[i] = greatestRight;
        }

        numbers[arraySize - 1] = -1;

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i]);
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
public class ReplaceEachElementwiththeGreatestElementtoItsRight {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {17, 18, 5, 4, 6, 1};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 5

```java
for (int i = 0; i < arraySize - 1; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 6

```java
int greatestRight = numbers[i + 1];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 7

```java
for (int j = i + 2; j < arraySize; j++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 8

```java
int currentNumber = numbers[j];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 9

```java
if (currentNumber > greatestRight) {
```

This line makes a decision based on the current values.

### Step 10

```java
greatestRight = currentNumber;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
numbers[i] = greatestRight;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 12

```java
numbers[arraySize - 1] = -1;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 13

```java
System.out.print("Result = [");
```

This line displays part of the final result on the console.

### Step 14

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 15

```java
System.out.print(numbers[i]);
```

This line displays part of the final result on the console.

### Step 16

```java
if (i < arraySize - 1) {
```

This line makes a decision based on the current values.

### Step 17

```java
System.out.print(", ");
```

This line displays part of the final result on the console.

### Step 18

```java
System.out.println("]");
```

This line displays part of the final result on the console.
