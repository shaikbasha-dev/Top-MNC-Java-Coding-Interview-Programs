# Dry Run — Find the First Non-Repeating Character

## Complete Program

```java
public class FindtheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String text = "swiss";
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char firstNonRepeating = '\0';

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                firstNonRepeating = text.charAt(i);
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character = " + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character");
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
First Non-Repeating Character = w
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
