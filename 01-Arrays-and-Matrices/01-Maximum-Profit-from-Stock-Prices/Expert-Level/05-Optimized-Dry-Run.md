# Optimized Dry Run — Maximum Profit from Stock Prices

## Complete Expert Program

```java
public class MaximumProfitfromStockPrices {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            } else if (prices[i] - minimumPrice > maximumProfit) {
                maximumProfit = prices[i] - minimumPrice;
            }
        }

        System.out.println("Maximum Profit = " + maximumProfit);
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
Maximum Profit = 5
```

## Expert Observation

The key optimization is that information already discovered during the traversal is reused instead of being recalculated.
