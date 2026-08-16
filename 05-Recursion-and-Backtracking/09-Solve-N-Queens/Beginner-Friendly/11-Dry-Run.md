# 11 — Dry Run

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

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: n = 4
```

### Step 2 — First Recursive Call

The algorithm starts with an empty or initial state.

### Step 3 — Make the First Choice

One candidate is selected and added to the current state.

### Step 4 — Recursive Exploration

The method calls itself with the remaining problem.

### Step 5 — Base Case

When the required state is complete, the solution is recorded or displayed.

### Step 6 — Backtrack

The last choice is removed or restored.

### Step 7 — Try the Next Choice

The next candidate is selected and the same process repeats.

### Final Result

```text
One valid board with 4 queens and no attacks
```
