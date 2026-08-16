# Optimized Code Explanation — Check Whether Brackets Are Balanced

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

## Expert Line-by-Line Explanation

The expert version keeps the implementation focused on the optimized algorithm. For each declaration, traversal, condition and update, identify the state being maintained and the repeated work that has been avoided.

### Important Interview Reading

- Identify the data structure.
- Identify the main traversal.
- Identify the maintained invariant/state.
- Identify where the answer is updated.
- Identify the complexity.
- Explain why the expert version performs less repeated work than the beginner version.
