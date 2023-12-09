class Solution {
    public double largestTriangleArea(int[][] points) {
        double max = -1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                for (int j2 = j+1; j2 < points.length; j2++) {
                   
                    if (max < findArea( points[i][0],  points[i][1], points[j][0],points[j][1], points[j2][0], points[j2][1])) {
                        max = findArea( points[i][0],  points[i][1], points[j][0],points[j][1], points[j2][0], points[j2][1]);
                    }                
                }
            }
        }
        return max;
    }

    private double findArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs((x1) * (y2 - y3) + (x2) * (y3 - y1) + (x3) * (y1 - y2));
        return area;
    }
}