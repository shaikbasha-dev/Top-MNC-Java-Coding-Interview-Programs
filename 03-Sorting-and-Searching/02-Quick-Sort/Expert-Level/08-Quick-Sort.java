class QuickSort {
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        quickSort(a, 0, a.length - 1);

        System.out.print("Sorted Array = ");
        for (int x : a) System.out.print(x + " ");
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low >= high) return;
        int p = partition(a, low, high);
        quickSort(a, low, p - 1);
        quickSort(a, p + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high], i = low;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                int t = a[i]; a[i++] = a[j]; a[j] = t;
            }
        }
        int t = a[i]; a[i] = a[high]; a[high] = t;
        return i;
    }
}
