class FindtheEquilibriumIndex {
    public static void main(String[] args) {
        int[] numbers = {-7, 1, 5, 2, -4, 3, 0};
        int arraySize = numbers.length;

        int totalSum = 0;

        for (int i = 0; i < arraySize; i++) {
            totalSum = totalSum + numbers[i];
        }

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < arraySize; i++) {
            int currentNumber = numbers[i];
            int rightSum = totalSum - leftSum - currentNumber;

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum = leftSum + currentNumber;
        }

        System.out.println("Equilibrium Index = " + equilibriumIndex);
    }
}
