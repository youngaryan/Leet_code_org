class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] hold; // rows
        int[] hold1; // columns

        for (int i = 0; i < 9; i++) {
            hold = new int[13];
            hold1 = new int[13];

            for (int j = 0; j < 9; j++) {
                // System.out.println(i + " " + j);
                // System.out.println(board[j][i]);
                // System.out.println("//////////////");
                if ((board[i][j] != '.' && hold[board[i][j]
                        - '.'] != 0) || (board[j][i] != '.' && hold1[board[j][i] - '.'] != 0)) {
                    // System.out.println((board[i][j] != '.' && hold[board[i][j]
                    // - '0'] != 0));
                    // System.out.println((board[j][i] != '.' && hold1[board[j][i] - '0'] != 0));
                    // System.out.println(i);
                    // System.out.println(j);
                    // System.out.println(Arrays.toString(hold1));
                    return false;
                }
                hold[board[i][j] - '.'] = -1;
                hold1[board[j][i] - '.'] = -1;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidSubBox(char[][] board, int startRow, int startCol) {
        boolean[] seen = new boolean[13];
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                int num = board[i][j] - '.';
                if (num != 0) {
                    if (seen[num - 1]) {
                        return false; // Duplicate found
                    }
                    seen[num - 1] = true;
                }
            }
        }
        return true;
    }
}