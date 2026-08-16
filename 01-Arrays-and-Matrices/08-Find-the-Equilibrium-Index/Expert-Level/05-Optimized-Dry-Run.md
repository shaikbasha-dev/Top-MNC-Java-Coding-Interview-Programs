# Optimized Dry Run — Find the Equilibrium Index

## Complete Expert Program

```java
public class FindtheEquilibriumIndex {
    public static void main(String[] args) {
        int[] numbers = {-7,1,5,2,-4,3,0};
        int totalSum = 0;
        for (int number : numbers) totalSum += number;

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int rightSum = totalSum - leftSum - numbers[i];
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
            leftSum += numbers[i];
        }

        System.out.println("Equilibrium Index = " + equilibriumIndex);
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
Equilibrium Index = 3
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
