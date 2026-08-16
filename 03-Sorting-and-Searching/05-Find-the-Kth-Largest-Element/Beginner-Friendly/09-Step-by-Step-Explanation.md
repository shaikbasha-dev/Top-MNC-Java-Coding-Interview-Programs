# 09 — Step-by-Step Explanation

## Complete Program

```java
import java.util.Arrays;

public class FindTheKthLargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(numbers);

        int answer = numbers[numbers.length - k];

        System.out.println("Kth Largest Element = " + answer);
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
public class FindTheKthLargestElement {
```

This declares the class containing the program.

### Step 4
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 5
```java
int[] numbers = {3, 2, 1, 5, 6, 4};
```

This initializes or updates an important variable used by the algorithm.

### Step 6
```java
int k = 2;
```

This initializes or updates an important variable used by the algorithm.

### Step 8
```java
Arrays.sort(numbers);
```

This statement performs a supporting operation required by the algorithm.

### Step 10
```java
int answer = numbers[numbers.length - k];
```

This initializes or updates an important variable used by the algorithm.

### Step 12
```java
System.out.println("Kth Largest Element = " + answer);
```

This displays the result on the console.

### Step 13
```java
}
```

This marks the beginning or end of a Java block.

### Step 14
```java
}
```

This marks the beginning or end of a Java block.
