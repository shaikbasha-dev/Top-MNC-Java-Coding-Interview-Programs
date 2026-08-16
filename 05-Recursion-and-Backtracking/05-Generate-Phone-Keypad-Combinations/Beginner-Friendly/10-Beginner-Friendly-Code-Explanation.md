# 10 — Beginner-Friendly Code Explanation

## Complete Code

```java
import java.util.*;

public class PhoneKeypadCombinations {
    static final String[] KEYS = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static void generate(String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        String letters = KEYS[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            generate(digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        generate("23", 0, new StringBuilder());
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
