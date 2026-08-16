# 10 — Beginner-Friendly Code Explanation

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

## Line-by-Line Beginner Explanation

### Line 1
```java
import java.util.ArrayList;
```

This brings a Java library class into the program so we can use its functionality.

### Line 2
```java
import java.util.Arrays;
```

This brings a Java library class into the program so we can use its functionality.

### Line 3
```java
import java.util.List;
```

This brings a Java library class into the program so we can use its functionality.

### Line 5
```java
public class MergeOverlappingIntervals {
```

This creates the class that contains the program.

### Line 6
```java
    public static void main(String[] args) {
```

This is the entry point. Java starts normal execution here.

### Line 7
```java
        int[][] intervals = {
```

This declares an array and stores the input data.

### Line 8
```java
            {1, 3},
```

This line supports the current algorithmic step.

### Line 9
```java
            {2, 6},
```

This line supports the current algorithmic step.

### Line 10
```java
            {8, 10},
```

This line supports the current algorithmic step.

### Line 11
```java
            {9, 12}
```

This line supports the current algorithmic step.

### Line 12
```java
        };
```

This line supports the current algorithmic step.

### Line 14
```java
        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));
```

This line supports the current algorithmic step.

### Line 16
```java
        List<int[]> merged = new ArrayList<>();
```

This declares an array and stores the input data.

### Line 18
```java
        int currentStart = intervals[0][0];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 19
```java
        int currentEnd = intervals[0][1];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 21
```java
        for (int i = 1; i < intervals.length; i++) {
```

This repeats the logic for the required elements.

### Line 22
```java
            if (intervals[i][0] <= currentEnd) {
```

This checks a condition and selects the correct action.

### Line 23
```java
                if (intervals[i][1] > currentEnd) {
```

This checks a condition and selects the correct action.

### Line 24
```java
                    currentEnd = intervals[i][1];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 25
```java
                }
```

This line supports the current algorithmic step.

### Line 26
```java
            } else {
```

This handles the alternative condition.

### Line 27
```java
                merged.add(new int[]{currentStart, currentEnd});
```

This declares an array and stores the input data.

### Line 28
```java
                currentStart = intervals[i][0];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 29
```java
                currentEnd = intervals[i][1];
```

This assigns or updates a variable that represents part of the algorithm.

### Line 30
```java
            }
```

This line supports the current algorithmic step.

### Line 31
```java
        }
```

This line supports the current algorithmic step.

### Line 33
```java
        merged.add(new int[]{currentStart, currentEnd});
```

This declares an array and stores the input data.

### Line 35
```java
        System.out.print("Merged Intervals = ");
```

This prints the final result so we can verify the program.

### Line 36
```java
        for (int[] interval : merged) {
```

This declares an array and stores the input data.

### Line 37
```java
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
```

This prints the final result so we can verify the program.

### Line 38
```java
        }
```

This line supports the current algorithmic step.

### Line 39
```java
    }
```

This line supports the current algorithmic step.

### Line 40
```java
}
```

This line supports the current algorithmic step.
