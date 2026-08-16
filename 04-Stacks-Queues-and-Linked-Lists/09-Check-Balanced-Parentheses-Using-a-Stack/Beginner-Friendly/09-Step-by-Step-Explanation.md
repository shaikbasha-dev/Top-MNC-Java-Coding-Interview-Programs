# 09 — Step-by-Step Explanation

## Complete Program

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

## Explanation After Each Program Step

1. **Program setup:** Create the required class, nodes, array, stack or queue.
2. **Input construction:** Build the sample data structure.
3. **Initialization:** Set the pointers or data structures required by the algorithm.
4. **Core processing:** Execute the main loop or data-structure operations.
5. **Invariant maintenance:** After each operation, verify that the required ordering or link relationship remains correct.
6. **Boundary handling:** Stop safely at null, empty, front, rear or end conditions.
7. **Result:** Return or print the final answer.
