# Optimized Code Explanation — Check Whether Two Strings Are Anagrams

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

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
