# 04 — Optimized Code Explanation

## Complete Expert-Level Program

```java
import java.util.*;

public class PalindromePartitions {
    static void partition(String text, int start, List<String> current) {
        if (start == text.length()) {
            System.out.println(current);
            return;
        }

        for (int end = start; end < text.length(); end++) {
            if (isPalindrome(text, start, end)) {
                current.add(text.substring(start, end + 1));
                partition(text, end + 1, current);
                current.remove(current.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String text, int left, int right) {
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        partition("aab", 0, new ArrayList<>());
    }
}
```

## Expert Explanation

The implementation maintains a compact recursive state and explores only the choices necessary for the current branch.

### Important Expert Points

1. The base case guarantees termination.
2. Each recursive call reduces or advances the problem.
3. Backtracking restores state before another branch begins.
4. Validation or pruning prevents invalid states from being explored further.
5. The complexity depends on the size of the recursion tree.
