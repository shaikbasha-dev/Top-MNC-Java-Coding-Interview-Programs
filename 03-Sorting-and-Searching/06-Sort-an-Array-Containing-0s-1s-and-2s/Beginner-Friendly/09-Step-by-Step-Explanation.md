# 09 — Step-by-Step Explanation

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

## Explanation of the Program

### Step 1
```java
public class SortAnArrayContaining0s1sAnd2s {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[] numbers = {2, 0, 2, 1, 1, 0};
```

This initializes or updates an important variable used by the algorithm.

### Step 5
```java
int low = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 6
```java
int middle = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 7
```java
int high = numbers.length - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 9
```java
while (middle <= high) {
```

This loop repeats the operation over the required range of values.

### Step 10
```java
if (numbers[middle] == 0) {
```

This condition decides which branch of the algorithm should execute.

### Step 11
```java
int temporary = numbers[low];
```

This initializes or updates an important variable used by the algorithm.

### Step 12
```java
numbers[low] = numbers[middle];
```

This initializes or updates an important variable used by the algorithm.

### Step 13
```java
numbers[middle] = temporary;
```

This initializes or updates an important variable used by the algorithm.

### Step 15
```java
low++;
```

This statement performs a supporting operation required by the algorithm.

### Step 16
```java
middle++;
```

This statement performs a supporting operation required by the algorithm.

### Step 17
```java
} else if (numbers[middle] == 1) {
```

This condition decides which branch of the algorithm should execute.

### Step 18
```java
middle++;
```

This statement performs a supporting operation required by the algorithm.

### Step 19
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 20
```java
int temporary = numbers[middle];
```

This initializes or updates an important variable used by the algorithm.

### Step 21
```java
numbers[middle] = numbers[high];
```

This initializes or updates an important variable used by the algorithm.

### Step 22
```java
numbers[high] = temporary;
```

This initializes or updates an important variable used by the algorithm.

### Step 24
```java
high--;
```

This statement performs a supporting operation required by the algorithm.

### Step 25
```java
}
```

This marks the beginning or end of a Java block.

### Step 26
```java
}
```

This marks the beginning or end of a Java block.

### Step 28
```java
System.out.print("Sorted Array = ");
```

This displays the result on the console.

### Step 29
```java
for (int number : numbers) {
```

This loop repeats the operation over the required range of values.

### Step 30
```java
System.out.print(number + " ");
```

This displays the result on the console.

### Step 31
```java
}
```

This marks the beginning or end of a Java block.

### Step 32
```java
}
```

This marks the beginning or end of a Java block.

### Step 33
```java
}
```

This marks the beginning or end of a Java block.
