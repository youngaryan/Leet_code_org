class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = -1;
        int[] firstSide = new int[2], secondSide = new int[2], thirdSide = new int[2];
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                for (int j2 = j+1; j2 < points.length; j2++) {
                    firstSide[0] = points[i][0];
                    firstSide[1] = points[i][1];
                    secondSide[0] = points[j][0];
                    secondSide[1] = points[j][1];
                    thirdSide[0] = points[j2][0];
                    thirdSide[1] = points[j2][1];
                    if (max < findArea(firstSide, secondSide, thirdSide)) {
                        max = findArea(firstSide, secondSide, thirdSide);
                    }                
                }
            }
        }
        return max;
    }

    private double findArea(int[] firstSide, int[] secondSide, int[] thirdSide) {
        double area = 0.5 * Math.abs((firstSide[0]) * (secondSide[1] - thirdSide[1])
                + secondSide[0] * (thirdSide[1] - firstSide[1]) + thirdSide[0] * (firstSide[1] - secondSide[1]));
        return area;
    }
}