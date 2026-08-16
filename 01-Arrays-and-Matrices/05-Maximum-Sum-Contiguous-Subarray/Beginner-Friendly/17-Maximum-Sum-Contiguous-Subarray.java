class MaximumSumContiguousSubarray {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arraySize = numbers.length;

        int currentSum = numbers[0];
        int maximumSum = numbers[0];

        for (int i = 1; i < arraySize; i++) {
            int currentNumber = numbers[i];
            int newSum = currentSum + currentNumber;

            if (currentNumber > newSum) {
                currentSum = currentNumber;
            } else {
                currentSum = newSum;
            }

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }

        System.out.println("Maximum Sum = " + maximumSum);
    }
}
