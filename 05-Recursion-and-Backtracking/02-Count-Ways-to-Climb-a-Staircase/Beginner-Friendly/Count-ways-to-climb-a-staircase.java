class ClimbingStairs {
    static int countWays(int n) {
        if (n <= 1) return 1;
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Ways = " + countWays(n));
    }
}
