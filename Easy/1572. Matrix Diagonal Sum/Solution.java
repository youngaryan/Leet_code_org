public class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length == 1)return mat[0][0];

        int start = 0;
        int end = mat.length-1;
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                
            }
        }
        System.out.println(sum);
        if (mat.length%2 != 0){
            sum-=mat[end/2][end/2];
        }
        System.out.println(sum);
        return sum;
    }
}
