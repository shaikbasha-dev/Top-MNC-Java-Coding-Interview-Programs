# Beginner-Friendly Code Explanation — Find the Longest Substring Without Repeating Characters

## Complete Program

```java
public class FindtheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String text = "abcabcbb";
        int maximumLength = 0;

        for (int start = 0; start < text.length(); start++) {
            boolean[] seen = new boolean[256];

            for (int end = start; end < text.length(); end++) {
                char currentCharacter = text.charAt(end);

                if (seen[currentCharacter]) {
                    break;
                }

                seen[currentCharacter] = true;
                int currentLength = end - start + 1;

                if (currentLength > maximumLength) {
                    maximumLength = currentLength;
                }
            }
        }

        System.out.println("Length = " + maximumLength);
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class FindtheLongestSubstringWithoutRepeatingCharacters {
```

This creates the class that acts as the container for our Java program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 3
```java
        String text = "abcabcbb";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 4
```java
        int maximumLength = 0;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 6
```java
        for (int start = 0; start < text.length(); start++) {
```

This loop allows us to visit characters or positions one by one.

### Line 7
```java
            boolean[] seen = new boolean[256];
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 9
```java
            for (int end = start; end < text.length(); end++) {
```

This loop allows us to visit characters or positions one by one.

### Line 10
```java
                char currentCharacter = text.charAt(end);
```

This stores one character from the string so we can inspect or compare it.

### Line 12
```java
                if (seen[currentCharacter]) {
```

This checks a condition and chooses the correct path through the program.

### Line 13
```java
                    break;
```

This statement performs a supporting operation required by the algorithm.

### Line 14
```java
                }
```

This statement performs a supporting operation required by the algorithm.

### Line 16
```java
                seen[currentCharacter] = true;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 17
```java
                int currentLength = end - start + 1;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 19
```java
                if (currentLength > maximumLength) {
```

This checks a condition and chooses the correct path through the program.

### Line 20
```java
                    maximumLength = currentLength;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 21
```java
                }
```

This statement performs a supporting operation required by the algorithm.

### Line 22
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 23
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 25
```java
        System.out.println("Length = " + maximumLength);
```

This prints information to the console so we can see the program's final result.

### Line 26
```java
    }
```

This statement performs a supporting operation required by the algorithm.

### Line 27
```java
}
```

This statement performs a supporting operation required by the algorithm.
