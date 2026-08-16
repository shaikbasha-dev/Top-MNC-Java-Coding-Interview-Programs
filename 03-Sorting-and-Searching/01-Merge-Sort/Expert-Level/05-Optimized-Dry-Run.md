# 05 — Optimized Dry Run

## Complete Expert-Level Program

```java
public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        sort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array = ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void sort(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(a, left, mid);
        sort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    private static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        while (i <= mid) temp[k++] = a[i++];
        while (j <= right) temp[k++] = a[j++];

        System.arraycopy(temp, 0, a, left, temp.length);
    }
}
```

## Expert Dry Run

1. Initialize the required pointers, boundaries or data structure.
2. Process the first important state.
3. Apply the algorithm's invariant.
4. Eliminate the portion that cannot contain the answer or maintain the required result.
5. Repeat until the search or processing range is complete.
6. Produce the final answer.

### Sample Result

```text
[3, 9, 10, 27, 38, 43, 82]
```

### What to Track in an Interview

Track the changing pointers, partition boundaries, heap contents or current result after every important operation. This demonstrates understanding rather than memorization.
