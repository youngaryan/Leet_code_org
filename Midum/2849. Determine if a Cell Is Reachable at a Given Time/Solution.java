class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int diff = (calculateDistance(sx, sy, fx, fy));
        if (diff == 0 && t == 1) {
            return false;
        }
        return t >= diff;
    }

    private int calculateDistance(int x1, int y1, int x2, int y2) {
        return (int) (Math.max(Math.abs(x2 - x1), Math.abs(y2 - y1)));
    }
}