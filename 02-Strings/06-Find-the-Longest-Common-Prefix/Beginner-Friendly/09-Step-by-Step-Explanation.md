# Step-by-Step Explanation — Find the Longest Common Prefix

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

## Step-by-Step Execution Explanation

### Step 1
```java
public class FindtheLongestCommonPrefix {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String[] words = {"flower", "flow", "flight"};
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
String firstWord = words[0];
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
String longestCommonPrefix = "";
```

This line creates or updates program state by assigning a value to a variable.

### Step 6
```java
for (int i = 0; i < firstWord.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 7
```java
char currentCharacter = firstWord.charAt(i);
```

This line creates or updates program state by assigning a value to a variable.

### Step 8
```java
boolean matchesAll = true;
```

This line creates or updates program state by assigning a value to a variable.

### Step 9
```java
for (int j = 1; j < words.length; j++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 10
```java
if (i >= words[j].length() || words[j].charAt(i) != currentCharacter) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 11
```java
matchesAll = false;
```

This line creates or updates program state by assigning a value to a variable.

### Step 12
```java
break;
```

This line performs one part of the algorithm.

### Step 13
```java
if (!matchesAll) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 14
```java
break;
```

This line performs one part of the algorithm.

### Step 15
```java
longestCommonPrefix = longestCommonPrefix + currentCharacter;
```

This line creates or updates program state by assigning a value to a variable.

### Step 16
```java
System.out.println("Longest Common Prefix = " + longestCommonPrefix);
```

This line displays the calculated result or part of the final output.
