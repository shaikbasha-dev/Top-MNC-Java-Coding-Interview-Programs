# 11 — Dry Run

## Complete Program

```java
public class SolveSudoku {
    static boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (isValid(board, row, col, digit)) {
                            board[row][col] = digit;

                            if (solve(board)) return true;

                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) return false;
            if (board[i][col] == digit) return false;

            int r = 3 * (row / 3) + i / 3;
            int c = 3 * (col / 3) + i % 3;
            if (board[r][c] == digit) return false;
        }
        return true;
    }

    static void print(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        if (solve(board)) print(board);
    }
}
```

## Dry Run — Step by Step

### Step 1 — Initial State

```text
Input: Standard partially filled 9×9 Sudoku
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
Completed valid Sudoku board
```
