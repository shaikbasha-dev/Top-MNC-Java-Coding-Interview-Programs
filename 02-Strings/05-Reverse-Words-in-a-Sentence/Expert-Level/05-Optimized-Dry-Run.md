# Optimized Dry Run — Reverse Words in a Sentence

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
powerful is Java
```

### Expert Observation

The important part of the dry run is to track the maintained state after every iteration. That state is what makes the optimized solution efficient.
