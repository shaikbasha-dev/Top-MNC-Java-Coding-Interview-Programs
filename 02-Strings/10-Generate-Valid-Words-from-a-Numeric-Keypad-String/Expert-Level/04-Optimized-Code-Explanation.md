# Optimized Code Explanation — Generate Valid Words from a Numeric Keypad String

## Complete Expert Program

```java
import java.util.ArrayList;
import java.util.List;

public class GenerateValidWordsfromaNumericKeypadString {
    private static final String[] KEYPAD =
            {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = new ArrayList<>();

        if (!digits.isEmpty()) {
            generate(digits, 0, new StringBuilder(), result);
        }

        System.out.println("Combinations = " + result);
    }

    private static void generate(String digits, int index,
                                  StringBuilder current, List<String> result) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            generate(digits, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
```

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
