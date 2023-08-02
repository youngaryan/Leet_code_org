
class Solution {
    public int guessNumber(int n) {
        int left = 1, right = n, mid = (left+right)/2, indicator;
        
        while(guess(mid) != 0){
            indicator = guess(mid);

            if(indicator == 1){
                right = mid;
            }else {
                left = mid;
            }
            mid = (left+right)/2;
        }

        return mid;
    }





    private int guess(int guess) {

        int t = 1;

        if (guess>t) {
            return 1;
        } else if(guess < t){
            return -1;
        }

        return 0;
    }
}