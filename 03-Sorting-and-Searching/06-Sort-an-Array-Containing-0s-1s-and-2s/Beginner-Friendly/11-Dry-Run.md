# 11 — Dry Run

## Complete Program

```java
public class SortAnArrayContaining0s1sAnd2s {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 2, 1, 1, 0};

        int low = 0;
        int middle = 0;
        int high = numbers.length - 1;

        while (middle <= high) {
            if (numbers[middle] == 0) {
                int temporary = numbers[low];
                numbers[low] = numbers[middle];
                numbers[middle] = temporary;

                low++;
                middle++;
            } else if (numbers[middle] == 1) {
                middle++;
            } else {
                int temporary = numbers[middle];
                numbers[middle] = numbers[high];
                numbers[high] = temporary;

                high--;
            }
        }

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```

## Dry Run — Every Important Step

### Step 1
low, middle and high divide the array into regions for 0, 1, unknown and 2.

### Step 2
A 0 is swapped into the low region.

### Step 3
A 1 is accepted in the middle region.

### Step 4
A 2 is swapped into the high region.

### Step 5
When middle passes high, the array is sorted.

### Final Result
```text
[0, 0, 1, 1, 2, 2]
```
