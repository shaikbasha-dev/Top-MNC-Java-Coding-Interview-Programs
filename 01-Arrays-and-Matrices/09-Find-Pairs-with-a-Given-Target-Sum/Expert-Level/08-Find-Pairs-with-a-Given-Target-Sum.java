import java.util.HashSet;
import java.util.Set;

class FindPairswithaGivenTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6};
        int target = 9;

        Set<Integer> seen = new HashSet<>();

        System.out.println("Pairs:");

        for (int number : numbers) {
            int requiredNumber = target - number;

            if (seen.contains(requiredNumber)) {
                System.out.println("(" + requiredNumber + ", " + number + ")");
            }

            seen.add(number);
        }
    }
}
