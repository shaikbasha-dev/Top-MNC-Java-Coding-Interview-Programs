# 11 — Dry Run

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

## Dry Run — Step by Step

### Step 1 — Input

```text
numbers = [10,9,2,5,3,7,101,18]
```

### Step 2 — Create DP State

The required array or table is created.

### Step 3 — Initialize Base States

States whose answers are already known are filled first.

### Step 4 — Calculate Next State

The algorithm uses previous states according to the transition rule.

### Step 5 — Continue Filling

Each state is calculated from smaller states until the complete input has been processed.

### Step 6 — Final State

The final state represents the answer to the original problem.

### Final Result

```text
LIS length = 4
```
