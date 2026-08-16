# Optimized Code Explanation — Check Whether a String Can Form a Palindrome

## Complete Expert Program

```java
import java.util.HashMap;
import java.util.Map;

public class CheckWhetheraStringCanFormaPalindrome {
    public static void main(String[] args) {
        String text = "carrace";
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        int odd = 0;
        for (int count : frequency.values()) {
            if ((count & 1) == 1) odd++;
        }

        System.out.println("Can Form Palindrome = " + (odd <= 1));
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
