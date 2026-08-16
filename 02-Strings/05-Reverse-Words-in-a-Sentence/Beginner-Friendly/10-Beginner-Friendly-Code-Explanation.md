# Beginner-Friendly Code Explanation — Reverse Words in a Sentence

## Complete Program

```java
public class ReverseWordsinaSentence {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");

        System.out.print("Reversed Sentence = ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class ReverseWordsinaSentence {
```

This creates the class that acts as the container for our Java program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 3
```java
        String sentence = "Java is powerful";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 4
```java
        String[] words = sentence.split(" ");
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 6
```java
        System.out.print("Reversed Sentence = ");
```

This prints information to the console so we can see the program's final result.

### Line 8
```java
        for (int i = words.length - 1; i >= 0; i--) {
```

This loop allows us to visit characters or positions one by one.

### Line 9
```java
            System.out.print(words[i]);
```

This prints information to the console so we can see the program's final result.

### Line 11
```java
            if (i != 0) {
```

This checks a condition and chooses the correct path through the program.

### Line 12
```java
                System.out.print(" ");
```

This prints information to the console so we can see the program's final result.

### Line 13
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 14
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 16
```java
        System.out.println();
```

This prints information to the console so we can see the program's final result.

### Line 17
```java
    }
```

This statement performs a supporting operation required by the algorithm.

### Line 18
```java
}
```

This statement performs a supporting operation required by the algorithm.
