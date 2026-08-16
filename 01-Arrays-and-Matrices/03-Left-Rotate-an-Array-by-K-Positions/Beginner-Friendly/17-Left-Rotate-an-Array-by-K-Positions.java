class LeftRotateanArraybyKPositions {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int arraySize = numbers.length;

        k = k % arraySize;

        int[] rotatedArray = new int[arraySize];
        int newIndex = 0;

        for (int i = k; i < arraySize; i++) {
            rotatedArray[newIndex] = numbers[i];
            newIndex++;
        }

        for (int i = 0; i < k; i++) {
            rotatedArray[newIndex] = numbers[i];
            newIndex++;
        }

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(rotatedArray[i]);
            if (i < arraySize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
