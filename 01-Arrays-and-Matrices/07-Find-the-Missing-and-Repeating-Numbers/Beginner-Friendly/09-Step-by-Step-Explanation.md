# Step-by-Step Explanation — Find the Missing and Repeating Numbers

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

## Complete Program

```java
public class FindtheMissingandRepeatingNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 2, 1, 1};
        int arraySize = numbers.length;

        int[] frequency = new int[arraySize + 1];

        for (int i = 0; i < arraySize; i++) {
            int currentNumber = numbers[i];
            frequency[currentNumber]++;
        }

        int missing = 0;
        int repeating = 0;

        for (int i = 1; i <= arraySize; i++) {
            if (frequency[i] == 0) {
                missing = i;
            }

            if (frequency[i] == 2) {
                repeating = i;
            }
        }

        System.out.println("Missing = " + missing);
        System.out.println("Repeating = " + repeating);
    }
}
```

## Step-by-Step Walkthrough

### Step 1

```java
public class FindtheMissingandRepeatingNumbers {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] numbers = {4, 3, 6, 2, 1, 1};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int arraySize = numbers.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 5

```java
int[] frequency = new int[arraySize + 1];
```

This line creates and initializes the array used as the program's input data.

### Step 6

```java
for (int i = 0; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 7

```java
int currentNumber = numbers[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 8

```java
frequency[currentNumber]++;
```

This line changes the loop/index variable so the program can move to the next required position.

### Step 9

```java
int missing = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 10

```java
int repeating = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
for (int i = 1; i <= arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 12

```java
if (frequency[i] == 0) {
```

This line makes a decision based on the current values.

### Step 13

```java
missing = i;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 14

```java
if (frequency[i] == 2) {
```

This line makes a decision based on the current values.

### Step 15

```java
repeating = i;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 16

```java
System.out.println("Missing = " + missing);
```

This line displays part of the final result on the console.

### Step 17

```java
System.out.println("Repeating = " + repeating);
```

This line displays part of the final result on the console.
