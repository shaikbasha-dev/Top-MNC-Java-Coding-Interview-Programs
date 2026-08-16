# Beginner-Friendly Code Explanation — Find Pairs with a Given Target Sum

The complete program is shown first. The explanation then discusses the code line by line in simple conversational language.

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

## Line-by-Line Explanation

### Line 1
```java
public class FindPairswithaGivenTargetSum {
```

This creates the class. Think of the class as the container in which our Java program lives.

### Line 2
```java
    public static void main(String[] args) {
```

This is the main method. When we run the program, Java starts executing from here.

### Line 3
```java
        int[] numbers = {2, 7, 11, 15, 3, 6};
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 4
```java
        int target = 9;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 5
```java
        int arraySize = numbers.length;
```

Here we obtain the number of elements in the array and store it in a variable. Keeping this value in a variable makes the later loop easier for a beginner to follow.

### Line 7
```java
        System.out.println("Pairs:");
```

This displays the result on the console. We use it when we want the output to appear and then move to a new line.

### Line 9
```java
        for (int i = 0; i < arraySize - 1; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 10
```java
            for (int j = i + 1; j < arraySize; j++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 11
```java
                int firstNumber = numbers[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 12
```java
                int secondNumber = numbers[j];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 13
```java
                int sum = firstNumber + secondNumber;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 15
```java
                if (sum == target) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 16
```java
                    System.out.println("(" + firstNumber + ", " + secondNumber + ")");
```

This displays the result on the console. We use it when we want the output to appear and then move to a new line.

### Line 17
```java
                }
```

This line performs one small part of the overall algorithm.

### Line 18
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 19
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 20
```java
    }
```

This line performs one small part of the overall algorithm.

### Line 21
```java
}
```

This line performs one small part of the overall algorithm.
