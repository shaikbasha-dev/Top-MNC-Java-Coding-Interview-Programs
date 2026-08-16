import java.util.*;

class LongestIncreasingSubsequence {
    static int lis(int[] numbers) {
        if (numbers.length == 0) return 0;

        int[] dp = new int[numbers.length];
        Arrays.fill(dp, 1);

        int answer = 1;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LIS length = " + lis(numbers));
    }
}
