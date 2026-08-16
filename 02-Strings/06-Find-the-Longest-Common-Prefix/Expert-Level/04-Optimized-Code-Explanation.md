# Optimized Code Explanation — Find the Longest Common Prefix

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

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
