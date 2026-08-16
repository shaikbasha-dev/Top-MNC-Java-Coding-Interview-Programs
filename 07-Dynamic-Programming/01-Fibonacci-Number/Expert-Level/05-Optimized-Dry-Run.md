# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class FibonacciNumber {
    static int fibonacci(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}
```

## DP State Trace

Input:

```text
n = 7
```

The table or array is initialized, then each state is calculated from its required predecessor states.

Final answer:

```text
Fibonacci(7) = 13
```
