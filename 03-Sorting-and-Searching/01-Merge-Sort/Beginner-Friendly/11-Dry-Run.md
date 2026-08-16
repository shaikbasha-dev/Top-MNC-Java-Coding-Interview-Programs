# 11 — Dry Run

## Complete Program

```java
public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    static void mergeSort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;

        mergeSort(numbers, left, middle);
        mergeSort(numbers, middle + 1, right);

        merge(numbers, left, middle, right);
    }

    static void merge(int[] numbers, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temporary[k] = numbers[i];
                i++;
            } else {
                temporary[k] = numbers[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            temporary[k] = numbers[i];
            i++;
            k++;
        }

        while (j <= right) {
            temporary[k] = numbers[j];
            j++;
            k++;
        }

        for (int index = 0; index < temporary.length; index++) {
            numbers[left + index] = temporary[index];
        }
    }
}
```

## Dry Run — Every Important Step

### Step 1
[38,27,43,3,9,82,10] is divided into smaller halves.

### Step 2
[38,27,43] and [3,9,82,10] are recursively sorted.

### Step 3
Sorted halves are merged repeatedly.

### Step 4
Final array becomes [3,9,10,27,38,43,82].

### Final Result
```text
[3, 9, 10, 27, 38, 43, 82]
```
