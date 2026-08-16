# Optimized Dry Run — Find the Longest Substring Without Repeating Characters

## Complete Expert Program

```java
import java.util.HashMap;
import java.util.Map;

public class FindtheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String text = "abcabcbb";
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int maximumLength = 0;

        for (int right = 0; right < text.length(); right++) {
            char ch = text.charAt(right);

            if (lastSeen.containsKey(ch) && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1;
            }

            lastSeen.put(ch, right);
            maximumLength = Math.max(maximumLength, right - left + 1);
        }

        System.out.println("Length = " + maximumLength);
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
Length = 3
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
