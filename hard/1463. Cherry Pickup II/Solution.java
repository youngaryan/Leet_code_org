class Solution {
    Integer[][][] matrix;

    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        matrix = new Integer[rows + 1][cols + 1][cols + 1];
        return dfs(0, 0, cols - 1, grid);
    }

    private int dfs(int r, int c1, int c2, int[][] grid) {

        if (c1 == c2 || c1 < 0 || c2 < 0 || c1 >= grid[0].length || c2 >= grid[0].length) {
            return 0;
        }

        if (r == grid.length) {
            return 0;
        }
        if (matrix[r][c1][c2] != null) {
            return matrix[r][c1][c2];
        }

        int result = 0; 
        result += grid[r][c1];
        result += grid[r][c2];
        int max = 0;
        for (int i = c1 - 1; i <= c1 + 1; i++) {
            for (int j = c2 - 1; j <= c2 + 1; j++) {
                if (i < j) {
                    max = Math.max(max, dfs(r + 1, i, j, grid));
                }
            }
        }

        result += max;
        return matrix[r][c1][c2] = result;
    }

    // Input: grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
    // Output:24
}

/*
 * class Solution {
 * 
 * Integer memo[][][];
 * 
 * public int cherryPickup(int[][] grid) {
 * int rows = grid.length;
 * int cols = grid[0].length;
 * memo = new Integer[rows+1][cols+1][cols+1];
 * return helper(grid, 0, 0, cols-1);
 * }
 * 
 * public int helper(int[][] grid, int currRow, int robotACol, int robotBCol) {
 * 
 * if(robotACol < 0 || robotBCol < 0 || robotACol >= grid[0].length || robotBCol
 * >= grid[0].length) return 0;
 * 
 * if(currRow == grid.length) return 0;
 * 
 * if(memo[currRow][robotACol][robotBCol] != null)
 * return memo[currRow][robotACol][robotBCol];
 * 
 * int result = 0;
 * result += grid[currRow][robotACol];
 * result += grid[currRow][robotBCol];
 * 
 * int max = 0;
 * for(int x=robotACol-1;x<=robotACol+1;x++) {
 * for(int y=robotBCol-1;y<=robotBCol+1;y++) {
 * if(x < y) { // they should not cross
 * max = Math.max(max, helper(grid, currRow+1, x, y));
 * }
 * }
 * }
 * 
 * result += max;
 * return memo[currRow][robotACol][robotBCol] = result;
 * }
 * }
 */