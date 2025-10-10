class Solution {
    public static boolean isValid(char[][] board, int row, int col, char num) {
        //check row
        //int n=board.length;
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }

        // check col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }

        //check 3x3 grid
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    public static boolean solve(char[][] board, int row, int col) {
         // base case: board solved
        if (row == 9) return true;

        // move to next row when col reaches 9
        if (col == 9) return solve(board, row + 1, 0);

        // skip filled cells
        if (board[row][col] != '.') {
            return solve(board, row, col + 1);
        }
        for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    if (solve(board, row, col + 1))
                        return true;
                    board[row][col] = '.'; // backtrack
                }
            }
            return false;
        }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}