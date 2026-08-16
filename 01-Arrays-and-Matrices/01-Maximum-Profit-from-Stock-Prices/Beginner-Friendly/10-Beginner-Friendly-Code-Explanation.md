# Beginner-Friendly Code Explanation — Maximum Profit from Stock Prices

The complete program is shown first. The explanation then discusses the code line by line in simple conversational language.

## Complete Program

```java
public class MaximumProfitfromStockPrices {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int arraySize = prices.length;
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for (int i = 1; i < arraySize; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minimumPrice) {
                minimumPrice = currentPrice;
            } else {
                int currentProfit = currentPrice - minimumPrice;

                if (currentProfit > maximumProfit) {
                    maximumProfit = currentProfit;
                }
            }
        }

        System.out.println("Maximum Profit = " + maximumProfit);
    }
}
```

## Line-by-Line Explanation

### Line 1
```java
public class MaximumProfitfromStockPrices {
```

This creates the class. Think of the class as the container in which our Java program lives.

### Line 2
```java
    public static void main(String[] args) {
```

This is the main method. When we run the program, Java starts executing from here.

### Line 3
```java
        int[] prices = {7, 1, 5, 3, 6, 4};
```

Here we create the input array and put the example values into it. Each value can then be accessed using its index.

### Line 4
```java
        int arraySize = prices.length;
```

Here we obtain the number of elements in the array and store it in a variable. Keeping this value in a variable makes the later loop easier for a beginner to follow.

### Line 5
```java
        int minimumPrice = prices[0];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 6
```java
        int maximumProfit = 0;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 8
```java
        for (int i = 1; i < arraySize; i++) {
```

This starts a for loop. We use the loop to visit the required array or matrix positions one by one.

### Line 9
```java
            int currentPrice = prices[i];
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 11
```java
            if (currentPrice < minimumPrice) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 12
```java
                minimumPrice = currentPrice;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 13
```java
            } else {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 14
```java
                int currentProfit = currentPrice - minimumPrice;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 16
```java
                if (currentProfit > maximumProfit) {
```

This is a decision. The program checks the condition and chooses which part of the logic should execute.

### Line 17
```java
                    maximumProfit = currentProfit;
```

This line assigns a value to a variable. The variable gives a clear name to information that the program needs.

### Line 18
```java
                }
```

This line performs one small part of the overall algorithm.

### Line 19
```java
            }
```

This line performs one small part of the overall algorithm.

### Line 20
```java
        }
```

This line performs one small part of the overall algorithm.

### Line 22
```java
        System.out.println("Maximum Profit = " + maximumProfit);
```

This displays the result on the console. We use it when we want the output to appear and then move to a new line.

### Line 23
```java
    }
```

This line performs one small part of the overall algorithm.

### Line 24
```java
}
```

This line performs one small part of the overall algorithm.
