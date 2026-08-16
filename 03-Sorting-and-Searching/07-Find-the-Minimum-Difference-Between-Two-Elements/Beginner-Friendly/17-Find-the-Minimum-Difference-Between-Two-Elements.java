import java.util.Arrays;

class FindMinimumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 19, 18, 25};

        Arrays.sort(numbers);

        int minimumDifference = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            int difference = numbers[i] - numbers[i - 1];

            if (difference < minimumDifference) {
                minimumDifference = difference;
            }
        }

        System.out.println("Minimum Difference = " + minimumDifference);
    }
}
