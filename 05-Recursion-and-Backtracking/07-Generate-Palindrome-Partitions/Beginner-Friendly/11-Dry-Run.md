# 11 — Dry Run

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: text = aab
```

### Step 2 — First Recursive Call

The algorithm starts with an empty or initial state.

### Step 3 — Make the First Choice

One candidate is selected and added to the current state.

### Step 4 — Recursive Exploration

The method calls itself with the remaining problem.

### Step 5 — Base Case

When the required state is complete, the solution is recorded or displayed.

### Step 6 — Backtrack

The last choice is removed or restored.

### Step 7 — Try the Next Choice

The next candidate is selected and the same process repeats.

### Final Result

```text
[a, a, b], [aa, b]
```
