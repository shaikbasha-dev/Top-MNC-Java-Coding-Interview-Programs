import java.util.*;

class GridPaths {
    static void findPaths(int row, int col, int rows, int cols, String path) {
        if (row == rows - 1 && col == cols - 1) {
            System.out.println(path);
            return;
        }

        if (row < rows - 1) {
            findPaths(row + 1, col, rows, cols, path + "D");
        }

        if (col < cols - 1) {
            findPaths(row, col + 1, rows, cols, path + "R");
        }
    }

    public static void main(String[] args) {
        findPaths(0, 0, 2, 3, "");
    }
}
