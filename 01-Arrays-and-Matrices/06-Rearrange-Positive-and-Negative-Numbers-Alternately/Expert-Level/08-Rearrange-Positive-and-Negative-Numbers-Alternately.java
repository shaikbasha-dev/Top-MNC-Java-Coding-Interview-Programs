class RearrangePositiveandNegativeNumbersAlternately {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, -1, 4};
        int[] positives = new int[numbers.length];
        int[] negatives = new int[numbers.length];

        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : numbers) {
            if (number >= 0) {
                positives[positiveCount] = number;
                positiveCount++;
            } else {
                negatives[negativeCount] = number;
                negativeCount++;
            }
        }

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && positiveIndex < positiveCount) {
                numbers[i] = positives[positiveIndex];
                positiveIndex++;
            } else if (negativeIndex < negativeCount) {
                numbers[i] = negatives[negativeIndex];
                negativeIndex++;
            } else if (positiveIndex < positiveCount) {
                numbers[i] = positives[positiveIndex];
                positiveIndex++;
            }
        }

        System.out.print("Result = [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
