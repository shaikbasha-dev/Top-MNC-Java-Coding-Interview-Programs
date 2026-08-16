# Optimized Code Explanation — Maximum Profit from Stock Prices

## Complete Expert Program

```java
public class MaximumProfitfromStockPrices {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            } else if (prices[i] - minimumPrice > maximumProfit) {
                maximumProfit = prices[i] - minimumPrice;
            }
        }

        System.out.println("Maximum Profit = " + maximumProfit);
    }
}
```

## Explanation

### Line 1
```java
public class MaximumProfitfromStockPrices {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 2
```java
    public static void main(String[] args) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 3
```java
        int[] prices = {7, 1, 5, 3, 6, 4};
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 4
```java
        int minimumPrice = prices[0];
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 5
```java
        int maximumProfit = 0;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 7
```java
        for (int i = 1; i < prices.length; i++) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 8
```java
            if (prices[i] < minimumPrice) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 9
```java
                minimumPrice = prices[i];
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 10
```java
            } else if (prices[i] - minimumPrice > maximumProfit) {
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 11
```java
                maximumProfit = prices[i] - minimumPrice;
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 12
```java
            }
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 13
```java
        }
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 15
```java
        System.out.println("Maximum Profit = " + maximumProfit);
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 16
```java
    }
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.

### Line 17
```java
}
```

This line is part of the optimized implementation. It either declares a value, performs the optimized calculation, controls traversal, makes a decision, or displays the result. The important interview point is to understand why this operation is sufficient without repeating work unnecessarily.
