# Beginner-Friendly Code Explanation — Check Whether Brackets Are Balanced

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

## Line-by-Line Explanation

### Line 1
```java
import java.util.Stack;
```

This imports a Java library class so the program can use the required data structure or utility.

### Line 3
```java
public class CheckWhetherBracketsAreBalanced {
```

This creates the class that acts as the container for our Java program.

### Line 4
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 5
```java
        String expression = "{[()]}";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 6
```java
        Stack<Character> stack = new Stack<>();
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 7
```java
        boolean balanced = true;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 9
```java
        for (int i = 0; i < expression.length(); i++) {
```

This loop allows us to visit characters or positions one by one.

### Line 10
```java
            char currentCharacter = expression.charAt(i);
```

This stores one character from the string so we can inspect or compare it.

### Line 12
```java
            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
```

This checks a condition and chooses the correct path through the program.

### Line 13
```java
                stack.push(currentCharacter);
```

This adds an opening bracket to the top of the stack.

### Line 14
```java
            } else if (currentCharacter == ')' || currentCharacter == ']' || currentCharacter == '}') {
```

This checks a condition and chooses the correct path through the program.

### Line 15
```java
                if (stack.isEmpty()) {
```

This checks a condition and chooses the correct path through the program.

### Line 16
```java
                    balanced = false;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 17
```java
                    break;
```

This statement performs a supporting operation required by the algorithm.

### Line 18
```java
                }
```

This statement performs a supporting operation required by the algorithm.

### Line 20
```java
                char openingCharacter = stack.pop();
```

This stores one character from the string so we can inspect or compare it.

### Line 22
```java
                if ((currentCharacter == ')' && openingCharacter != '(') ||
```

This checks a condition and chooses the correct path through the program.

### Line 23
```java
                    (currentCharacter == ']' && openingCharacter != '[') ||
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 24
```java
                    (currentCharacter == '}' && openingCharacter != '{')) {
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 25
```java
                    balanced = false;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 26
```java
                    break;
```

This statement performs a supporting operation required by the algorithm.

### Line 27
```java
                }
```

This statement performs a supporting operation required by the algorithm.

### Line 28
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 29
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 31
```java
        if (!stack.isEmpty()) {
```

This checks a condition and chooses the correct path through the program.

### Line 32
```java
            balanced = false;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 33
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 35
```java
        System.out.println("Balanced = " + balanced);
```

This prints information to the console so we can see the program's final result.

### Line 36
```java
    }
```

This statement performs a supporting operation required by the algorithm.

### Line 37
```java
}
```

This statement performs a supporting operation required by the algorithm.
