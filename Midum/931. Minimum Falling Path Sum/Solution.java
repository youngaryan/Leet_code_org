class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = 0, per = 0, localMin = matrix[0][0];

        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] < localMin) {
                localMin = matrix[0][i];
                per = i;
            }
        }
        min += localMin;

        for (int i = 1; i < matrix.length; i++) {
            localMin = Integer.MAX_VALUE;
            int perLoc = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < localMin && Math.abs(per - j) <= 1) {
                    localMin = matrix[i][j];
                    perLoc = j;
                }
            }
            per = perLoc;
            min += localMin;
        }

        return min;
    }
}