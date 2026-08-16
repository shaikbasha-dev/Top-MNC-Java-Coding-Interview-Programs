# 09 — Step-by-Step Explanation

## Complete Program

```java
public class Knapsack01 {
    static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                dp[i][w] = dp[i - 1][w];

                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(
                        dp[i][w],
                        values[i - 1] + dp[i - 1][w - weights[i - 1]]
                    );
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;

        System.out.println("Maximum value = "
                + knapsack(weights, values, capacity));
    }
}
```

## Step-by-Step Program Explanation

1. **Class and method setup:** Java defines the class and required methods.
2. **Input setup:** The sample input is created in `main()`.
3. **DP state creation:** The required one-dimensional or two-dimensional DP structure is created.
4. **Base-case initialization:** Known answers are stored first.
5. **State transition:** Each new state is calculated from smaller previously solved states.
6. **Choice comparison:** Where alternatives exist, the required minimum, maximum, or boolean result is selected.
7. **Final state:** The state representing the complete problem contains the answer.
8. **Output:** The final answer is printed.
