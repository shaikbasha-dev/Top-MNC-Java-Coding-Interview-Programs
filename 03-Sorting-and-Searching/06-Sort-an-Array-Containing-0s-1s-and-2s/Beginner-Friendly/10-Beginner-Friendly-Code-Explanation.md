# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
public class SortAnArrayContaining0s1sAnd2s {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 2, 1, 1, 0};

        int low = 0;
        int middle = 0;
        int high = numbers.length - 1;

        while (middle <= high) {
            if (numbers[middle] == 0) {
                int temporary = numbers[low];
                numbers[low] = numbers[middle];
                numbers[middle] = temporary;

                low++;
                middle++;
            } else if (numbers[middle] == 1) {
                middle++;
            } else {
                int temporary = numbers[middle];
                numbers[middle] = numbers[high];
                numbers[high] = temporary;

                high--;
            }
        }

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

## Line-by-Line Beginner Explanation

### Line 1
```java
public class SortAnArrayContaining0s1sAnd2s {
```

This creates the class that contains the program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 3
```java
        int[] numbers = {2, 0, 2, 1, 1, 0};
```

This declares an array and stores the input data.

### Line 5
```java
        int low = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 6
```java
        int middle = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 7
```java
        int high = numbers.length - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 9
```java
        while (middle <= high) {
```

This repeats the logic for the required elements.

### Line 10
```java
            if (numbers[middle] == 0) {
```

This checks a condition and selects the correct action.

### Line 11
```java
                int temporary = numbers[low];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 12
```java
                numbers[low] = numbers[middle];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 13
```java
                numbers[middle] = temporary;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 15
```java
                low++;
```

This line supports the current algorithmic step.

### Line 16
```java
                middle++;
```

This line supports the current algorithmic step.

### Line 17
```java
            } else if (numbers[middle] == 1) {
```

This checks a condition and selects the correct action.

### Line 18
```java
                middle++;
```

This line supports the current algorithmic step.

### Line 19
```java
            } else {
```

This handles the alternative condition.

### Line 20
```java
                int temporary = numbers[middle];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 21
```java
                numbers[middle] = numbers[high];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 22
```java
                numbers[high] = temporary;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 24
```java
                high--;
```

This line supports the current algorithmic step.

### Line 25
```java
            }
```

This line supports the current algorithmic step.

### Line 26
```java
        }
```

This line supports the current algorithmic step.

### Line 28
```java
        System.out.print("Sorted Array = ");
```

This prints the final result so we can verify the program.

### Line 29
```java
        for (int number : numbers) {
```

This repeats the logic for the required elements.

### Line 30
```java
            System.out.print(number + " ");
```

This prints the final result so we can verify the program.

### Line 31
```java
        }
```

This line supports the current algorithmic step.

### Line 32
```java
    }
```

This line supports the current algorithmic step.

### Line 33
```java
}
```

This line supports the current algorithmic step.
