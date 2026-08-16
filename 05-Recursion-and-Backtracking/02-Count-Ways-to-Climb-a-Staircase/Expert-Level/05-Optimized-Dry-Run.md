# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class ClimbingStairs {
    static int countWays(int n) {
        if (n <= 1) return 1;
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways = " + countWays(n));
    }
}
```

## State Trace

Start with:

```text
n = 5
```

Then repeatedly:

```text
Choose -> Recurse -> Reach base case or reject -> Undo -> Try next choice
```

Final result:

```text
Ways = 8
```
