# Optimized Dry Run — Count Vowels, Consonants and Special Characters

## Complete Expert Program

```java
public class CountVowelsConsonantsandSpecialCharacters {
    public static void main(String[] args) {
        String text = "Hello Java! 123";
        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (char ch : text.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) >= 0) vowels++;
            else if (Character.isLetter(ch)) consonants++;
            else if (Character.isDigit(ch)) digits++;
            else if (!Character.isWhitespace(ch)) special++;
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
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
Vowels = 4, Consonants = 5, Digits = 3, Special Characters = 1
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
