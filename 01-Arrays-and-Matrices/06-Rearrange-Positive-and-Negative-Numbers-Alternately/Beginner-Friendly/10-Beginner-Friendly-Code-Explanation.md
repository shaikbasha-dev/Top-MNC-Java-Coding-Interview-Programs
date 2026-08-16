# Beginner-Friendly Code Explanation — Rearrange Positive and Negative Numbers Alternately

The complete program is shown first. The explanation then discusses the code line by line in simple conversational language.

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

## Line-by-Line Explanation

### Line 1
```java
public class RearrangePositiveandNegativeNumbersAlternately {
```

This creates the class. Think of the class as the container in which our Java program lives.

### Line 2
```java
    public static void main(String[] args) {
```

This is the main method. When we run the program, Java starts executing from here.

### Line 3
```java
        int[] numbers = {1, 2, 3, -4, -1, 4};
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 4
```java
        int arraySize = numbers.length;
```

Here we obtain the number of elements in the array and store it in a variable. Keeping this value in a variable makes the later loop easier for a beginner to follow.

### Line 6
```java
        int positiveCount = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 7
```java
        int negativeCount = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 9
```java
        for (int i = 0; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 10
```java
            if (numbers[i] >= 0) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 11
```java
                positiveCount++;
```

This changes the index or counter so the program can move to another position.

### Line 12
```java
            } else {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 13
```java
                negativeCount++;
```

This changes the index or counter so the program can move to another position.

### Line 14
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 15
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 17
```java
        int[] positives = new int[positiveCount];
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 18
```java
        int[] negatives = new int[negativeCount];
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 20
```java
        int positiveIndex = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 21
```java
        int negativeIndex = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 23
```java
        for (int i = 0; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 24
```java
            if (numbers[i] >= 0) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 25
```java
                positives[positiveIndex] = numbers[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 26
```java
                positiveIndex++;
```

This changes the index or counter so the program can move to another position.

### Line 27
```java
            } else {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 28
```java
                negatives[negativeIndex] = numbers[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 29
```java
                negativeIndex++;
```

This changes the index or counter so the program can move to another position.

### Line 30
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 31
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 33
```java
        int positivePosition = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 34
```java
        int negativePosition = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 36
```java
        for (int i = 0; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 37
```java
            if (positivePosition < positiveCount && negativePosition < negativeCount) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 38
```java
                if (i % 2 == 0) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 39
```java
                    numbers[i] = positives[positivePosition];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 40
```java
                    positivePosition++;
```

This changes the index or counter so the program can move to another position.

### Line 41
```java
                } else {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 42
```java
                    numbers[i] = negatives[negativePosition];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 43
```java
                    negativePosition++;
```

This changes the index or counter so the program can move to another position.

### Line 44
```java
                }
```

This line performs one small part of the overall algorithm.

### Line 45
```java
            } else if (positivePosition < positiveCount) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 46
```java
                numbers[i] = positives[positivePosition];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 47
```java
                positivePosition++;
```

This changes the index or counter so the program can move to another position.

### Line 48
```java
            } else {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 49
```java
                numbers[i] = negatives[negativePosition];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 50
```java
                negativePosition++;
```

This changes the index or counter so the program can move to another position.

### Line 51
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 52
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 54
```java
        System.out.print("Result = [");
```

This displays output without moving to a new line, which is useful when printing an array or sequence on one line.

### Line 55
```java
        for (int i = 0; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 56
```java
            System.out.print(numbers[i]);
```

This displays output without moving to a new line, which is useful when printing an array or sequence on one line.

### Line 57
```java
            if (i < arraySize - 1) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 58
```java
                System.out.print(", ");
```

This displays output without moving to a new line, which is useful when printing an array or sequence on one line.

### Line 59
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 60
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 61
```java
        System.out.println("]");
```

This displays the result on the console. We use it when we want the output to appear and then move to a new line.

### Line 62
```java
    }
```

This line performs one small part of the overall algorithm.

### Line 63
```java
}
```

This line performs one small part of the overall algorithm.
