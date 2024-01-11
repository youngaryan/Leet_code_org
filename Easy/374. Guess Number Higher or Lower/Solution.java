
class Solution {
    public int guessNumber(int n) {
        int left = 0, right = n;

        while (left <= right) {
            int mid = left + (right - left) /2;
            int result = guess(mid);


            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    private int guess(int guess) {

        int t = 1702766719;

        if (guess > t) {
            return -1;
        } else if (guess < t) {
            return 1;
        }

        return 0;
    }
}