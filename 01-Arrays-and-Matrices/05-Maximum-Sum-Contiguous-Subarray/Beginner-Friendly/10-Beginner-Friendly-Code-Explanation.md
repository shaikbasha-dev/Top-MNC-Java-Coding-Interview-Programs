# Beginner-Friendly Code Explanation — Maximum Sum Contiguous Subarray

The complete program is shown first. The explanation then discusses the code line by line in simple conversational language.

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

## Line-by-Line Explanation

### Line 1
```java
public class MaximumSumContiguousSubarray {
```

This creates the class. Think of the class as the container in which our Java program lives.

### Line 2
```java
    public static void main(String[] args) {
```

This is the main method. When we run the program, Java starts executing from here.

### Line 3
```java
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 4
```java
        int arraySize = numbers.length;
```

Here we obtain the number of elements in the array and store it in a variable. Keeping this value in a variable makes the later loop easier for a beginner to follow.

### Line 6
```java
        int currentSum = numbers[0];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 7
```java
        int maximumSum = numbers[0];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 9
```java
        for (int i = 1; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 10
```java
            int currentNumber = numbers[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 11
```java
            int newSum = currentSum + currentNumber;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 13
```java
            if (currentNumber > newSum) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 14
```java
                currentSum = currentNumber;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 15
```java
            } else {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 16
```java
                currentSum = newSum;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 17
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 19
```java
            if (currentSum > maximumSum) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 20
```java
                maximumSum = currentSum;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 21
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 22
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 24
```java
        System.out.println("Maximum Sum = " + maximumSum);
```

This displays the result on the console. We use it when we want the output to appear and then move to a new line.

### Line 25
```java
    }
```

This line performs one small part of the overall algorithm.

### Line 26
```java
}
```

This line performs one small part of the overall algorithm.
