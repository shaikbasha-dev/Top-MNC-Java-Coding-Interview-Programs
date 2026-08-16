# Optimized Dry Run — Maximum Sum Contiguous Subarray

## Complete Expert Program

```java
public class MaximumSumContiguousSubarray {
    public static void main(String[] args) {
        int[] numbers = {-2,1,-3,4,-1,2,1,-5,4};
        int currentSum = numbers[0];
        int maximumSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("Maximum Sum = " + maximumSum);
    }
}
```

## Execution Walkthrough

### Step 1

The program enters `main()` and creates the input.

### Step 2

The optimized variables are initialized.

### Step 3

The first iteration processes the first relevant value.

### Step 4

Each subsequent iteration updates the maintained state rather than recomputing the whole answer.

### Step 5

The final iteration completes the required traversal.

### Step 6

The result is displayed.

## Final Output

```text
Maximum Sum = 6
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
