class FindtheMissingandRepeatingNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 2, 1, 1};
        int n = numbers.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int repeating = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int number : numbers) {
                if (number == i) {
                    count++;
                }
            }

            if (count == 2) {
                repeating = i;
                break;
            }
        }

        int missing = expectedSum - (actualSum - repeating);

        System.out.println("Missing = " + missing);
        System.out.println("Repeating = " + repeating);
    }
}
