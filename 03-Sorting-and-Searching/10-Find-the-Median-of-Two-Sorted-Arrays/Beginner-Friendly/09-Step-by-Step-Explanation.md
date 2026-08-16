# 09 — Step-by-Step Explanation

## Complete Program

```java
public class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] first = {1, 3};
        int[] second = {2};

        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }

        double median;

        if (merged.length % 2 == 1) {
            median = merged[merged.length / 2];
        } else {
            int middle = merged.length / 2;
            median = (merged[middle - 1] + merged[middle]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}
```

## Explanation of the Program

### Step 1
```java
public class FindMedianOfTwoSortedArrays {
```

This declares the class containing the program.

### Step 2
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 3
```java
int[] first = {1, 3};
```

This initializes or updates an important variable used by the algorithm.

### Step 4
```java
int[] second = {2};
```

This initializes or updates an important variable used by the algorithm.

### Step 6
```java
int[] merged = new int[first.length + second.length];
```

This initializes or updates an important variable used by the algorithm.

### Step 8
```java
int i = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 9
```java
int j = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 10
```java
int k = 0;
```

This initializes or updates an important variable used by the algorithm.

### Step 12
```java
while (i < first.length && j < second.length) {
```

This loop repeats the operation over the required range of values.

### Step 13
```java
if (first[i] <= second[j]) {
```

This condition decides which branch of the algorithm should execute.

### Step 14
```java
merged[k] = first[i];
```

This initializes or updates an important variable used by the algorithm.

### Step 15
```java
i++;
```

This statement performs a supporting operation required by the algorithm.

### Step 16
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 17
```java
merged[k] = second[j];
```

This initializes or updates an important variable used by the algorithm.

### Step 18
```java
j++;
```

This statement performs a supporting operation required by the algorithm.

### Step 19
```java
}
```

This marks the beginning or end of a Java block.

### Step 20
```java
k++;
```

This statement performs a supporting operation required by the algorithm.

### Step 21
```java
}
```

This marks the beginning or end of a Java block.

### Step 23
```java
while (i < first.length) {
```

This loop repeats the operation over the required range of values.

### Step 24
```java
merged[k] = first[i];
```

This initializes or updates an important variable used by the algorithm.

### Step 25
```java
i++;
```

This statement performs a supporting operation required by the algorithm.

### Step 26
```java
k++;
```

This statement performs a supporting operation required by the algorithm.

### Step 27
```java
}
```

This marks the beginning or end of a Java block.

### Step 29
```java
while (j < second.length) {
```

This loop repeats the operation over the required range of values.

### Step 30
```java
merged[k] = second[j];
```

This initializes or updates an important variable used by the algorithm.

### Step 31
```java
j++;
```

This statement performs a supporting operation required by the algorithm.

### Step 32
```java
k++;
```

This statement performs a supporting operation required by the algorithm.

### Step 33
```java
}
```

This marks the beginning or end of a Java block.

### Step 35
```java
double median;
```

This statement performs a supporting operation required by the algorithm.

### Step 37
```java
if (merged.length % 2 == 1) {
```

This condition decides which branch of the algorithm should execute.

### Step 38
```java
median = merged[merged.length / 2];
```

This initializes or updates an important variable used by the algorithm.

### Step 39
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 40
```java
int middle = merged.length / 2;
```

This initializes or updates an important variable used by the algorithm.

### Step 41
```java
median = (merged[middle - 1] + merged[middle]) / 2.0;
```

This initializes or updates an important variable used by the algorithm.

### Step 42
```java
}
```

This marks the beginning or end of a Java block.

### Step 44
```java
System.out.println("Median = " + median);
```

This displays the result on the console.

### Step 45
```java
}
```

This marks the beginning or end of a Java block.

### Step 46
```java
}
```

This marks the beginning or end of a Java block.
