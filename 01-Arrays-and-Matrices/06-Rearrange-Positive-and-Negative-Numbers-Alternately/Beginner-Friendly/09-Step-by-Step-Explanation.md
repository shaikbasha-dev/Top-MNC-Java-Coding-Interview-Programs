# Step-by-Step Explanation — Rearrange Positive and Negative Numbers Alternately

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class RearrangePositiveandNegativeNumbersAlternately {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, -1, 4};
        int arraySize = numbers.length;

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        int[] positives = new int[positiveCount];
        int[] negatives = new int[negativeCount];

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] >= 0) {
                positives[positiveIndex] = numbers[i];
                positiveIndex++;
            } else {
                negatives[negativeIndex] = numbers[i];
                negativeIndex++;
            }
        }

        int positivePosition = 0;
        int negativePosition = 0;

        for (int i = 0; i < arraySize; i++) {
            if (positivePosition < positiveCount && negativePosition < negativeCount) {
                if (i % 2 == 0) {
                    numbers[i] = positives[positivePosition];
                    positivePosition++;
                } else {
                    numbers[i] = negatives[negativePosition];
                    negativePosition++;
                }
            } else if (positivePosition < positiveCount) {
                numbers[i] = positives[positivePosition];
                positivePosition++;
            } else {
                numbers[i] = negatives[negativePosition];
                negativePosition++;
            }
        }

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
public class RearrangePositiveandNegativeNumbersAlternately {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {1, 2, 3, -4, -1, 4};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 5

```java
int positiveCount = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 6

```java
int negativeCount = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 7

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 8

```java
if (numbers[i] >= 0) {
```

This line makes a decision based on the current values.

### Step 9

```java
positiveCount++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 10

```java
} else {
```

This line performs part of the program's processing.

### Step 11

```java
negativeCount++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 12

```java
int[] positives = new int[positiveCount];
```

This line creates and initializes the array used as the program's input data.

### Step 13

```java
int[] negatives = new int[negativeCount];
```

This line creates and initializes the array used as the program's input data.

### Step 14

```java
int positiveIndex = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 15

```java
int negativeIndex = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 16

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 17

```java
if (numbers[i] >= 0) {
```

This line makes a decision based on the current values.

### Step 18

```java
positives[positiveIndex] = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 19

```java
positiveIndex++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 20

```java
} else {
```

This line performs part of the program's processing.

### Step 21

```java
negatives[negativeIndex] = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 22

```java
negativeIndex++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 23

```java
int positivePosition = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 24

```java
int negativePosition = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 25

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 26

```java
if (positivePosition < positiveCount && negativePosition < negativeCount) {
```

This line makes a decision based on the current values.

### Step 27

```java
if (i % 2 == 0) {
```

This line makes a decision based on the current values.

### Step 28

```java
numbers[i] = positives[positivePosition];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 29

```java
positivePosition++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 30

```java
} else {
```

This line performs part of the program's processing.

### Step 31

```java
numbers[i] = negatives[negativePosition];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 32

```java
negativePosition++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 33

```java
} else if (positivePosition < positiveCount) {
```

This line makes a decision based on the current values.

### Step 34

```java
numbers[i] = positives[positivePosition];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 35

```java
positivePosition++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 36

```java
} else {
```

This line performs part of the program's processing.

### Step 37

```java
numbers[i] = negatives[negativePosition];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 38

```java
negativePosition++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 39

```java
System.out.print("Result = [");
```

This line displays part of the final result on the console.

### Step 40

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 41

```java
System.out.print(numbers[i]);
```

This line displays part of the final result on the console.

### Step 42

```java
if (i < arraySize - 1) {
```

This line makes a decision based on the current values.

### Step 43

```java
System.out.print(", ");
```

This line displays part of the final result on the console.

### Step 44

```java
System.out.println("]");
```

This line displays part of the final result on the console.
