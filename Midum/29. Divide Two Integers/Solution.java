public class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == 0)return 0;
        if (divisor ==1)return dividend;
        if(dividend == divisor)return 1;
        if(dividend == -divisor)return -1;
        if(dividend == Integer.MIN_VALUE && divisor == -1)return Integer.MAX_VALUE;


        int sign = 1;

        if(dividend< 0 )sign =-sign;
        if(divisor < 0)sign = -sign;
       
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            result++;
        }

        return sign * result;
    }
}
