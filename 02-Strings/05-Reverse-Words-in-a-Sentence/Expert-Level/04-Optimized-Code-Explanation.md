# Optimized Code Explanation — Reverse Words in a Sentence

## Complete Expert Program

```java
public class ReverseWordsinaSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(' ');
        }

        System.out.println("Reversed Sentence = " + result);
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
