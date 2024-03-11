class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] onesInRows = new int[grid.length];
        int[] onesInColumn = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    onesInRows[i]++;
                    onesInColumn[j]++;
                }
                if (grid[i][j] == 0) {
                    onesInRows[i]--;
                    onesInColumn[j]--;
                }
            }
        }

        int[][] result = new int[grid.length][grid[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = onesInRows[i] + onesInColumn[j];
            }
        }

        return result;
    }
}