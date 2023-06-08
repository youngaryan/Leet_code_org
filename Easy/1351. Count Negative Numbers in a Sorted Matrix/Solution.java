
public class Solution {
    public int countNegatives(int[][] grid) {
        int max = 0;
        int i = 0;
        int j = grid[i].length-1;

        while (i<grid.length && j>=0){
            if (grid[i][j] < 0){
                max++;j--;
                if (j < 0 && i<grid.length-1){i++;j = grid[i].length-1;}
            } else {
                j = grid[i].length-1;
                i++;
            }
        }
        return max;
    }
}
