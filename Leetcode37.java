class Solution {

    public static boolean isSafe(char b[][], int r, int c, char d) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (b[i][c] == d) {
                return false;
            }
        }

        // row
        for (int i = 0; i <= 8; i++) {
            if (b[r][i] == d) {
                return false;
            }
        }

        // grid
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (b[i][j] == d) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokoSolver(char b[][], int r, int c) {
        // base case
        if (r == 9) {
            return true;
        }
        // recursion
        int nextr = r, nextc = c + 1;
        if (c + 1 == 9) {
            nextr = r + 1;
            nextc = 0;
        }

        if (b[r][c] != '.') {
            return sudokoSolver(b, nextr, nextc);
        }

        for (char d = '1'; d <= '9'; d++) {
            if (isSafe(b, r, c, d)) {
                b[r][c] = d;
                if (sudokoSolver(b, nextr, nextc)) {
                    return true;
                }
                b[r][c] = '.';
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {

        sudokoSolver(board, 0, 0);

    }

    // public static void main(String[] args) {
    //     // char[][] board = {
    //     //         { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
    //     //         { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
    //     //         { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
    //     //         { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
    //     //         { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
    //     //         { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
    //     //         { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
    //     //         { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
    //     //         { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    //     // };

    //     solveSudoku(board);

    //     // // Print the solved board
    //     // for (int i = 0; i < 9; i++) {
    //     //     for (int j = 0; j < 9; j++) {
    //     //         System.out.print(board[i][j] + " ");
    //     //     }
    //     //     System.out.println();
    //     // }
    // }
}