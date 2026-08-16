import java.util.Arrays;

class FindTheKthLargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(numbers);

        int answer = numbers[numbers.length - k];

        System.out.println("Kth Largest Element = " + answer);
    }
}
