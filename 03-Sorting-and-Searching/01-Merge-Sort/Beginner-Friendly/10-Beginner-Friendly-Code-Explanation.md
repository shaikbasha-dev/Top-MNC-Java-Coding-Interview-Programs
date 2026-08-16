# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    static void mergeSort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;

        mergeSort(numbers, left, middle);
        mergeSort(numbers, middle + 1, right);

        merge(numbers, left, middle, right);
    }

    static void merge(int[] numbers, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temporary[k] = numbers[i];
                i++;
            } else {
                temporary[k] = numbers[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            temporary[k] = numbers[i];
            i++;
            k++;
        }

        while (j <= right) {
            temporary[k] = numbers[j];
            j++;
            k++;
        }

        for (int index = 0; index < temporary.length; index++) {
            numbers[left + index] = temporary[index];
        }
    }
}
```

## Line-by-Line Beginner Explanation

### Line 1
```java
public class MergeSort {
```

This creates the class that contains the program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 3
```java
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
```

This declares an array and stores the input data.

### Line 5
```java
        mergeSort(numbers, 0, numbers.length - 1);
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
    static void mergeSort(int[] numbers, int left, int right) {
```

This declares an array and stores the input data.

### Line 14
```java
        if (left >= right) {
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
        int middle = (left + right) / 2;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 20
```java
        mergeSort(numbers, left, middle);
```

This line supports the current algorithmic step.

### Line 21
```java
        mergeSort(numbers, middle + 1, right);
```

This line supports the current algorithmic step.

### Line 23
```java
        merge(numbers, left, middle, right);
```

This line supports the current algorithmic step.

### Line 24
```java
    }
```

This line supports the current algorithmic step.

### Line 26
```java
    static void merge(int[] numbers, int left, int middle, int right) {
```

This declares an array and stores the input data.

### Line 27
```java
        int[] temporary = new int[right - left + 1];
```

This declares an array and stores the input data.

### Line 29
```java
        int i = left;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 30
```java
        int j = middle + 1;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 31
```java
        int k = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 33
```java
        while (i <= middle && j <= right) {
```

This repeats the logic for the required elements.

### Line 34
```java
            if (numbers[i] <= numbers[j]) {
```

This checks a condition and selects the correct action.

### Line 35
```java
                temporary[k] = numbers[i];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 36
```java
                i++;
```

This line supports the current algorithmic step.

### Line 37
```java
            } else {
```

This handles the alternative condition.

### Line 38
```java
                temporary[k] = numbers[j];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 39
```java
                j++;
```

This line supports the current algorithmic step.

### Line 40
```java
            }
```

This line supports the current algorithmic step.

### Line 41
```java
            k++;
```

This line supports the current algorithmic step.

### Line 42
```java
        }
```

This line supports the current algorithmic step.

### Line 44
```java
        while (i <= middle) {
```

This repeats the logic for the required elements.

### Line 45
```java
            temporary[k] = numbers[i];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 46
```java
            i++;
```

This line supports the current algorithmic step.

### Line 47
```java
            k++;
```

This line supports the current algorithmic step.

### Line 48
```java
        }
```

This line supports the current algorithmic step.

### Line 50
```java
        while (j <= right) {
```

This repeats the logic for the required elements.

### Line 51
```java
            temporary[k] = numbers[j];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 52
```java
            j++;
```

This line supports the current algorithmic step.

### Line 53
```java
            k++;
```

This line supports the current algorithmic step.

### Line 54
```java
        }
```

This line supports the current algorithmic step.

### Line 56
```java
        for (int index = 0; index < temporary.length; index++) {
```

This repeats the logic for the required elements.

### Line 57
```java
            numbers[left + index] = temporary[index];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 58
```java
        }
```

This line supports the current algorithmic step.

### Line 59
```java
    }
```

This line supports the current algorithmic step.

### Line 60
```java
}
```

This line supports the current algorithmic step.
