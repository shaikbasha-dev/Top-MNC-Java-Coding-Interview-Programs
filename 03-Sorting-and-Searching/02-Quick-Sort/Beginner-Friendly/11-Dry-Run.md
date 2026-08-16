# 11 — Dry Run

## Complete Program

```java
public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};

        quickSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    static void quickSort(int[] numbers, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(numbers, low, high);

        quickSort(numbers, low, pivotIndex - 1);
        quickSort(numbers, pivotIndex + 1, high);
    }

    static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int smallerIndex = low - 1;

        for (int current = low; current < high; current++) {
            if (numbers[current] <= pivot) {
                smallerIndex++;

                int temporary = numbers[smallerIndex];
                numbers[smallerIndex] = numbers[current];
                numbers[current] = temporary;
            }
        }

        int temporary = numbers[smallerIndex + 1];
        numbers[smallerIndex + 1] = numbers[high];
        numbers[high] = temporary;

        return smallerIndex + 1;
    }
}
```

## Dry Run — Every Important Step

### Step 1
Pivot 5 partitions the array into values <= 5 and values > 5.

### Step 2
The pivot reaches its correct position.

### Step 3
The left and right partitions are recursively sorted.

### Step 4
Final array becomes [1,5,7,8,9,10].

### Final Result
```text
[1, 5, 7, 8, 9, 10]
```
