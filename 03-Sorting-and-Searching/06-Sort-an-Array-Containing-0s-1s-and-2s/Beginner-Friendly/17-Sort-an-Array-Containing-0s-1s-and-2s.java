class SortAnArrayContaining0s1sAnd2s {
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
