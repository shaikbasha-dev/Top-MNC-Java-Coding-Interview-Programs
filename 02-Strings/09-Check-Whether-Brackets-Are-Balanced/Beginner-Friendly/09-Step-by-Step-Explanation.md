# Step-by-Step Explanation — Check Whether Brackets Are Balanced

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

## Step-by-Step Execution Explanation

### Step 1
```java
import java.util.Stack;
```

This imports a Java library class required by the program.

### Step 2
```java
public class CheckWhetherBracketsAreBalanced {
```

This declares the class that contains the Java application.

### Step 3
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 4
```java
String expression = "{[()]}";
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
Stack<Character> stack = new Stack<>();
```

This line creates or updates program state by assigning a value to a variable.

### Step 6
```java
boolean balanced = true;
```

This line creates or updates program state by assigning a value to a variable.

### Step 7
```java
for (int i = 0; i < expression.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 8
```java
char currentCharacter = expression.charAt(i);
```

This line creates or updates program state by assigning a value to a variable.

### Step 9
```java
if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 10
```java
stack.push(currentCharacter);
```

This line changes the stack state as required by the bracket-processing logic.

### Step 11
```java
} else if (currentCharacter == ')' || currentCharacter == ']' || currentCharacter == '}') {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 12
```java
if (stack.isEmpty()) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 13
```java
balanced = false;
```

This line creates or updates program state by assigning a value to a variable.

### Step 14
```java
break;
```

This line performs one part of the algorithm.

### Step 15
```java
char openingCharacter = stack.pop();
```

This line creates or updates program state by assigning a value to a variable.

### Step 16
```java
if ((currentCharacter == ')' && openingCharacter != '(') ||
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 17
```java
(currentCharacter == ']' && openingCharacter != '[') ||
```

This line creates or updates program state by assigning a value to a variable.

### Step 18
```java
(currentCharacter == '}' && openingCharacter != '{')) {
```

This line creates or updates program state by assigning a value to a variable.

### Step 19
```java
balanced = false;
```

This line creates or updates program state by assigning a value to a variable.

### Step 20
```java
break;
```

This line performs one part of the algorithm.

### Step 21
```java
if (!stack.isEmpty()) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 22
```java
balanced = false;
```

This line creates or updates program state by assigning a value to a variable.

### Step 23
```java
System.out.println("Balanced = " + balanced);
```

This line displays the calculated result or part of the final output.
