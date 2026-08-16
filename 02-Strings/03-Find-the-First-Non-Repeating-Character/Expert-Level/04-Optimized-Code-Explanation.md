# Optimized Code Explanation — Find the First Non-Repeating Character

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

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
