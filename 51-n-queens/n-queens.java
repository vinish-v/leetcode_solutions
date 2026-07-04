import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        // Initialize an empty chessboard filled with '.'
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(0, board, results, n);
        return results;
    }

    private void backtrack(int row, char[][] board, List<List<String>> results, int n) {
        // Base case: If all queens are successfully placed, build the result
        if (row == n) {
            results.add(constructBoard(board));
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';          // Place queen
                backtrack(row + 1, board, results, n); // Move to the next row
                board[row][col] = '.';          // Backtrack (remove queen)
            }
        }
    }

    // Helper method that coordinates your three directional check methods
    private boolean isSafe(int row, int col, char[][] board, int n) {
        return isColumnSafe(row, col, board) && 
               isUpperLeftDiagonalSafe(row, col, board) && 
               isUpperRightDiagonalSafe(row, col, board);
    }

    // Direction 1: Check straight up in the same column
    private boolean isColumnSafe(int row, int col, char[][] board) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Direction 2: Check diagonally up and to the left
    private boolean isUpperLeftDiagonalSafe(int row, int col, char[][] board) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // Direction 3: Check diagonally up and to the right
    private boolean isUpperRightDiagonalSafe(int row, int col, char[][] board) {
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

  
    private List<String> constructBoard(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}