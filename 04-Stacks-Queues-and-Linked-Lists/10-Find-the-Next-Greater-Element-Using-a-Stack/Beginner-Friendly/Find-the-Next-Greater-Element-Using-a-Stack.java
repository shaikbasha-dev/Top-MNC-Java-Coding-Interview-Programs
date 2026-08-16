import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class NextGreaterElementUsingStack {
    static int[] nextGreater(int[] numbers) {
        int[] result = new int[numbers.length];
        Arrays.fill(result, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) stack.pop();
            if (!stack.isEmpty()) result[i] = stack.peek();
            stack.push(numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 2, 10, 8};
        System.out.println(Arrays.toString(nextGreater(numbers)));
    }
}
