class FindtheMissingandRepeatingNumbers {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 2, 1, 1};
        int arraySize = numbers.length;

        int[] frequency = new int[arraySize + 1];

        for (int i = 0; i < arraySize; i++) {
            int currentNumber = numbers[i];
            frequency[currentNumber]++;
        }

        int missing = 0;
        int repeating = 0;

        for (int i = 1; i <= arraySize; i++) {
            if (frequency[i] == 0) {
                missing = i;
            }

            if (frequency[i] == 2) {
                repeating = i;
            }
        }

        System.out.println("Missing = " + missing);
        System.out.println("Repeating = " + repeating);
    }
}
