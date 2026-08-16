class ReplaceEachElementwiththeGreatestElementtoItsRight {
    public static void main(String[] args) {
        int[] numbers = {17, 18, 5, 4, 6, 1};
        int greatestRight = -1;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNumber = numbers[i];
            numbers[i] = greatestRight;

            if (currentNumber > greatestRight) {
                greatestRight = currentNumber;
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
