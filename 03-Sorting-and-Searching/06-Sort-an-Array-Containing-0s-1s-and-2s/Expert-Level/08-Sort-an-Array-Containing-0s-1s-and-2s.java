class SortAnArrayContaining0s1sAnd2s {
    public static void main(String[] args) {
        int[] a = {2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                int t = a[low]; a[low++] = a[mid]; a[mid++] = t;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int t = a[mid]; a[mid] = a[high]; a[high--] = t;
            }
        }

        System.out.print("Sorted Array = ");
        for (int x : a) System.out.print(x + " ");
    }
}
