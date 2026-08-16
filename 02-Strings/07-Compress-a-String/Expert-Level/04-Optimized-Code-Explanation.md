# Optimized Code Explanation — Compress a String

## Complete Expert Program

```java
public class CompressaString {
    public static void main(String[] args) {
        String text = "aaabbc";
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < text.length();) {
            int j = i + 1;
            while (j < text.length() && text.charAt(j) == text.charAt(i)) j++;
            compressed.append(text.charAt(i)).append(j - i);
            i = j;
        }

        System.out.println("Compressed String = " + compressed);
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
