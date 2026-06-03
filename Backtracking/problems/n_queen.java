package problems;

public class n_queen {

    // public static void n_queen(char board[][], int row) {

    // // Base case
    // if (row == board.length) {
    // printboard(board);
    // return;
    // }

    // // work
    // // column loop
    // for (int j = 0; j < board.length; j++) {
    // board[row][j] = 'Q';
    // n_queen(board, row + 1); // recursion
    // board[row][j] = 'X';
    // }

    // }

    public static void printboard(char board[][]) {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // *vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void n_queen(char board[][], int row) {
        // * Base Case
        if (row == board.length) {
            printboard(board);
            return;
        }

        // * Work
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                n_queen(board, row + 1);
                board[row][col] = 'X';
            }
            ;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        n_queen(board, 0);
    }
}