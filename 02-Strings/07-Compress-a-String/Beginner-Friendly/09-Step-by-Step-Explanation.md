# Step-by-Step Explanation — Compress a String

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

## Step-by-Step Execution Explanation

### Step 1
```java
public class CompressaString {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String text = "aaabbc";
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
String compressed = "";
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
int count = 1;
```

This line creates or updates program state by assigning a value to a variable.

### Step 6
```java
for (int i = 1; i <= text.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 7
```java
if (i < text.length() && text.charAt(i) == text.charAt(i - 1)) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 8
```java
count++;
```

This line performs one part of the algorithm.

### Step 9
```java
} else {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 10
```java
compressed = compressed + text.charAt(i - 1) + count;
```

This line creates or updates program state by assigning a value to a variable.

### Step 11
```java
count = 1;
```

This line creates or updates program state by assigning a value to a variable.

### Step 12
```java
System.out.println("Compressed String = " + compressed);
```

This line displays the calculated result or part of the final output.
