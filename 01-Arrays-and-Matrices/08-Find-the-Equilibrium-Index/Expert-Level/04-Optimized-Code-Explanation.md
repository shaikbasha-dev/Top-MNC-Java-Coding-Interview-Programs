# Optimized Code Explanation — Find the Equilibrium Index

## Complete Expert Program

```java
public class FindtheEquilibriumIndex {
    public static void main(String[] args) {
        int[] numbers = {-7,1,5,2,-4,3,0};
        int totalSum = 0;
        for (int number : numbers) totalSum += number;

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int rightSum = totalSum - leftSum - numbers[i];
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
            leftSum += numbers[i];
        }

        System.out.println("Equilibrium Index = " + equilibriumIndex);
    }
}
```

## Explanation

### Line 1
```java
public class FindtheEquilibriumIndex {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 2
```java
    public static void main(String[] args) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 3
```java
        int[] numbers = {-7,1,5,2,-4,3,0};
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 4
```java
        int totalSum = 0;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 5
```java
        for (int number : numbers) totalSum += number;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 7
```java
        int leftSum = 0;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 8
```java
        int equilibriumIndex = -1;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 10
```java
        for (int i = 0; i < numbers.length; i++) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 11
```java
            int rightSum = totalSum - leftSum - numbers[i];
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 12
```java
            if (leftSum == rightSum) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 13
```java
                equilibriumIndex = i;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 14
```java
                break;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 15
```java
            }
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 16
```java
            leftSum += numbers[i];
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 17
```java
        }
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 19
```java
        System.out.println("Equilibrium Index = " + equilibriumIndex);
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 20
```java
    }
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 21
```java
}
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.
