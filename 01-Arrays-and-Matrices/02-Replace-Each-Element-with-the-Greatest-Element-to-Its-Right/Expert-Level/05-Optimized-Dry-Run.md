# Optimized Dry Run — Replace Each Element with the Greatest Element to Its Right

## Complete Expert Program

```java
public class ReplaceEachElementwiththeGreatestElementtoItsRight {
    public static void main(String[] args) {
        int[] numbers = {17, 18, 5, 4, 6, 1};
        int greatestRight = -1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            numbers[i] = greatestRight;

            if (currentNumber > greatestRight) {
                greatestRight = currentNumber;
            }
        }

        System.out.print("Result = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println("]");
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
Result = [18, 6, 6, 6, 1, -1]
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
