# Dry Run — Check Whether Two Strings Are Anagrams

## Complete Program

```java
public class CheckWhetherTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        if (first.length() != second.length()) {
            System.out.println("Are Anagrams = false");
            return;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        boolean areAnagrams = true;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                areAnagrams = false;
                break;
            }
        }

        System.out.println("Are Anagrams = " + areAnagrams);
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
true
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
