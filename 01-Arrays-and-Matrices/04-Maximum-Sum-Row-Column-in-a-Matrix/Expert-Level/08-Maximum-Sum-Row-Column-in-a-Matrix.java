class MaximumSumRowColumninaMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
        int rows = matrix.length;
        int columns = matrix[0].length;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) rowSum += matrix[i][j];
            maximumSum = Math.max(maximumSum, rowSum);
        }

        for (int j = 0; j < columns; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) columnSum += matrix[i][j];
            maximumSum = Math.max(maximumSum, columnSum);
        }

        System.out.println("Maximum Sum = " + maximumSum);
    }
}
