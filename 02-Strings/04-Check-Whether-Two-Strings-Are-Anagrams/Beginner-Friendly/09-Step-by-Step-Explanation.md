# Step-by-Step Explanation — Check Whether Two Strings Are Anagrams

## Complete Program

```java
public class CheckWhetherTwoStringsAreAnagrams {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        if (first.length() != second.length()) {
            System.out.println("Are Anagrams = false");
            return;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        boolean areAnagrams = true;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                areAnagrams = false;
                break;
            }
        }

        System.out.println("Are Anagrams = " + areAnagrams);
    }
}
```

## Step-by-Step Execution Explanation

### Step 1
```java
public class CheckWhetherTwoStringsAreAnagrams {
```

This declares the class that contains the Java application.

### Step 2
```java
public static void main(String[] args) {
```

This declares the main method, where normal program execution begins.

### Step 3
```java
String first = "listen";
```

This line creates or updates program state by assigning a value to a variable.

### Step 4
```java
String second = "silent";
```

This line creates or updates program state by assigning a value to a variable.

### Step 5
```java
if (first.length() != second.length()) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 6
```java
System.out.println("Are Anagrams = false");
```

This line displays the calculated result or part of the final output.

### Step 7
```java
return;
```

This returns from the current method because the required condition or base case has been reached.

### Step 8
```java
int[] frequency = new int[256];
```

This line creates or updates program state by assigning a value to a variable.

### Step 9
```java
for (int i = 0; i < first.length(); i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 10
```java
frequency[first.charAt(i)]++;
```

This line performs one part of the algorithm.

### Step 11
```java
frequency[second.charAt(i)]--;
```

This line performs one part of the algorithm.

### Step 12
```java
boolean areAnagrams = true;
```

This line creates or updates program state by assigning a value to a variable.

### Step 13
```java
for (int i = 0; i < frequency.length; i++) {
```

This starts a loop so the program can process multiple characters or values.

### Step 14
```java
if (frequency[i] != 0) {
```

This decision checks the current state and chooses the correct branch of the algorithm.

### Step 15
```java
areAnagrams = false;
```

This line creates or updates program state by assigning a value to a variable.

### Step 16
```java
break;
```

This line performs one part of the algorithm.

### Step 17
```java
System.out.println("Are Anagrams = " + areAnagrams);
```

This line displays the calculated result or part of the final output.
