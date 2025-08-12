package Recursion;

// NQueen problem
import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static boolean canFill(int row, int col, int n, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal) {
        if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[(n - 1) + (col - row)] == 0) {
            return true;
        }
        return false;
    }

    public static void nqueens(int col, int n, String[][] board, List<List<String>> ans, int[] leftRow,
            int[] lowerDiagonal,
            int[] upperDiagonal) {

        if (col == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder rowStr = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    rowStr.append(board[i][j] == null ? "." : board[i][j]);
                }
                solution.add(rowStr.toString());
            }
            ans.add(solution); 
            return;
        }

        for (int row = 0; row < n; row++) {
            if (canFill(row, col, n, leftRow, lowerDiagonal, upperDiagonal) == true) {
                board[row][col] = "Q";
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[(n - 1) + (col - row)] = 1;
                nqueens(col + 1, n, board, ans, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = null;
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[(n - 1) + (col - row)] = 0;
            }

        }

    }

    public static void main(String[] args) {
        int n = 4;
        String[][] board = new String[n][n];
        int[] leftRow = new int[n]; // To check left
        int[] lowerDiagonal = new int[2 * n - 1]; // To check the lower diagonal
        int[] upperDiagonal = new int[2 * n - 1]; // To check the upper diagonal
        List<List<String>> ans = new ArrayList<>();
        nqueens(0, n, board, ans, leftRow, lowerDiagonal, upperDiagonal);
        System.out.println(ans);

    }
}
