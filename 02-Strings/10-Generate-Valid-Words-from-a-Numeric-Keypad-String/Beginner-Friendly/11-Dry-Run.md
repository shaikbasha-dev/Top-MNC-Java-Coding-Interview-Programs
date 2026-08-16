# Dry Run — Generate Valid Words from a Numeric Keypad String

## Complete Program

```java
import java.util.ArrayList;
import java.util.List;

public class GenerateValidWordsfromaNumericKeypadString {
    public static void main(String[] args) {
        String digits = "23";
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> combinations = new ArrayList<>();

        generateCombinations(digits, 0, "", keypad, combinations);

        System.out.println("Combinations = " + combinations);
    }

    static void generateCombinations(String digits, int index, String current,
                                      String[] keypad, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1,
                    current + letters.charAt(i), keypad, combinations);
        }
    }
}
```

## Dry Run

### Step 1 — Input

The program starts with the sample input shown in the source code.

### Step 2 — Initialization

All counters, indexes, collections, boundaries, or result variables are initialized.

### Step 3 — First Processing Operation

The first relevant character, word, or digit is processed. The program updates its state according to the problem rule.

### Step 4 — Continued Processing

The next values are processed one by one. At each step, compare the current state with the expected condition and note any update.

### Step 5 — Final Processing

The last required input is processed and the final state is established.

### Step 6 — Result

The program displays:

```text
[ad, ae, af, bd, be, bf, cd, ce, cf]
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
