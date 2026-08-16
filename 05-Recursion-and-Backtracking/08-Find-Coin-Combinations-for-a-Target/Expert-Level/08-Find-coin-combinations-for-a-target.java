import java.util.*;

class CoinCombinations {
    static void find(int[] coins, int index, int target, List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }

        if (target < 0 || index == coins.length) return;

        current.add(coins[index]);
        find(coins, index, target - coins[index], current);

        current.remove(current.size() - 1);
        find(coins, index + 1, target, current);
    }

    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        find(coins, 0, 7, new ArrayList<>());
    }
}
