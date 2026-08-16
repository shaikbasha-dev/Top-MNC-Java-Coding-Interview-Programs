# 09 — Step-by-Step Explanation

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

## Explanation of the Program

### Step 1
```java
public class FindFirstAndLastOccurrence {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[] numbers = {2, 4, 4, 4, 7, 9};
```

This initializes or updates an important variable used by the algorithm.

### Step 4
```java
int target = 4;
```

This initializes or updates an important variable used by the algorithm.

### Step 6
```java
int first = findFirst(numbers, target);
```

This initializes or updates an important variable used by the algorithm.

### Step 7
```java
int last = findLast(numbers, target);
```

This initializes or updates an important variable used by the algorithm.

### Step 9
```java
System.out.println("First Occurrence = " + first);
```

This displays the result on the console.

### Step 10
```java
System.out.println("Last Occurrence = " + last);
```

This displays the result on the console.

### Step 11
```java
}
```

This marks the beginning or end of a Java block.

### Step 13
```java
static int findFirst(int[] numbers, int target) {
```

This statement performs a supporting operation required by the algorithm.

### Step 14
```java
int low = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 15
```java
int high = numbers.length - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 16
```java
int answer = -1;
```

This initializes or updates an important variable used by the algorithm.

### Step 18
```java
while (low <= high) {
```

This loop repeats the operation over the required range of values.

### Step 19
```java
int middle = low + (high - low) / 2;
```

This initializes or updates an important variable used by the algorithm.

### Step 21
```java
if (numbers[middle] == target) {
```

This condition decides which branch of the algorithm should execute.

### Step 22
```java
answer = middle;
```

This initializes or updates an important variable used by the algorithm.

### Step 23
```java
high = middle - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 24
```java
} else if (numbers[middle] < target) {
```

This condition decides which branch of the algorithm should execute.

### Step 25
```java
low = middle + 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 26
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 27
```java
high = middle - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 28
```java
}
```

This marks the beginning or end of a Java block.

### Step 29
```java
}
```

This marks the beginning or end of a Java block.

### Step 31
```java
return answer;
```

This returns the required result or stops the current method.

### Step 32
```java
}
```

This marks the beginning or end of a Java block.

### Step 34
```java
static int findLast(int[] numbers, int target) {
```

This statement performs a supporting operation required by the algorithm.

### Step 35
```java
int low = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 36
```java
int high = numbers.length - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 37
```java
int answer = -1;
```

This initializes or updates an important variable used by the algorithm.

### Step 39
```java
while (low <= high) {
```

This loop repeats the operation over the required range of values.

### Step 40
```java
int middle = low + (high - low) / 2;
```

This initializes or updates an important variable used by the algorithm.

### Step 42
```java
if (numbers[middle] == target) {
```

This condition decides which branch of the algorithm should execute.

### Step 43
```java
answer = middle;
```

This initializes or updates an important variable used by the algorithm.

### Step 44
```java
low = middle + 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 45
```java
} else if (numbers[middle] < target) {
```

This condition decides which branch of the algorithm should execute.

### Step 46
```java
low = middle + 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 47
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 48
```java
high = middle - 1;
```

This initializes or updates an important variable used by the algorithm.

### Step 49
```java
}
```

This marks the beginning or end of a Java block.

### Step 50
```java
}
```

This marks the beginning or end of a Java block.

### Step 52
```java
return answer;
```

This returns the required result or stops the current method.

### Step 53
```java
}
```

This marks the beginning or end of a Java block.

### Step 54
```java
}
```

This marks the beginning or end of a Java block.
