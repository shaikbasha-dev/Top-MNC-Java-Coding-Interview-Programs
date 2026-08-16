# Optimized Dry Run — Check Whether a String Can Form a Palindrome

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
