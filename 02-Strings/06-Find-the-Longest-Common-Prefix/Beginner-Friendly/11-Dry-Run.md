# Dry Run — Find the Longest Common Prefix

## Complete Program

```java
public class FindtheLongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String firstWord = words[0];
        String longestCommonPrefix = "";

        for (int i = 0; i < firstWord.length(); i++) {
            char currentCharacter = firstWord.charAt(i);
            boolean matchesAll = true;

            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) != currentCharacter) {
                    matchesAll = false;
                    break;
                }
            }

            if (!matchesAll) {
                break;
            }

            longestCommonPrefix = longestCommonPrefix + currentCharacter;
        }

        System.out.println("Longest Common Prefix = " + longestCommonPrefix);
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
fl
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
