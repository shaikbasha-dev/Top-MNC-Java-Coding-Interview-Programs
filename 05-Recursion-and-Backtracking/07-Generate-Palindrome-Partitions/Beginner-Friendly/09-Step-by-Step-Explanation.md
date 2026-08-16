# 09 — Step-by-Step Explanation

## Complete Program

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

## Step-by-Step Program Explanation

1. **Program setup:** Define the class and required helper methods.
2. **Input setup:** Create the sample data.
3. **Initial call:** Start recursion with the initial index, position or state.
4. **Base-case check:** Determine whether the complete solution has been formed.
5. **Make a choice:** Select one possible candidate.
6. **Recursive call:** Solve the remaining smaller problem.
7. **Backtrack:** Undo the choice so another branch can be explored.
8. **Repeat:** Continue until every required branch has been processed.
9. **Output:** Display or return the generated result.
