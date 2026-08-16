# Optimized Code Explanation — Find the Longest Substring Without Repeating Characters

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

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
