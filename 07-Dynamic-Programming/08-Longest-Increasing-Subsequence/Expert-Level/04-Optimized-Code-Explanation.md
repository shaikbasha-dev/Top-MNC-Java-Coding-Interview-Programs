# 04 — Optimized Code Explanation

## Complete Expert-Level Program

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

## Expert Explanation

The solution uses tabulation to calculate each required state exactly once.

### Expert Points

1. The state definition determines the DP design.
2. Base states are established before dependent states.
3. Every transition uses already calculated states.
4. Unnecessary recursive recomputation is avoided.
5. Space can sometimes be reduced when only recent states are needed.
