# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
import java.util.Arrays;

public class FindMinimumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 19, 18, 25};

        Arrays.sort(numbers);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            int difference = numbers[i] - numbers[i - 1];

            if (difference < minimumDifference) {
                minimumDifference = difference;
            }
        }

        System.out.println("Minimum Difference = " + minimumDifference);
    }
}
```

## Line-by-Line Beginner Explanation

### Line 1
```java
import java.util.Arrays;
```

This brings a Java library class into the program so we can use its functionality.

### Line 3
```java
public class FindMinimumDifferenceBetweenTwoElements {
```

This creates the class that contains the program.

### Line 4
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 5
```java
        int[] numbers = {1, 5, 3, 19, 18, 25};
```

This declares an array and stores the input data.

### Line 7
```java
        Arrays.sort(numbers);
```

This line supports the current algorithmic step.

### Line 9
```java
        int minimumDifference = Integer.MAX_VALUE;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 11
```java
        for (int i = 1; i < numbers.length; i++) {
```

This repeats the logic for the required elements.

### Line 12
```java
            int difference = numbers[i] - numbers[i - 1];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 14
```java
            if (difference < minimumDifference) {
```

This checks a condition and selects the correct action.

### Line 15
```java
                minimumDifference = difference;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 16
```java
            }
```

This line supports the current algorithmic step.

### Line 17
```java
        }
```

This line supports the current algorithmic step.

### Line 19
```java
        System.out.println("Minimum Difference = " + minimumDifference);
```

This prints the final result so we can verify the program.

### Line 20
```java
    }
```

This line supports the current algorithmic step.

### Line 21
```java
}
```

This line supports the current algorithmic step.
