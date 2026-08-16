# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
public class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 4, 4, 7, 9};
        int target = 4;

        int first = findFirst(numbers, target);
        int last = findLast(numbers, target);

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
    }

    static int findFirst(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int answer = -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (numbers[middle] == target) {
                answer = middle;
                high = middle - 1;
            } else if (numbers[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return answer;
    }

    static int findLast(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int answer = -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (numbers[middle] == target) {
                answer = middle;
                low = middle + 1;
            } else if (numbers[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return answer;
    }
}
```

## Line-by-Line Beginner Explanation

### Line 1
```java
public class FindFirstAndLastOccurrence {
```

This creates the class that contains the program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 3
```java
        int[] numbers = {2, 4, 4, 4, 7, 9};
```

This declares an array and stores the input data.

### Line 4
```java
        int target = 4;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 6
```java
        int first = findFirst(numbers, target);
```

This assigns or updates a variable that represents part of the algorithm.

### Line 7
```java
        int last = findLast(numbers, target);
```

This assigns or updates a variable that represents part of the algorithm.

### Line 9
```java
        System.out.println("First Occurrence = " + first);
```

This prints the final result so we can verify the program.

### Line 10
```java
        System.out.println("Last Occurrence = " + last);
```

This prints the final result so we can verify the program.

### Line 11
```java
    }
```

This line supports the current algorithmic step.

### Line 13
```java
    static int findFirst(int[] numbers, int target) {
```

This declares an array and stores the input data.

### Line 14
```java
        int low = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 15
```java
        int high = numbers.length - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 16
```java
        int answer = -1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 18
```java
        while (low <= high) {
```

This repeats the logic for the required elements.

### Line 19
```java
            int middle = low + (high - low) / 2;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 21
```java
            if (numbers[middle] == target) {
```

This checks a condition and selects the correct action.

### Line 22
```java
                answer = middle;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 23
```java
                high = middle - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 24
```java
            } else if (numbers[middle] < target) {
```

This checks a condition and selects the correct action.

### Line 25
```java
                low = middle + 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 26
```java
            } else {
```

This handles the alternative condition.

### Line 27
```java
                high = middle - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 28
```java
            }
```

This line supports the current algorithmic step.

### Line 29
```java
        }
```

This line supports the current algorithmic step.

### Line 31
```java
        return answer;
```

This sends control or a value back to the calling method.

### Line 32
```java
    }
```

This line supports the current algorithmic step.

### Line 34
```java
    static int findLast(int[] numbers, int target) {
```

This declares an array and stores the input data.

### Line 35
```java
        int low = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 36
```java
        int high = numbers.length - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 37
```java
        int answer = -1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 39
```java
        while (low <= high) {
```

This repeats the logic for the required elements.

### Line 40
```java
            int middle = low + (high - low) / 2;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 42
```java
            if (numbers[middle] == target) {
```

This checks a condition and selects the correct action.

### Line 43
```java
                answer = middle;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 44
```java
                low = middle + 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 45
```java
            } else if (numbers[middle] < target) {
```

This checks a condition and selects the correct action.

### Line 46
```java
                low = middle + 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 47
```java
            } else {
```

This handles the alternative condition.

### Line 48
```java
                high = middle - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 49
```java
            }
```

This line supports the current algorithmic step.

### Line 50
```java
        }
```

This line supports the current algorithmic step.

### Line 52
```java
        return answer;
```

This sends control or a value back to the calling method.

### Line 53
```java
    }
```

This line supports the current algorithmic step.

### Line 54
```java
}
```

This line supports the current algorithmic step.
