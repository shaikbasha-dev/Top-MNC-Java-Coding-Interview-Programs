# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
import java.util.Arrays;

public class FindTheKthLargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(numbers);

        int answer = numbers[numbers.length - k];

        System.out.println("Kth Largest Element = " + answer);
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
public class FindTheKthLargestElement {
```

This creates the class that contains the program.

### Line 4
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 5
```java
        int[] numbers = {3, 2, 1, 5, 6, 4};
```

This declares an array and stores the input data.

### Line 6
```java
        int k = 2;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 8
```java
        Arrays.sort(numbers);
```

This line supports the current algorithmic step.

### Line 10
```java
        int answer = numbers[numbers.length - k];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 12
```java
        System.out.println("Kth Largest Element = " + answer);
```

This prints the final result so we can verify the program.

### Line 13
```java
    }
```

This line supports the current algorithmic step.

### Line 14
```java
}
```

This line supports the current algorithmic step.
