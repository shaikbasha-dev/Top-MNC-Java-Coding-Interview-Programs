# 05 — Optimized Dry Run

## Complete Expert-Level Program

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

## State Trace

Start with:

```text
digits = 23
```

Then repeatedly:

```text
Choose -> Recurse -> Reach base case or reject -> Undo -> Try next choice
```

Final result:

```text
ad, ae, af, bd, be, bf, cd, ce, cf
```
