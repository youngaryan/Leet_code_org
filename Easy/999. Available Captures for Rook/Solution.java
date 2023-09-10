class Solution {
    public int numRookCaptures(char[][] board) {
        int result = 0;
        int[] rockIndex = new int[2];
        // the rock can have max 4 capture or min zero cap
        int nothDis = 9, southDis = 9, eastDis = 9, westDis = 9;
        boolean[] dir = new boolean[4];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    rockIndex[0] = i;
                    rockIndex[1] = j;
                    break;
                }
            }
        }

        // System.out.println(Arrays.toString(rockIndex));

        // first horisontal

        // west
        for (int i = 0; i < rockIndex[1]; i++) {
            if (board[rockIndex[0]][i] == 'p') {
                westDis = rockIndex[1] - i;
                dir[0] = true;
            }
            if (board[rockIndex[0]][i] == 'B' && westDis > rockIndex[1] - i) {
                dir[0] = false;
            }
        }

        // east
        for (int i = 7; i > rockIndex[1]; i--) {
            if (board[rockIndex[0]][i] == 'p') {
                eastDis = i - rockIndex[1];
                dir[1] = true;
            }
            if (board[rockIndex[0]][i] == 'B' && eastDis > i - rockIndex[1]) {
                dir[1] = false;
            }
        }

        // vertical

        // north
        for (int i = 0; i < rockIndex[0]; i++) {
            if (board[i][rockIndex[1]] == 'p') {
                nothDis = rockIndex[0] - i;
                dir[2] = true;
            }
            if (board[i][rockIndex[1]] == 'B' && nothDis > rockIndex[0] - i) {
                dir[2] = false;
            }
        }

        // south
        for (int i = 7; i > rockIndex[0]; i--) {
            if (board[i][rockIndex[1]] == 'p') {
                southDis = i - rockIndex[0];
                dir[3] = true;
            }
            if (board[i][rockIndex[1]] == 'B' && southDis > i - rockIndex[0]) {
                dir[3] = false;
            }
        }

        // System.out.println(Arrays.toString(dir));

        for (boolean b : dir) {
            if (b) {
                result++;
            }
        }

        return result;
    }
}