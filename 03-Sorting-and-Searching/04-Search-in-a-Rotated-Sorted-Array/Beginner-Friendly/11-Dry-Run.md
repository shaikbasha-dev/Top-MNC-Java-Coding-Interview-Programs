# 11 — Dry Run

## Complete Program

```java
public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(numbers, target);

        System.out.println("Target Index = " + index);
    }

    static int search(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[low] <= numbers[middle]) {
                if (target >= numbers[low] && target < numbers[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            } else {
                if (target > numbers[middle] && target <= numbers[high]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }

        return -1;
    }
}
```

## Dry Run — Every Important Step

### Step 1
Middle value 7 is not the target.

### Step 2
The left side is sorted, but target 0 is not inside that range.

### Step 3
Search moves to the right half.

### Step 4
Target 0 is found at index 4.

### Final Result
```text
Target Index = 4
```
