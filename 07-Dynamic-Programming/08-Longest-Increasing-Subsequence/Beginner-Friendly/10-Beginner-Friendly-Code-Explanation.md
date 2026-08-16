# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.*;

public class LongestIncreasingSubsequence {
    static int lis(int[] numbers) {
        if (numbers.length == 0) return 0;

        int[] dp = new int[numbers.length];
        Arrays.fill(dp, 1);

        int answer = 1;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LIS length = " + lis(numbers));
    }
}
```

## Beginner-Friendly Explanation

Think of the DP array or table as a notebook.

- Each `dp` position represents one smaller question.
- First, write the answers that are already known.
- Calculate the next answer using the answers already written.
- Because those smaller answers are stored, the same subproblem is not solved repeatedly.
- `for` loops move through the states in the required order.
- `Math.max()` is useful when the problem asks for the best/largest choice.
- `Math.min()` is useful when the problem asks for the cheapest/smallest choice.
- A boolean DP table stores whether a target is possible.
- A two-dimensional table is used when two changing values define the state.

### Easy Way to Remember

**DP = Store Small Answers → Reuse Them → Build the Big Answer**
