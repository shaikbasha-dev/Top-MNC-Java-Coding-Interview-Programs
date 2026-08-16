# 09 — Step-by-Step Explanation

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

## Explanation of the Program

### Step 1
```java
public class QuickSort {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[] numbers = {10, 7, 8, 9, 1, 5};
```

This initializes or updates an important variable used by the algorithm.

### Step 5
```java
quickSort(numbers, 0, numbers.length - 1);
```

This statement performs a supporting operation required by the algorithm.

### Step 7
```java
System.out.print("Sorted Array = ");
```

This displays the result on the console.

### Step 8
```java
for (int number : numbers) {
```

This loop repeats the operation over the required range of values.

### Step 9
```java
System.out.print(number + " ");
```

This displays the result on the console.

### Step 10
```java
}
```

This marks the beginning or end of a Java block.

### Step 11
```java
}
```

This marks the beginning or end of a Java block.

### Step 13
```java
static void quickSort(int[] numbers, int low, int high) {
```

This statement performs a supporting operation required by the algorithm.

### Step 14
```java
if (low >= high) {
```

This condition decides which branch of the algorithm should execute.

### Step 15
```java
return;
```

This returns the required result or stops the current method.

### Step 16
```java
}
```

This marks the beginning or end of a Java block.

### Step 18
```java
int pivotIndex = partition(numbers, low, high);
```

This initializes or updates an important variable used by the algorithm.

### Step 20
```java
quickSort(numbers, low, pivotIndex - 1);
```

This statement performs a supporting operation required by the algorithm.

### Step 21
```java
quickSort(numbers, pivotIndex + 1, high);
```

This statement performs a supporting operation required by the algorithm.

### Step 22
```java
}
```

This marks the beginning or end of a Java block.

### Step 24
```java
static int partition(int[] numbers, int low, int high) {
```

This statement performs a supporting operation required by the algorithm.

### Step 25
```java
int pivot = numbers[high];
```

This initializes or updates an important variable used by the algorithm.

### Step 26
```java
int smallerIndex = low - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 28
```java
for (int current = low; current < high; current++) {
```

This loop repeats the operation over the required range of values.

### Step 29
```java
if (numbers[current] <= pivot) {
```

This condition decides which branch of the algorithm should execute.

### Step 30
```java
smallerIndex++;
```

This statement performs a supporting operation required by the algorithm.

### Step 32
```java
int temporary = numbers[smallerIndex];
```

This initializes or updates an important variable used by the algorithm.

### Step 33
```java
numbers[smallerIndex] = numbers[current];
```

This initializes or updates an important variable used by the algorithm.

### Step 34
```java
numbers[current] = temporary;
```

This initializes or updates an important variable used by the algorithm.

### Step 35
```java
}
```

This marks the beginning or end of a Java block.

### Step 36
```java
}
```

This marks the beginning or end of a Java block.

### Step 38
```java
int temporary = numbers[smallerIndex + 1];
```

This initializes or updates an important variable used by the algorithm.

### Step 39
```java
numbers[smallerIndex + 1] = numbers[high];
```

This initializes or updates an important variable used by the algorithm.

### Step 40
```java
numbers[high] = temporary;
```

This initializes or updates an important variable used by the algorithm.

### Step 42
```java
return smallerIndex + 1;
```

This returns the required result or stops the current method.

### Step 43
```java
}
```

This marks the beginning or end of a Java block.

### Step 44
```java
}
```

This marks the beginning or end of a Java block.
