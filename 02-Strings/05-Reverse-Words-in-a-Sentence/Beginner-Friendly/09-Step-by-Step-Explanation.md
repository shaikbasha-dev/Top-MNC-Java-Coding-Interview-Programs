# Step-by-Step Explanation — Reverse Words in a Sentence

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

## Step-by-Step Execution Explanation

### Step 1
```java
public class ReverseWordsinaSentence {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String sentence = "Java is powerful";
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
String[] words = sentence.split(" ");
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
System.out.print("Reversed Sentence = ");
```

This line displays the calculated result or part of the final output.

### Step 6
```java
for (int i = words.length - 1; i >= 0; i--) {
```

This starts a loop so the program can process multiple characters or values.

### Step 7
```java
System.out.print(words[i]);
```

This line displays the calculated result or part of the final output.

### Step 8
```java
if (i != 0) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 9
```java
System.out.print(" ");
```

This line displays the calculated result or part of the final output.

### Step 10
```java
System.out.println();
```

This line displays the calculated result or part of the final output.
