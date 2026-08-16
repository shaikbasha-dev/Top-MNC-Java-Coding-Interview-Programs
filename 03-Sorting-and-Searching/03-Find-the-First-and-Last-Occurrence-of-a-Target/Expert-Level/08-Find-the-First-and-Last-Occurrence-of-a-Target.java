class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] a = {2, 4, 4, 4, 7, 9};
        int target = 4;
        System.out.println("First Occurrence = " + boundary(a, target, true));
        System.out.println("Last Occurrence = " + boundary(a, target, false));
    }

    private static int boundary(int[] a, int target, boolean first) {
        int low = 0, high = a.length - 1, answer = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                answer = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } else if (a[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return answer;
    }
}
