# Beginner-Friendly Code Explanation — Find the First Non-Repeating Character

## Complete Program

```java
public class FindtheFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String text = "swiss";
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char firstNonRepeating = '\0';

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                firstNonRepeating = text.charAt(i);
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character = " + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character");
        }
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class FindtheFirstNonRepeatingCharacter {
```

This creates the class that acts as the container for our Java program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 3
```java
        String text = "swiss";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 4
```java
        int[] frequency = new int[256];
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 6
```java
        for (int i = 0; i < text.length(); i++) {
```

This loop allows us to visit characters or positions one by one.

### Line 7
```java
            frequency[text.charAt(i)]++;
```

This statement performs a supporting operation required by the algorithm.

### Line 8
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 10
```java
        char firstNonRepeating = '\0';
```

This stores one character from the string so we can inspect or compare it.

### Line 12
```java
        for (int i = 0; i < text.length(); i++) {
```

This loop allows us to visit characters or positions one by one.

### Line 13
```java
            if (frequency[text.charAt(i)] == 1) {
```

This checks a condition and chooses the correct path through the program.

### Line 14
```java
                firstNonRepeating = text.charAt(i);
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 15
```java
                break;
```

This statement performs a supporting operation required by the algorithm.

### Line 16
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 17
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 19
```java
        if (firstNonRepeating != '\0') {
```

This checks a condition and chooses the correct path through the program.

### Line 20
```java
            System.out.println("First Non-Repeating Character = " + firstNonRepeating);
```

This prints information to the console so we can see the program's final result.

### Line 21
```java
        } else {
```

This checks a condition and chooses the correct path through the program.

### Line 22
```java
            System.out.println("No Non-Repeating Character");
```

This prints information to the console so we can see the program's final result.

### Line 23
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 24
```java
    }
```

This statement performs a supporting operation required by the algorithm.

### Line 25
```java
}
```

This statement performs a supporting operation required by the algorithm.
