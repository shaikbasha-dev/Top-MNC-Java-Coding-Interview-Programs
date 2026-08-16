class FindPairswithaGivenTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6};
        int target = 9;
        int arraySize = numbers.length;

        System.out.println("Pairs:");

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[j];
                int sum = firstNumber + secondNumber;

                if (sum == target) {
                    System.out.println("(" + firstNumber + ", " + secondNumber + ")");
                }
            }
        }
    }
}
