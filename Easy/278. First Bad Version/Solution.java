public class Solution {
    public int firstBadVersion(int n) {
        int left = 0, right = n, mid = (right/2);

        while (left<right){

            if (isBadVersion(mid))
                right = mid;
            else
                left = mid+1;

            mid = (left/2)+(right/2);
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return mid >= 1702766719;
    }
}
