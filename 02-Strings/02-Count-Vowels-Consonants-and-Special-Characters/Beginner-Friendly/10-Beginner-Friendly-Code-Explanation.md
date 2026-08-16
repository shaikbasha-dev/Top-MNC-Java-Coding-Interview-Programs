# Beginner-Friendly Code Explanation — Count Vowels, Consonants and Special Characters

## Complete Program

```java
public class CountVowelsConsonantsandSpecialCharacters {
    public static void main(String[] args) {
        String text = "Hello Java! 123";
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter == 'a' || currentCharacter == 'e' ||
                currentCharacter == 'i' || currentCharacter == 'o' ||
                currentCharacter == 'u' || currentCharacter == 'A' ||
                currentCharacter == 'E' || currentCharacter == 'I' ||
                currentCharacter == 'O' || currentCharacter == 'U') {
                vowels++;
            } else if ((currentCharacter >= 'a' && currentCharacter <= 'z') ||
                       (currentCharacter >= 'A' && currentCharacter <= 'Z')) {
                consonants++;
            } else if (currentCharacter >= '0' && currentCharacter <= '9') {
                digits++;
            } else if (currentCharacter != ' ') {
                specialCharacters++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + specialCharacters);
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class CountVowelsConsonantsandSpecialCharacters {
```

This creates the class that acts as the container for our Java program.

### Line 2
```java
    public static void main(String[] args) {
```

This is the starting point of the application. Java begins normal execution here.

### Line 3
```java
        String text = "Hello Java! 123";
```

This creates a String variable. The variable stores the text that our program needs to process.

### Line 4
```java
        int vowels = 0;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 5
```java
        int consonants = 0;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 6
```java
        int digits = 0;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 7
```java
        int specialCharacters = 0;
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 9
```java
        for (int i = 0; i < text.length(); i++) {
```

This loop allows us to visit characters or positions one by one.

### Line 10
```java
            char currentCharacter = text.charAt(i);
```

This stores one character from the string so we can inspect or compare it.

### Line 12
```java
            if (currentCharacter == 'a' || currentCharacter == 'e' ||
```

This checks a condition and chooses the correct path through the program.

### Line 13
```java
                currentCharacter == 'i' || currentCharacter == 'o' ||
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 14
```java
                currentCharacter == 'u' || currentCharacter == 'A' ||
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 15
```java
                currentCharacter == 'E' || currentCharacter == 'I' ||
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 16
```java
                currentCharacter == 'O' || currentCharacter == 'U') {
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 17
```java
                vowels++;
```

This statement performs a supporting operation required by the algorithm.

### Line 18
```java
            } else if ((currentCharacter >= 'a' && currentCharacter <= 'z') ||
```

This checks a condition and chooses the correct path through the program.

### Line 19
```java
                       (currentCharacter >= 'A' && currentCharacter <= 'Z')) {
```

This assigns a value to a variable. The variable name makes the purpose of the value easier to understand.

### Line 20
```java
                consonants++;
```

This statement performs a supporting operation required by the algorithm.

### Line 21
```java
            } else if (currentCharacter >= '0' && currentCharacter <= '9') {
```

This checks a condition and chooses the correct path through the program.

### Line 22
```java
                digits++;
```

This statement performs a supporting operation required by the algorithm.

### Line 23
```java
            } else if (currentCharacter != ' ') {
```

This checks a condition and chooses the correct path through the program.

### Line 24
```java
                specialCharacters++;
```

This statement performs a supporting operation required by the algorithm.

### Line 25
```java
            }
```

This statement performs a supporting operation required by the algorithm.

### Line 26
```java
        }
```

This statement performs a supporting operation required by the algorithm.

### Line 28
```java
        System.out.println("Vowels = " + vowels);
```

This prints information to the console so we can see the program's final result.

### Line 29
```java
        System.out.println("Consonants = " + consonants);
```

This prints information to the console so we can see the program's final result.

### Line 30
```java
        System.out.println("Digits = " + digits);
```

This prints information to the console so we can see the program's final result.

### Line 31
```java
        System.out.println("Special Characters = " + specialCharacters);
```

This prints information to the console so we can see the program's final result.

### Line 32
```java
    }
```

This statement performs a supporting operation required by the algorithm.

### Line 33
```java
}
```

This statement performs a supporting operation required by the algorithm.
