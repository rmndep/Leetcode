class Solution {
    int count=0;
    public int totalNQueens(int n) {
        
       char[][] board=new char[n][n];
       for(int i=0;i<n;i++){
        Arrays.fill(board[i],'.');
       }
       generate(board,0);
       return count;
    }
     void generate(char[][] board, int row) {
        if (row == board.length) {
            count++;  // one valid arrangement found
            return;
        }

        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';  // place queen
                generate(board, row + 1);  // recurse
                board[row][col] = '.';  // backtrack
            }
        }
    }
    boolean isSafe(char[][] board, int row, int col) {
        // vertical check
        for(int i = row - 1; i >= 0; i--) {
            if(board[i][col] == 'Q') return false;
        }

        // left diagonal check
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }

        // right diagonal check
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }
}
