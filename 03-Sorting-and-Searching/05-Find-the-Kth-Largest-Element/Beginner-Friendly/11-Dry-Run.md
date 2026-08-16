# 11 — Dry Run

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

## Dry Run — Every Important Step

### Step 1
The values are processed while keeping only the two largest candidates in the min-heap.

### Step 2
When a third candidate arrives, the smallest heap value is removed.

### Step 3
The heap finally contains the two largest values.

### Step 4
The root is 5, the second largest value.

### Final Result
```text
Kth Largest Element = 5
```
