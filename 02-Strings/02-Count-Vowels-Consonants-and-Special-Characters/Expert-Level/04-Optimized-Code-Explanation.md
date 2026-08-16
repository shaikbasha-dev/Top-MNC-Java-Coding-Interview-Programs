# Optimized Code Explanation — Count Vowels, Consonants and Special Characters

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

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
