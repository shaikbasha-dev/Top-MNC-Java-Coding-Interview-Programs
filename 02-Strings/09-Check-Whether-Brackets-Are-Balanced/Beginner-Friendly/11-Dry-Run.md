# Dry Run — Check Whether Brackets Are Balanced

## Complete Program

```java
import java.util.Stack;

public class CheckWhetherBracketsAreBalanced {
    public static void main(String[] args) {
        String expression = "{[()]}";
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;

        for (int i = 0; i < expression.length(); i++) {
            char currentCharacter = expression.charAt(i);

            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                stack.push(currentCharacter);
            } else if (currentCharacter == ')' || currentCharacter == ']' || currentCharacter == '}') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char openingCharacter = stack.pop();

                if ((currentCharacter == ')' && openingCharacter != '(') ||
                    (currentCharacter == ']' && openingCharacter != '[') ||
                    (currentCharacter == '}' && openingCharacter != '{')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        System.out.println("Balanced = " + balanced);
    }
}
```

## Dry Run

### Step 1 — Input

The program starts with the sample input shown in the source code.

### Step 2 — Initialization

All counters, indexes, collections, boundaries, or result variables are initialized.

### Step 3 — First Processing Operation

The first relevant character, word, or digit is processed. The program updates its state according to the problem rule.

### Step 4 — Continued Processing

The next values are processed one by one. At each step, compare the current state with the expected condition and note any update.

### Step 5 — Final Processing

The last required input is processed and the final state is established.

### Step 6 — Result

The program displays:

```text
true
```

### Interview Dry-Run Method

During an interview, write the input on paper and maintain a small table of the important variables after every iteration. This makes the algorithm easy to explain and helps detect mistakes.
