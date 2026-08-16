# 09 — Step-by-Step Explanation

## Complete Program

```java
import java.util.Arrays;

public class FindMinimumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 19, 18, 25};

        Arrays.sort(numbers);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            int difference = numbers[i] - numbers[i - 1];

            if (difference < minimumDifference) {
                minimumDifference = difference;
            }
        }

        System.out.println("Minimum Difference = " + minimumDifference);
    }
}
```

## Explanation of the Program

### Step 1
```java
import java.util.Arrays;
```

This imports a Java library needed by the implementation.

### Step 3
```java
public class FindMinimumDifferenceBetweenTwoElements {
```

This declares the class containing the program.

### Step 4
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 5
```java
int[] numbers = {1, 5, 3, 19, 18, 25};
```

This initializes or updates an important variable used by the algorithm.

### Step 7
```java
Arrays.sort(numbers);
```

This statement performs a supporting operation required by the algorithm.

### Step 9
```java
int minimumDifference = Integer.MAX_VALUE;
```

This initializes or updates an important variable used by the algorithm.

### Step 11
```java
for (int i = 1; i < numbers.length; i++) {
```

This loop repeats the operation over the required range of values.

### Step 12
```java
int difference = numbers[i] - numbers[i - 1];
```

This initializes or updates an important variable used by the algorithm.

### Step 14
```java
if (difference < minimumDifference) {
```

This condition decides which branch of the algorithm should execute.

### Step 15
```java
minimumDifference = difference;
```

This initializes or updates an important variable used by the algorithm.

### Step 16
```java
}
```

This marks the beginning or end of a Java block.

### Step 17
```java
}
```

This marks the beginning or end of a Java block.

### Step 19
```java
System.out.println("Minimum Difference = " + minimumDifference);
```

This displays the result on the console.

### Step 20
```java
}
```

This marks the beginning or end of a Java block.

### Step 21
```java
}
```

This marks the beginning or end of a Java block.
