class SearchInARowColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] m = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target = 29;
        int r = 0, c = m[0].length - 1;

        while (r < m.length && c >= 0) {
            if (m[r][c] == target) {
                System.out.println("Target Found at Row = " + r + ", Column = " + c);
                return;
            }
            if (m[r][c] > target) c--;
            else r++;
        }
        System.out.println("Target Not Found");
    }
}
