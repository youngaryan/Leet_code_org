public class Solution{
    public int divide(int dividend, int divisor) {

        int postive = 1;
        if(dividend<0){postive = -postive; dividend = -dividend;}
        if(divisor<0) {postive = -postive; divisor = -divisor;}

        
        if(dividend == 0)return 0;
        if(divisor == 1) return dividend*postive;
        if(dividend == divisor) return 1;

        int res = 0;
        while(dividend > divisor){
            dividend-=divisor;
            res++;
        }

        return postive *res;
    }
}