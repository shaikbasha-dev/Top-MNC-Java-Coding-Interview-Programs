class FindtheEquilibriumIndex {
    public static void main(String[] args) {
        int[] numbers = {-7,1,5,2,-4,3,0};
        int totalSum = 0;
        for (int number : numbers) totalSum += number;

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            int rightSum = totalSum - leftSum - numbers[i];
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
            leftSum += numbers[i];
        }

        System.out.println("Equilibrium Index = " + equilibriumIndex);
    }
}
