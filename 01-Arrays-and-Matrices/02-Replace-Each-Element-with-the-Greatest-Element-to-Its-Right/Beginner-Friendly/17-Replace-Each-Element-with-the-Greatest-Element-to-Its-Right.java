class ReplaceEachElementwiththeGreatestElementtoItsRight {
    public static void main(String[] args) {
        int[] numbers = {17, 18, 5, 4, 6, 1};
        int arraySize = numbers.length;

        for (int i = 0; i < arraySize - 1; i++) {
            int greatestRight = numbers[i + 1];

            for (int j = i + 2; j < arraySize; j++) {
                int currentNumber = numbers[j];

                if (currentNumber > greatestRight) {
                    greatestRight = currentNumber;
                }
            }

            numbers[i] = greatestRight;
        }

        numbers[arraySize - 1] = -1;

        System.out.print("Result = [");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(numbers[i]);
            if (i < arraySize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
