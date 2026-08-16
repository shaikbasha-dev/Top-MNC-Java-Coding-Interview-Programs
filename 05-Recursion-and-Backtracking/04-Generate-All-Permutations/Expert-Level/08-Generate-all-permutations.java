import java.util.*;

class GenerateAllPermutations {
    static void generate(int[] numbers, int index) {
        if (index == numbers.length) {
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            swap(numbers, index, i);
            generate(numbers, index + 1);
            swap(numbers, index, i);
        }
    }

    static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        generate(new int[]{1, 2, 3}, 0);
    }
}
