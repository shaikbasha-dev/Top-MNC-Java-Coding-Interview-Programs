class MergeSort {
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
