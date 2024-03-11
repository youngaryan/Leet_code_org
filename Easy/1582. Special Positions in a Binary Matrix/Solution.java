
class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0, temp;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    temp = 0;
                    // checking column
                    for (int j2 = 0; j2 < mat.length; j2++) {
                        temp += mat[j2][j];
                    }

                    for (int k = 0; k < mat[0].length; k++) {
                        temp += mat[i][k];

                    }

                    if (temp == 2) {
                        result++;
                    }

                }
            }
        }
        return result;
    }
}
/*
 * System.out.println(new Solution().numSpecial(new int[][] {
 * { 1, 0, 0 },
 * { 0, 1, 0 },
 * { 1, 0, 0 }
 * 
 * }));
 */