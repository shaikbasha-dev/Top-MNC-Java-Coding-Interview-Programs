# Optimized Dry Run — Compress a String

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
a3b2c1
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
