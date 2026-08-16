# 09 — Step-by-Step Explanation

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

## Explanation of the Program

### Step 1
```java
public class MergeSort {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[] numbers = {38, 27, 43, 3, 9, 82, 10};
```

This initializes or updates an important variable used by the algorithm.

### Step 5
```java
mergeSort(numbers, 0, numbers.length - 1);
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
static void mergeSort(int[] numbers, int left, int right) {
```

This statement performs a supporting operation required by the algorithm.

### Step 14
```java
if (left >= right) {
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
int middle = (left + right) / 2;
```

This initializes or updates an important variable used by the algorithm.

### Step 20
```java
mergeSort(numbers, left, middle);
```

This statement performs a supporting operation required by the algorithm.

### Step 21
```java
mergeSort(numbers, middle + 1, right);
```

This statement performs a supporting operation required by the algorithm.

### Step 23
```java
merge(numbers, left, middle, right);
```

This statement performs a supporting operation required by the algorithm.

### Step 24
```java
}
```

This marks the beginning or end of a Java block.

### Step 26
```java
static void merge(int[] numbers, int left, int middle, int right) {
```

This statement performs a supporting operation required by the algorithm.

### Step 27
```java
int[] temporary = new int[right - left + 1];
```

This initializes or updates an important variable used by the algorithm.

### Step 29
```java
int i = left;
```

This initializes or updates an important variable used by the algorithm.

### Step 30
```java
int j = middle + 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 31
```java
int k = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 33
```java
while (i <= middle && j <= right) {
```

This loop repeats the operation over the required range of values.

### Step 34
```java
if (numbers[i] <= numbers[j]) {
```

This condition decides which branch of the algorithm should execute.

### Step 35
```java
temporary[k] = numbers[i];
```

This initializes or updates an important variable used by the algorithm.

### Step 36
```java
i++;
```

This statement performs a supporting operation required by the algorithm.

### Step 37
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 38
```java
temporary[k] = numbers[j];
```

This initializes or updates an important variable used by the algorithm.

### Step 39
```java
j++;
```

This statement performs a supporting operation required by the algorithm.

### Step 40
```java
}
```

This marks the beginning or end of a Java block.

### Step 41
```java
k++;
```

This statement performs a supporting operation required by the algorithm.

### Step 42
```java
}
```

This marks the beginning or end of a Java block.

### Step 44
```java
while (i <= middle) {
```

This loop repeats the operation over the required range of values.

### Step 45
```java
temporary[k] = numbers[i];
```

This initializes or updates an important variable used by the algorithm.

### Step 46
```java
i++;
```

This statement performs a supporting operation required by the algorithm.

### Step 47
```java
k++;
```

This statement performs a supporting operation required by the algorithm.

### Step 48
```java
}
```

This marks the beginning or end of a Java block.

### Step 50
```java
while (j <= right) {
```

This loop repeats the operation over the required range of values.

### Step 51
```java
temporary[k] = numbers[j];
```

This initializes or updates an important variable used by the algorithm.

### Step 52
```java
j++;
```

This statement performs a supporting operation required by the algorithm.

### Step 53
```java
k++;
```

This statement performs a supporting operation required by the algorithm.

### Step 54
```java
}
```

This marks the beginning or end of a Java block.

### Step 56
```java
for (int index = 0; index < temporary.length; index++) {
```

This loop repeats the operation over the required range of values.

### Step 57
```java
numbers[left + index] = temporary[index];
```

This initializes or updates an important variable used by the algorithm.

### Step 58
```java
}
```

This marks the beginning or end of a Java block.

### Step 59
```java
}
```

This marks the beginning or end of a Java block.

### Step 60
```java
}
```

This marks the beginning or end of a Java block.
