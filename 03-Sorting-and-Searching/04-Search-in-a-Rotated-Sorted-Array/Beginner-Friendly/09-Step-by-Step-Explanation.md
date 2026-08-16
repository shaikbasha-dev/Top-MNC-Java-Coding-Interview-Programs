# 09 — Step-by-Step Explanation

## Complete Program

```java
public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(numbers, target);

        System.out.println("Target Index = " + index);
    }

    static int search(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[low] <= numbers[middle]) {
                if (target >= numbers[low] && target < numbers[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            } else {
                if (target > numbers[middle] && target <= numbers[high]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }

        return -1;
    }
}
```

## Explanation of the Program

### Step 1
```java
public class SearchInARotatedSortedArray {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[] numbers = {4, 5, 6, 7, 0, 1, 2};
```

This initializes or updates an important variable used by the algorithm.

### Step 4
```java
int target = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 6
```java
int index = search(numbers, target);
```

This initializes or updates an important variable used by the algorithm.

### Step 8
```java
System.out.println("Target Index = " + index);
```

This displays the result on the console.

### Step 9
```java
}
```

This marks the beginning or end of a Java block.

### Step 11
```java
static int search(int[] numbers, int target) {
```

This statement performs a supporting operation required by the algorithm.

### Step 12
```java
int low = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 13
```java
int high = numbers.length - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 15
```java
while (low <= high) {
```

This loop repeats the operation over the required range of values.

### Step 16
```java
int middle = low + (high - low) / 2;
```

This initializes or updates an important variable used by the algorithm.

### Step 18
```java
if (numbers[middle] == target) {
```

This condition decides which branch of the algorithm should execute.

### Step 19
```java
return middle;
```

This returns the required result or stops the current method.

### Step 20
```java
}
```

This marks the beginning or end of a Java block.

### Step 22
```java
if (numbers[low] <= numbers[middle]) {
```

This condition decides which branch of the algorithm should execute.

### Step 23
```java
if (target >= numbers[low] && target < numbers[middle]) {
```

This condition decides which branch of the algorithm should execute.

### Step 24
```java
high = middle - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 25
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 26
```java
low = middle + 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 27
```java
}
```

This marks the beginning or end of a Java block.

### Step 28
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 29
```java
if (target > numbers[middle] && target <= numbers[high]) {
```

This condition decides which branch of the algorithm should execute.

### Step 30
```java
low = middle + 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 31
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 32
```java
high = middle - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 33
```java
}
```

This marks the beginning or end of a Java block.

### Step 34
```java
}
```

This marks the beginning or end of a Java block.

### Step 35
```java
}
```

This marks the beginning or end of a Java block.

### Step 37
```java
return -1;
```

This returns the required result or stops the current method.

### Step 38
```java
}
```

This marks the beginning or end of a Java block.

### Step 39
```java
}
```

This marks the beginning or end of a Java block.
