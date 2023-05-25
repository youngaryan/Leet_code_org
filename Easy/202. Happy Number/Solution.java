public class Solution {
    public boolean isHappy(int n) {
        if (n == 1)return true;
        int temp = n;
        int count = 0 ;
        while (count <8){
            temp = parser(temp);
            count++;
            if (temp == 1) return true;
        }
        return false;
    }

    int parser(int x){
        int temp;
        int sqr;
        int r = 0;
        while (x!=0){
            temp = x%10;
            sqr = temp*temp;
            r+=sqr;
            x/=10;
        }
        return r;
    }
}
