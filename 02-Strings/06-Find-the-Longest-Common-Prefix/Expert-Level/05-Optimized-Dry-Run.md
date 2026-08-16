# Optimized Dry Run — Find the Longest Common Prefix

## Complete Expert Program

```java
public class FindtheLongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String prefix = words[0];

        for (int i = 1; i < words.length && !prefix.isEmpty(); i++) {
            while (!words[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println("Longest Common Prefix = " + prefix);
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
fl
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
