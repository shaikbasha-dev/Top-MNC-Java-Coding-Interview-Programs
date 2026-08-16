# 09 — Step-by-Step Explanation

## Complete Program

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

## Step-by-Step Program Explanation

1. **Class and method setup:** Java defines the class and required methods.
2. **Input setup:** The sample input is created in `main()`.
3. **DP state creation:** The required one-dimensional or two-dimensional DP structure is created.
4. **Base-case initialization:** Known answers are stored first.
5. **State transition:** Each new state is calculated from smaller previously solved states.
6. **Choice comparison:** Where alternatives exist, the required minimum, maximum, or boolean result is selected.
7. **Final state:** The state representing the complete problem contains the answer.
8. **Output:** The final answer is printed.
