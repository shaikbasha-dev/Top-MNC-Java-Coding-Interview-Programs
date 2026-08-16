# Step-by-Step Explanation — Find the Longest Substring Without Repeating Characters

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

## Step-by-Step Execution Explanation

### Step 1
```java
public class FindtheLongestSubstringWithoutRepeatingCharacters {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String text = "abcabcbb";
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
int maximumLength = 0;
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
for (int start = 0; start < text.length(); start++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 6
```java
boolean[] seen = new boolean[256];
```

This line creates or updates program state by assigning a value to a variable.

### Step 7
```java
for (int end = start; end < text.length(); end++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 8
```java
char currentCharacter = text.charAt(end);
```

This line creates or updates program state by assigning a value to a variable.

### Step 9
```java
if (seen[currentCharacter]) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 10
```java
break;
```

This line performs one part of the algorithm.

### Step 11
```java
seen[currentCharacter] = true;
```

This line creates or updates program state by assigning a value to a variable.

### Step 12
```java
int currentLength = end - start + 1;
```

This line creates or updates program state by assigning a value to a variable.

### Step 13
```java
if (currentLength > maximumLength) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 14
```java
maximumLength = currentLength;
```

This line creates or updates program state by assigning a value to a variable.

### Step 15
```java
System.out.println("Length = " + maximumLength);
```

This line displays the calculated result or part of the final output.
