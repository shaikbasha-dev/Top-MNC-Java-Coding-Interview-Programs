class FindMedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] first = {1, 3};
        int[] second = {2};

        int[] merged = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }

        double median;

        if (merged.length % 2 == 1) {
            median = merged[merged.length / 2];
        } else {
            int middle = merged.length / 2;
            median = (merged[middle - 1] + merged[middle]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}
