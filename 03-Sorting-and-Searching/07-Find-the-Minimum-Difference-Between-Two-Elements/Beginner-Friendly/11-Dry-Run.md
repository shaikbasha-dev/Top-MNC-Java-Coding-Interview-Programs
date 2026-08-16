# 11 — Dry Run

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

## Dry Run — Every Important Step

### Step 1
The array is sorted as [1,3,5,18,19,25].

### Step 2
Adjacent differences are 2, 2, 13, 1 and 6.

### Step 3
The smallest difference is 1.

### Step 4
Therefore the result is 1.

### Final Result
```text
Minimum Difference = 1
```
