class Solution {
    public int[][] transpose(int[][] matrix) {
        int length = matrix.length, limit;
        if (matrix.length == 0) {
            return null;
        }
        limit = matrix[0].length;

        int[][] transposed = new int[limit][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < limit; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}