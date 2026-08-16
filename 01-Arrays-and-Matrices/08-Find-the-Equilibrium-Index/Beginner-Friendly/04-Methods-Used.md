# Methods Used — Find the Equilibrium Index

The following callable methods are present in the program.

## main()

### General Definition
The main method is the starting point of a Java application.

### Syntax
```java
public static void main(String[] args)
```

### General Example
```java
public static void main(String[] args) { System.out.println("Hello"); }
```

### Why This Method Is Used in This Program
It provides the entry point for this complete executable program.

### What Happens If It Is Not Used
Without it, this standalone Java application would not have the standard starting point used by the Java launcher.

## System.out.print()

### General Definition
print() displays text without moving to the next line.

### Syntax
```java
System.out.print(value)
```

### General Example
```java
System.out.print("Hello");
```

### Why This Method Is Used in This Program
It is used when output should continue on the same line, such as array or matrix results.

### What Happens If It Is Not Used
The output could still be produced with println(), but the formatting would change.

## System.out.println()

### General Definition
println() displays a value and moves to the next line.

### Syntax
```java
System.out.println(value)
```

### General Example
```java
System.out.println("Result");
```

### Why This Method Is Used in This Program
It is used to display the final result clearly.

### What Happens If It Is Not Used
The result would not be displayed to the console at that point.

## Important Java Note

Array `length` is a field/property, not a method. Therefore it is not incorrectly listed as a method here.