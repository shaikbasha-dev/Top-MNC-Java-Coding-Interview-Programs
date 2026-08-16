# Dry Run — Find the Longest Substring Without Repeating Characters

## Complete Program

```java
public class FindtheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String text = "abcabcbb";
        int maximumLength = 0;

        for (int start = 0; start < text.length(); start++) {
            boolean[] seen = new boolean[256];

            for (int end = start; end < text.length(); end++) {
                char currentCharacter = text.charAt(end);

                if (seen[currentCharacter]) {
                    break;
                }

                seen[currentCharacter] = true;
                int currentLength = end - start + 1;

                if (currentLength > maximumLength) {
                    maximumLength = currentLength;
                }
            }
        }

        System.out.println("Length = " + maximumLength);
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
Length = 3
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
