public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        if (coordinates.length<3)return true;
        if ((coordinates[1][0]-coordinates[0][0]) != 0) {
            double a = (double) (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
            double b = coordinates[0][1] - a * coordinates[0][0];

            System.out.println("a "+a);
            System.out.println(b);
            for (int i = 2; i < coordinates.length; i++) {
                double re = a * coordinates[i][0] + b;
                if (coordinates[i][1] != re) return false;
            }
        }else{
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[0][i] ) return false;
            }
        }
        return true;
    }
}
