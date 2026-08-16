# Step-by-Step Explanation — Count Vowels, Consonants and Special Characters

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

## Step-by-Step Execution Explanation

### Step 1
```java
public class CountVowelsConsonantsandSpecialCharacters {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String text = "Hello Java! 123";
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
int vowels = 0;
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
int consonants = 0;
```

This line creates or updates program state by assigning a value to a variable.

### Step 6
```java
int digits = 0;
```

This line creates or updates program state by assigning a value to a variable.

### Step 7
```java
int specialCharacters = 0;
```

This line creates or updates program state by assigning a value to a variable.

### Step 8
```java
for (int i = 0; i < text.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 9
```java
char currentCharacter = text.charAt(i);
```

This line creates or updates program state by assigning a value to a variable.

### Step 10
```java
if (currentCharacter == 'a' || currentCharacter == 'e' ||
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 11
```java
currentCharacter == 'i' || currentCharacter == 'o' ||
```

This line creates or updates program state by assigning a value to a variable.

### Step 12
```java
currentCharacter == 'u' || currentCharacter == 'A' ||
```

This line creates or updates program state by assigning a value to a variable.

### Step 13
```java
currentCharacter == 'E' || currentCharacter == 'I' ||
```

This line creates or updates program state by assigning a value to a variable.

### Step 14
```java
currentCharacter == 'O' || currentCharacter == 'U') {
```

This line creates or updates program state by assigning a value to a variable.

### Step 15
```java
vowels++;
```

This line performs one part of the algorithm.

### Step 16
```java
} else if ((currentCharacter >= 'a' && currentCharacter <= 'z') ||
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 17
```java
(currentCharacter >= 'A' && currentCharacter <= 'Z')) {
```

This line creates or updates program state by assigning a value to a variable.

### Step 18
```java
consonants++;
```

This line performs one part of the algorithm.

### Step 19
```java
} else if (currentCharacter >= '0' && currentCharacter <= '9') {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 20
```java
digits++;
```

This line performs one part of the algorithm.

### Step 21
```java
} else if (currentCharacter != ' ') {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 22
```java
specialCharacters++;
```

This line performs one part of the algorithm.

### Step 23
```java
System.out.println("Vowels = " + vowels);
```

This line displays the calculated result or part of the final output.

### Step 24
```java
System.out.println("Consonants = " + consonants);
```

This line displays the calculated result or part of the final output.

### Step 25
```java
System.out.println("Digits = " + digits);
```

This line displays the calculated result or part of the final output.

### Step 26
```java
System.out.println("Special Characters = " + specialCharacters);
```

This line displays the calculated result or part of the final output.
