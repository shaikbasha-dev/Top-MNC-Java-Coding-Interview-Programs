# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesesUsingStack {
    static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == ']' && open != '[') ||
                    (ch == '}' && open != '{')) return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("Balanced = " + isBalanced("{{[()]}}"));
    }
}
```

## Dry Run

Track the pointers, node links, stack contents or queue contents after every important operation.

### Final Result

```text
Balanced = true
```
