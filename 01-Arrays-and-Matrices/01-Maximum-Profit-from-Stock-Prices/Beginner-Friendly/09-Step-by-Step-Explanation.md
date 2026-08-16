# Step-by-Step Explanation — Maximum Profit from Stock Prices

Below is the complete beginner-friendly program. Each major code step is followed by an explanation of what that step does.

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

## Step-by-Step Walkthrough

### Step 1

```java
public class MaximumProfitfromStockPrices {
```

This line declares the Java class that contains the program.

### Step 2

```java
public static void main(String[] args) {
```

This line declares the main method. Java starts normal application execution from this method.

### Step 3

```java
int[] prices = {7, 1, 5, 3, 6, 4};
```

This line creates and initializes the array used as the program's input data.

### Step 4

```java
int arraySize = prices.length;
```

This line obtains the required size of the array and stores it in a variable so the later logic is easier to read.

### Step 5

```java
int minimumPrice = prices[0];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 6

```java
int maximumProfit = 0;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 7

```java
for (int i = 1; i < arraySize; i++) {
```

This line starts a loop. The loop repeatedly processes the required elements.

### Step 8

```java
int currentPrice = prices[i];
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 9

```java
if (currentPrice < minimumPrice) {
```

This line makes a decision based on the current values.

### Step 10

```java
minimumPrice = currentPrice;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 11

```java
} else {
```

This line performs part of the program's processing.

### Step 12

```java
int currentProfit = currentPrice - minimumPrice;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 13

```java
if (currentProfit > maximumProfit) {
```

This line makes a decision based on the current values.

### Step 14

```java
maximumProfit = currentProfit;
```

This line creates or updates a variable. The value on the right side is assigned to the variable on the left side.

### Step 15

```java
System.out.println("Maximum Profit = " + maximumProfit);
```

This line displays part of the final result on the console.
