class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Target Index = " + search(a, 0));
    }

    private static int search(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == target) return m;

            if (a[l] <= a[m]) {
                if (a[l] <= target && target < a[m]) r = m - 1;
                else l = m + 1;
            } else {
                if (a[m] < target && target <= a[r]) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
    }
}
