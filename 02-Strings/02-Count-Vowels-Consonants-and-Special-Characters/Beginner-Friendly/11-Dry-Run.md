# Dry Run — Count Vowels, Consonants and Special Characters

## Complete Program

```java
public class CountVowelsConsonantsandSpecialCharacters {
    public static void main(String[] args) {
        String text = "Hello Java! 123";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter == 'a' || currentCharacter == 'e' ||
                currentCharacter == 'i' || currentCharacter == 'o' ||
                currentCharacter == 'u' || currentCharacter == 'A' ||
                currentCharacter == 'E' || currentCharacter == 'I' ||
                currentCharacter == 'O' || currentCharacter == 'U') {
                vowels++;
            } else if ((currentCharacter >= 'a' && currentCharacter <= 'z') ||
                       (currentCharacter >= 'A' && currentCharacter <= 'Z')) {
                consonants++;
            } else if (currentCharacter >= '0' && currentCharacter <= '9') {
                digits++;
            } else if (currentCharacter != ' ') {
                specialCharacters++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + specialCharacters);
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
Vowels = 4, Consonants = 5, Digits = 3, Special Characters = 1
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
