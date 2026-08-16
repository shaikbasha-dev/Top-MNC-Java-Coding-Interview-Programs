class LeftRotateanArraybyKPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int arraySize = numbers.length;
        k = k % arraySize;

        reverse(numbers, 0, k - 1);
        reverse(numbers, k, arraySize - 1);
        reverse(numbers, 0, arraySize - 1);

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i]);
            if (i < arraySize - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temporary = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temporary;
            start++;
            end--;
        }
    }
}
