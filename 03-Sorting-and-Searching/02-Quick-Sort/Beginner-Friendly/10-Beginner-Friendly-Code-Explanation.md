# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};

        quickSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    static void quickSort(int[] numbers, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(numbers, low, high);

        quickSort(numbers, low, pivotIndex - 1);
        quickSort(numbers, pivotIndex + 1, high);
    }

    static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int smallerIndex = low - 1;

        for (int current = low; current < high; current++) {
            if (numbers[current] <= pivot) {
                smallerIndex++;

                int temporary = numbers[smallerIndex];
                numbers[smallerIndex] = numbers[current];
                numbers[current] = temporary;
            }
        }

        int temporary = numbers[smallerIndex + 1];
        numbers[smallerIndex + 1] = numbers[high];
        numbers[high] = temporary;

        return smallerIndex + 1;
    }
}
```

## Line-by-Line Beginner Explanation

### Line 1
```java
public class QuickSort {
```

This creates the class that contains the program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 3
```java
        int[] numbers = {10, 7, 8, 9, 1, 5};
```

This declares an array and stores the input data.

### Line 5
```java
        quickSort(numbers, 0, numbers.length - 1);
```

This line supports the current algorithmic step.

### Line 7
```java
        System.out.print("Sorted Array = ");
```

This prints the final result so we can verify the program.

### Line 8
```java
        for (int number : numbers) {
```

This repeats the logic for the required elements.

### Line 9
```java
            System.out.print(number + " ");
```

This prints the final result so we can verify the program.

### Line 10
```java
        }
```

This line supports the current algorithmic step.

### Line 11
```java
    }
```

This line supports the current algorithmic step.

### Line 13
```java
    static void quickSort(int[] numbers, int low, int high) {
```

This declares an array and stores the input data.

### Line 14
```java
        if (low >= high) {
```

This checks a condition and selects the correct action.

### Line 15
```java
            return;
```

This sends control or a value back to the calling method.

### Line 16
```java
        }
```

This line supports the current algorithmic step.

### Line 18
```java
        int pivotIndex = partition(numbers, low, high);
```

This assigns or updates a variable that represents part of the algorithm.

### Line 20
```java
        quickSort(numbers, low, pivotIndex - 1);
```

This line supports the current algorithmic step.

### Line 21
```java
        quickSort(numbers, pivotIndex + 1, high);
```

This line supports the current algorithmic step.

### Line 22
```java
    }
```

This line supports the current algorithmic step.

### Line 24
```java
    static int partition(int[] numbers, int low, int high) {
```

This declares an array and stores the input data.

### Line 25
```java
        int pivot = numbers[high];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 26
```java
        int smallerIndex = low - 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 28
```java
        for (int current = low; current < high; current++) {
```

This repeats the logic for the required elements.

### Line 29
```java
            if (numbers[current] <= pivot) {
```

This checks a condition and selects the correct action.

### Line 30
```java
                smallerIndex++;
```

This line supports the current algorithmic step.

### Line 32
```java
                int temporary = numbers[smallerIndex];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 33
```java
                numbers[smallerIndex] = numbers[current];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 34
```java
                numbers[current] = temporary;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 35
```java
            }
```

This line supports the current algorithmic step.

### Line 36
```java
        }
```

This line supports the current algorithmic step.

### Line 38
```java
        int temporary = numbers[smallerIndex + 1];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 39
```java
        numbers[smallerIndex + 1] = numbers[high];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 40
```java
        numbers[high] = temporary;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 42
```java
        return smallerIndex + 1;
```

This sends control or a value back to the calling method.

### Line 43
```java
    }
```

This line supports the current algorithmic step.

### Line 44
```java
}
```

This line supports the current algorithmic step.
