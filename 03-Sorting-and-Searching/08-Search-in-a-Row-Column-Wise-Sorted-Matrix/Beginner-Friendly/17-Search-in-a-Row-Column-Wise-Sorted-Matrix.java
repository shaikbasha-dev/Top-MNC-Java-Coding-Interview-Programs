class SearchInARowColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int target = 29;
        search(matrix, target);
    }

    static void search(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                System.out.println("Target Found at Row = " + row +
                                   ", Column = " + column);
                return;
            }

            if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }

        System.out.println("Target Not Found");
    }
}
