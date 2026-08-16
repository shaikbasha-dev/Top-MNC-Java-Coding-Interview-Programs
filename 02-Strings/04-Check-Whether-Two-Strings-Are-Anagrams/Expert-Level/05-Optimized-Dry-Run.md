# Optimized Dry Run — Check Whether Two Strings Are Anagrams

## Complete Expert Program

```java
import java.util.HashMap;
import java.util.Map;

public class CheckWhetherTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        if (first.length() != second.length()) {
            System.out.println("Are Anagrams = false");
            return;
        }

        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : first.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : second.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) - 1);
        }

        boolean anagram = true;
        for (int count : frequency.values()) {
            if (count != 0) {
                anagram = false;
                break;
            }
        }

        System.out.println("Are Anagrams = " + anagram);
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
true
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
