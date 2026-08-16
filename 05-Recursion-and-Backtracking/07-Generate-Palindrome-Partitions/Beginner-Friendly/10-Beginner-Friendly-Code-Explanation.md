# 10 — Beginner-Friendly Code Explanation

## Complete Code

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

## Line-by-Line Beginner Explanation

- The class contains the complete solution.
- `main()` creates the starting input.
- The recursive method receives the current state.
- The base case answers the question: **“Have we completed one valid solution?”**
- If not, the program tries one possible choice.
- The recursive call means: **“Now solve the remaining smaller problem.”**
- After returning, the program undoes the choice.
- This undo operation is the heart of backtracking.
- The loop tries the next possible choice.
- The process continues until all valid branches are explored.

### Easy Way to Remember

**Choose → Explore → Undo → Choose another.**
