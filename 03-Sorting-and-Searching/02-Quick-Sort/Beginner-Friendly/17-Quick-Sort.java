class QuickSort {
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
