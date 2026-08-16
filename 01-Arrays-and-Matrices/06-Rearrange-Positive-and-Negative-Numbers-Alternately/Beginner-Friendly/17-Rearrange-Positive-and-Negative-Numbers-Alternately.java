class RearrangePositiveandNegativeNumbersAlternately {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -4, -1, 4};
        int arraySize = numbers.length;

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        int[] positives = new int[positiveCount];
        int[] negatives = new int[negativeCount];

        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < arraySize; i++) {
            if (numbers[i] >= 0) {
                positives[positiveIndex] = numbers[i];
                positiveIndex++;
            } else {
                negatives[negativeIndex] = numbers[i];
                negativeIndex++;
            }
        }

        int positivePosition = 0;
        int negativePosition = 0;

        for (int i = 0; i < arraySize; i++) {
            if (positivePosition < positiveCount && negativePosition < negativeCount) {
                if (i % 2 == 0) {
                    numbers[i] = positives[positivePosition];
                    positivePosition++;
                } else {
                    numbers[i] = negatives[negativePosition];
                    negativePosition++;
                }
            } else if (positivePosition < positiveCount) {
                numbers[i] = positives[positivePosition];
                positivePosition++;
            } else {
                numbers[i] = negatives[negativePosition];
                negativePosition++;
            }
        }

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
