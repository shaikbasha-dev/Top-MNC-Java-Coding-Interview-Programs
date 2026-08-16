# Optimized Dry Run — Left Rotate an Array by K Positions

## Complete Expert Program

```java
public class LeftRotateanArraybyKPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int arraySize = numbers.length;
        k = k % arraySize;

        reverse(numbers, 0, k - 1);
        reverse(numbers, k, arraySize - 1);
        reverse(numbers, 0, arraySize - 1);

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i]);
            if (i < arraySize - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temporary = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temporary;
            start++;
            end--;
        }
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
Result = [4, 5, 6, 7, 1, 2, 3]
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
