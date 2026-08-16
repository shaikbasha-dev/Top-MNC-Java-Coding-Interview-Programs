# 10 — Beginner-Friendly Code Explanation

## Complete Program

```java
public class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] first = {1, 3};
        int[] second = {2};

        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }

        double median;

        if (merged.length % 2 == 1) {
            median = merged[merged.length / 2];
        } else {
            int middle = merged.length / 2;
            median = (merged[middle - 1] + merged[middle]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}
```

## Line-by-Line Beginner Explanation

### Line 1
```java
public class FindMedianOfTwoSortedArrays {
```

This creates the class that contains the program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 3
```java
        int[] first = {1, 3};
```

This declares an array and stores the input data.

### Line 4
```java
        int[] second = {2};
```

This declares an array and stores the input data.

### Line 6
```java
        int[] merged = new int[first.length + second.length];
```

This declares an array and stores the input data.

### Line 8
```java
        int i = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 9
```java
        int j = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 10
```java
        int k = 0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 12
```java
        while (i < first.length && j < second.length) {
```

This repeats the logic for the required elements.

### Line 13
```java
            if (first[i] <= second[j]) {
```

This checks a condition and selects the correct action.

### Line 14
```java
                merged[k] = first[i];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 15
```java
                i++;
```

This line supports the current algorithmic step.

### Line 16
```java
            } else {
```

This handles the alternative condition.

### Line 17
```java
                merged[k] = second[j];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 18
```java
                j++;
```

This line supports the current algorithmic step.

### Line 19
```java
            }
```

This line supports the current algorithmic step.

### Line 20
```java
            k++;
```

This line supports the current algorithmic step.

### Line 21
```java
        }
```

This line supports the current algorithmic step.

### Line 23
```java
        while (i < first.length) {
```

This repeats the logic for the required elements.

### Line 24
```java
            merged[k] = first[i];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 25
```java
            i++;
```

This line supports the current algorithmic step.

### Line 26
```java
            k++;
```

This line supports the current algorithmic step.

### Line 27
```java
        }
```

This line supports the current algorithmic step.

### Line 29
```java
        while (j < second.length) {
```

This repeats the logic for the required elements.

### Line 30
```java
            merged[k] = second[j];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 31
```java
            j++;
```

This line supports the current algorithmic step.

### Line 32
```java
            k++;
```

This line supports the current algorithmic step.

### Line 33
```java
        }
```

This line supports the current algorithmic step.

### Line 35
```java
        double median;
```

This line supports the current algorithmic step.

### Line 37
```java
        if (merged.length % 2 == 1) {
```

This checks a condition and selects the correct action.

### Line 38
```java
            median = merged[merged.length / 2];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 39
```java
        } else {
```

This handles the alternative condition.

### Line 40
```java
            int middle = merged.length / 2;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 41
```java
            median = (merged[middle - 1] + merged[middle]) / 2.0;
```

This assigns or updates a variable that represents part of the algorithm.

### Line 42
```java
        }
```

This line supports the current algorithmic step.

### Line 44
```java
        System.out.println("Median = " + median);
```

This prints the final result so we can verify the program.

### Line 45
```java
    }
```

This line supports the current algorithmic step.

### Line 46
```java
}
```

This line supports the current algorithmic step.
