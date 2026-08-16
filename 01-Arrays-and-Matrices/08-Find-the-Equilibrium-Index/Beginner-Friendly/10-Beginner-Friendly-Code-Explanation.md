# Beginner-Friendly Code Explanation — Find the Equilibrium Index

The complete program is shown first. The explanation then discusses the code line by line in simple conversational language.

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

## Line-by-Line Explanation

### Line 1
```java
public class FindtheEquilibriumIndex {
```

This creates the class. Think of the class as the container in which our Java program lives.

### Line 2
```java
    public static void main(String[] args) {
```

This is the main method. When we run the program, Java starts executing from here.

### Line 3
```java
        int[] numbers = {-7, 1, 5, 2, -4, 3, 0};
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 4
```java
        int arraySize = numbers.length;
```

Here we obtain the number of elements in the array and store it in a variable. Keeping this value in a variable makes the later loop easier for a beginner to follow.

### Line 6
```java
        int totalSum = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 8
```java
        for (int i = 0; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 9
```java
            totalSum = totalSum + numbers[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 10
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 12
```java
        int leftSum = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 13
```java
        int equilibriumIndex = -1;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 15
```java
        for (int i = 0; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 16
```java
            int currentNumber = numbers[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 17
```java
            int rightSum = totalSum - leftSum - currentNumber;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 19
```java
            if (leftSum == rightSum) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 20
```java
                equilibriumIndex = i;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 21
```java
                break;
```

This line performs one small part of the overall algorithm.

### Line 22
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 24
```java
            leftSum = leftSum + currentNumber;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 25
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 27
```java
        System.out.println("Equilibrium Index = " + equilibriumIndex);
```

This displays the result on the console. We use it when we want the output to appear and then move to a new line.

### Line 28
```java
    }
```

This line performs one small part of the overall algorithm.

### Line 29
```java
}
```

This line performs one small part of the overall algorithm.
