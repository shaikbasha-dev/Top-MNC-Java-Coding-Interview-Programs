# Optimized Dry Run — Generate Valid Words from a Numeric Keypad String

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

## Dry Run

1. Initialize the optimized state.
2. Process the first character/value.
3. Update the state.
4. Process each subsequent character/value.
5. Reuse previously computed information instead of repeating earlier work.
6. Complete the final iteration.
7. Display the answer.

### Final Output

```text
[ad, ae, af, bd, be, bf, cd, ce, cf]
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
