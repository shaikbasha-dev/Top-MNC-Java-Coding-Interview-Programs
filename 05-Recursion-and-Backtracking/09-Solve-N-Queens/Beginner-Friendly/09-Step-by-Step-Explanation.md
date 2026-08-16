# 09 — Step-by-Step Explanation

## Complete Program

```java
public class NQueens {
    static boolean solve(int[][] board, int row) {
        int n = board.length;

        if (row == n) return true;

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;

                if (solve(board, row + 1)) return true;

                board[row][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;

        for (int i = 0; i < row; i++)
            if (board[i][col] == 1) return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1) return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 1) return false;

        return true;
    }

    static void print(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        if (solve(board, 0)) print(board);
    }
}
```

## Step-by-Step Program Explanation

1. **Program setup:** Define the class and required helper methods.
2. **Input setup:** Create the sample data.
3. **Initial call:** Start recursion with the initial index, position or state.
4. **Base-case check:** Determine whether the complete solution has been formed.
5. **Make a choice:** Select one possible candidate.
6. **Recursive call:** Solve the remaining smaller problem.
7. **Backtrack:** Undo the choice so another branch can be explored.
8. **Repeat:** Continue until every required branch has been processed.
9. **Output:** Display or return the generated result.
