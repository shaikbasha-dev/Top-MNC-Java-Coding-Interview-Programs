# 09 — Step-by-Step Explanation

## Complete Program

```java
public class SubsetSum {
    static boolean subsetSum(int[] numbers, int target) {
        boolean[][] dp = new boolean[numbers.length + 1][target + 1];

        for (int i = 0; i <= numbers.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= numbers.length; i++) {
            for (int sum = 1; sum <= target; sum++) {
                dp[i][sum] = dp[i - 1][sum];

                if (numbers[i - 1] <= sum) {
                    dp[i][sum] = dp[i][sum]
                            || dp[i - 1][sum - numbers[i - 1]];
                }
            }
        }

        return dp[numbers.length][target];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 34, 4, 12, 5, 2};
        int target = 9;

        System.out.println("Subset exists = "
                + subsetSum(numbers, target));
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
