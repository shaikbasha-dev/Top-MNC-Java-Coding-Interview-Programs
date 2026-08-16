class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 4, 4, 7, 9};
        int target = 4;

        int first = findFirst(numbers, target);
        int last = findLast(numbers, target);

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
    }

    static int findFirst(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int answer = -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (numbers[middle] == target) {
                answer = middle;
                high = middle - 1;
            } else if (numbers[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return answer;
    }

    static int findLast(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int answer = -1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (numbers[middle] == target) {
                answer = middle;
                low = middle + 1;
            } else if (numbers[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return answer;
    }
}
