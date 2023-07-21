public class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == 0 ) return 0;
        if(dividend ==divisor)return 1;

        

        int sign = 1;
        int exe = 0 ;
        if (dividend < 0 && dividend > -2147483648){dividend*=-1; sign *= -1;
        }else if(dividend <= -2147483648){dividend = 2147483647;  sign*=-1;exe+=sign;}
        if (divisor < 0) {divisor*=-1; sign *= -1;}
        if(divisor == 1) return sign*dividend + exe;

        int count = 0;
        

        while(dividend > 0){
            dividend -= divisor;
            if(dividend>0){count++;}
            
        }

        return sign*count + exe;
    }
}
