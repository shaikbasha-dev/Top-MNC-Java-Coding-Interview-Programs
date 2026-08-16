# Dry Run — Maximum Profit from Stock Prices

## Complete Program

```java
public class MaximumProfitfromStockPrices {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int arraySize = prices.length;
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < arraySize; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minimumPrice) {
                minimumPrice = currentPrice;
            } else {
                int currentProfit = currentPrice - minimumPrice;

                if (currentProfit > maximumProfit) {
                    maximumProfit = currentProfit;
                }
            }
        }

        System.out.println("Maximum Profit = " + maximumProfit);
    }
}
```

## Dry Run

The dry run follows the program as if we were the computer executing it.

### Step 1 — Program starts

Java enters the `main()` method and creates the input data.

### Step 2 — Initial values

The program creates the variables required by the algorithm and gives them their starting values.

### Step 3 — First processing step

The first required element, row, column, or boundary is processed according to the program's condition.

### Step 4 — Repeated processing

The loop continues. At each iteration, the program reads the current value, compares or calculates as required, and updates its variables.

### Step 5 — Important intermediate result

The program keeps the best/current result in its designated variable. Each later iteration either improves it or leaves it unchanged.

### Step 6 — Completion

After the final required element is processed, the loop ends and the final result is displayed.

### Final Result

```text
Maximum Profit = 5
```

> For a full interview dry run, trace the actual variable values at every loop iteration using the input shown in the program.
