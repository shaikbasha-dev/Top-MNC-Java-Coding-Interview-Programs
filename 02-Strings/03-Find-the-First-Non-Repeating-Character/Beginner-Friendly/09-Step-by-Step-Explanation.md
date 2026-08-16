# Step-by-Step Explanation — Find the First Non-Repeating Character

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

## Step-by-Step Execution Explanation

### Step 1
```java
public class FindtheFirstNonRepeatingCharacter {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String text = "swiss";
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
int[] frequency = new int[256];
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
for (int i = 0; i < text.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 6
```java
frequency[text.charAt(i)]++;
```

This line performs one part of the algorithm.

### Step 7
```java
char firstNonRepeating = '\0';
```

This line creates or updates program state by assigning a value to a variable.

### Step 8
```java
for (int i = 0; i < text.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 9
```java
if (frequency[text.charAt(i)] == 1) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 10
```java
firstNonRepeating = text.charAt(i);
```

This line creates or updates program state by assigning a value to a variable.

### Step 11
```java
break;
```

This line performs one part of the algorithm.

### Step 12
```java
if (firstNonRepeating != '\0') {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 13
```java
System.out.println("First Non-Repeating Character = " + firstNonRepeating);
```

This line displays the calculated result or part of the final output.

### Step 14
```java
} else {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 15
```java
System.out.println("No Non-Repeating Character");
```

This line displays the calculated result or part of the final output.
