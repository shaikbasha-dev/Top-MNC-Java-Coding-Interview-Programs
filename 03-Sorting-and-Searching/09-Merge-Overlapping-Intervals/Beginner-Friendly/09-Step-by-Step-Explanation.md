# 09 — Step-by-Step Explanation

## Complete Program

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));

        List<int[]> merged = new ArrayList<>();

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentEnd) {
                if (intervals[i][1] > currentEnd) {
                    currentEnd = intervals[i][1];
                }
            } else {
                merged.add(new int[]{currentStart, currentEnd});
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }

        merged.add(new int[]{currentStart, currentEnd});

        System.out.print("Merged Intervals = ");
        for (int[] interval : merged) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
    }
}
```

## Explanation of the Program

### Step 1
```java
import java.util.ArrayList;
```

This imports a Java library needed by the implementation.

### Step 2
```java
import java.util.Arrays;
```

This imports a Java library needed by the implementation.

### Step 3
```java
import java.util.List;
```

This imports a Java library needed by the implementation.

### Step 5
```java
public class MergeOverlappingIntervals {
```

This declares the class containing the program.

### Step 6
```java
public static void main(String[] args) {
```

Execution starts from the main method.

### Step 7
```java
int[][] intervals = {
```

This initializes or updates an important variable used by the algorithm.

### Step 8
```java
{1, 3},
```

This statement performs a supporting operation required by the algorithm.

### Step 9
```java
{2, 6},
```

This statement performs a supporting operation required by the algorithm.

### Step 10
```java
{8, 10},
```

This statement performs a supporting operation required by the algorithm.

### Step 11
```java
{9, 12}
```

This statement performs a supporting operation required by the algorithm.

### Step 12
```java
};
```

This statement performs a supporting operation required by the algorithm.

### Step 14
```java
Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));
```

This statement performs a supporting operation required by the algorithm.

### Step 16
```java
List<int[]> merged = new ArrayList<>();
```

This initializes or updates an important variable used by the algorithm.

### Step 18
```java
int currentStart = intervals[0][0];
```

This initializes or updates an important variable used by the algorithm.

### Step 19
```java
int currentEnd = intervals[0][1];
```

This initializes or updates an important variable used by the algorithm.

### Step 21
```java
for (int i = 1; i < intervals.length; i++) {
```

This loop repeats the operation over the required range of values.

### Step 22
```java
if (intervals[i][0] <= currentEnd) {
```

This condition decides which branch of the algorithm should execute.

### Step 23
```java
if (intervals[i][1] > currentEnd) {
```

This condition decides which branch of the algorithm should execute.

### Step 24
```java
currentEnd = intervals[i][1];
```

This initializes or updates an important variable used by the algorithm.

### Step 25
```java
}
```

This marks the beginning or end of a Java block.

### Step 26
```java
} else {
```

This condition decides which branch of the algorithm should execute.

### Step 27
```java
merged.add(new int[]{currentStart, currentEnd});
```

This statement performs a supporting operation required by the algorithm.

### Step 28
```java
currentStart = intervals[i][0];
```

This initializes or updates an important variable used by the algorithm.

### Step 29
```java
currentEnd = intervals[i][1];
```

This initializes or updates an important variable used by the algorithm.

### Step 30
```java
}
```

This marks the beginning or end of a Java block.

### Step 31
```java
}
```

This marks the beginning or end of a Java block.

### Step 33
```java
merged.add(new int[]{currentStart, currentEnd});
```

This statement performs a supporting operation required by the algorithm.

### Step 35
```java
System.out.print("Merged Intervals = ");
```

This displays the result on the console.

### Step 36
```java
for (int[] interval : merged) {
```

This loop repeats the operation over the required range of values.

### Step 37
```java
System.out.print("[" + interval[0] + "," + interval[1] + "] ");
```

This displays the result on the console.

### Step 38
```java
}
```

This marks the beginning or end of a Java block.

### Step 39
```java
}
```

This marks the beginning or end of a Java block.

### Step 40
```java
}
```

This marks the beginning or end of a Java block.
