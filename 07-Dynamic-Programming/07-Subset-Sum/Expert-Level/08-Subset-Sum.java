class SubsetSum {
    static boolean subsetSum(int[] numbers, int target) {
        boolean[][] dp = new boolean[numbers.length + 1][target + 1];

        for (int i = 0; i <= numbers.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= numbers.length; i++) {
            for (int sum = 1; sum <= target; sum++) {
                dp[i][sum] = dp[i - 1][sum];

                if (numbers[i - 1] <= sum) {
                    dp[i][sum] = dp[i][sum]
                            || dp[i - 1][sum - numbers[i - 1]];
                }
            }
        }

        return dp[numbers.length][target];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 34, 4, 12, 5, 2};
        int target = 9;

        System.out.println("Subset exists = "
                + subsetSum(numbers, target));
    }
}
