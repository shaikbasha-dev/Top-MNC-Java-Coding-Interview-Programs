class SpiralTraversalofaMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        System.out.print("Spiral Order = ");

        while (top <= bottom && left <= right) {

            for (int column = left; column <= right; column++) {
                System.out.print(matrix[top][column] + " ");
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int column = right; column >= left; column--) {
                    System.out.print(matrix[bottom][column] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
    }
}
