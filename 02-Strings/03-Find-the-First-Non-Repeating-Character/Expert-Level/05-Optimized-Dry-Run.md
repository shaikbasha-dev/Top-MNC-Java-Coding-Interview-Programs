# Optimized Dry Run — Find the First Non-Repeating Character

## Complete Expert Program

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class FindtheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String text = "swiss";
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        Character answer = null;
        for (char ch : text.toCharArray()) {
            if (frequency.get(ch) == 1) {
                answer = ch;
                break;
            }
        }

        System.out.println(answer == null
                ? "No Non-Repeating Character"
                : "First Non-Repeating Character = " + answer);
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
First Non-Repeating Character = w
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
