# Optimized Dry Run — Check Whether Brackets Are Balanced

## Complete Expert Program

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class CheckWhetherBracketsAreBalanced {
    public static void main(String[] args) {
        String expression = "{[()]}";
        Deque<Character> stack = new ArrayDeque<>();
        boolean balanced = true;

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || !matches(stack.pop(), ch)) {
                    balanced = false;
                    break;
                }
            }
        }

        balanced = balanced && stack.isEmpty();
        System.out.println("Balanced = " + balanced);
    }

    static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '[' && close == ']')
            || (open == '{' && close == '}');
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
