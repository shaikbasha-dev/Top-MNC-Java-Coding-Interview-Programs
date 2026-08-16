# Beginner-Friendly Code Explanation — Compress a String

## Complete Program

```java
public class CompressaString {
    public static void main(String[] args) {
        String text = "aaabbc";
        String compressed = "";

        int count = 1;

        for (int i = 1; i <= text.length(); i++) {
            if (i < text.length() && text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                compressed = compressed + text.charAt(i - 1) + count;
                count = 1;
            }
        }

        System.out.println("Compressed String = " + compressed);
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class CompressaString {
```

This creates the class that acts as the container for our Java program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 3
```java
        String text = "aaabbc";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 4
```java
        String compressed = "";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 6
```java
        int count = 1;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 8
```java
        for (int i = 1; i <= text.length(); i++) {
```

This loop allows us to visit characters or positions one by one.

### Line 9
```java
            if (i < text.length() && text.charAt(i) == text.charAt(i - 1)) {
```

This checks a condition and chooses the correct path through the program.

### Line 10
```java
                count++;
```

This statement performs a supporting operation required by the algorithm.

### Line 11
```java
            } else {
```

This checks a condition and chooses the correct path through the program.

### Line 12
```java
                compressed = compressed + text.charAt(i - 1) + count;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 13
```java
                count = 1;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 14
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 15
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 17
```java
        System.out.println("Compressed String = " + compressed);
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 18
```java
    }
```

This statement performs a supporting operation required by the algorithm.

### Line 19
```java
}
```

This statement performs a supporting operation required by the algorithm.
