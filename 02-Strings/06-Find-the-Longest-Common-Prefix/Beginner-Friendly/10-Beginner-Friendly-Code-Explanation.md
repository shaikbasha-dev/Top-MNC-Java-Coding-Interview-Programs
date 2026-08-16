# Beginner-Friendly Code Explanation — Find the Longest Common Prefix

## Complete Program

```java
public class FindtheLongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String firstWord = words[0];
        String longestCommonPrefix = "";

        for (int i = 0; i < firstWord.length(); i++) {
            char currentCharacter = firstWord.charAt(i);
            boolean matchesAll = true;

            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) != currentCharacter) {
                    matchesAll = false;
                    break;
                }
            }

            if (!matchesAll) {
                break;
            }

            longestCommonPrefix = longestCommonPrefix + currentCharacter;
        }

        System.out.println("Longest Common Prefix = " + longestCommonPrefix);
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class FindtheLongestCommonPrefix {
```

This creates the class that acts as the container for our Java program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 3
```java
        String[] words = {"flower", "flow", "flight"};
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 4
```java
        String firstWord = words[0];
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 5
```java
        String longestCommonPrefix = "";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 7
```java
        for (int i = 0; i < firstWord.length(); i++) {
```

This loop allows us to visit characters or positions one by one.

### Line 8
```java
            char currentCharacter = firstWord.charAt(i);
```

This stores one character from the string so we can inspect or compare it.

### Line 9
```java
            boolean matchesAll = true;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 11
```java
            for (int j = 1; j < words.length; j++) {
```

This loop allows us to visit characters or positions one by one.

### Line 12
```java
                if (i >= words[j].length() || words[j].charAt(i) != currentCharacter) {
```

This checks a condition and chooses the correct path through the program.

### Line 13
```java
                    matchesAll = false;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 14
```java
                    break;
```

This statement performs a supporting operation required by the algorithm.

### Line 15
```java
                }
```

This statement performs a supporting operation required by the algorithm.

### Line 16
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 18
```java
            if (!matchesAll) {
```

This checks a condition and chooses the correct path through the program.

### Line 19
```java
                break;
```

This statement performs a supporting operation required by the algorithm.

### Line 20
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 22
```java
            longestCommonPrefix = longestCommonPrefix + currentCharacter;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 23
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 25
```java
        System.out.println("Longest Common Prefix = " + longestCommonPrefix);
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
