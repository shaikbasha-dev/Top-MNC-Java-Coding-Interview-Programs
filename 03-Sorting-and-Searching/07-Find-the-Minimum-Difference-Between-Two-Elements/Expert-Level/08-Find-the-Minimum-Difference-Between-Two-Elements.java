import java.util.Arrays;

class FindMinimumDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 19, 18, 25};
        Arrays.sort(a);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            min = Math.min(min, a[i] - a[i - 1]);
        }

        System.out.println("Minimum Difference = " + min);
    }
}
