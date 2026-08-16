# 09 — Step-by-Step Explanation

## Complete Program

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

## Step-by-Step Program Explanation

1. **Class and method setup:** Java defines the class and required methods.
2. **Input setup:** The sample input is created in `main()`.
3. **DP state creation:** The required one-dimensional or two-dimensional DP structure is created.
4. **Base-case initialization:** Known answers are stored first.
5. **State transition:** Each new state is calculated from smaller previously solved states.
6. **Choice comparison:** Where alternatives exist, the required minimum, maximum, or boolean result is selected.
7. **Final state:** The state representing the complete problem contains the answer.
8. **Output:** The final answer is printed.
