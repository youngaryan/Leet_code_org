public class Solution {
    public String convertToBase7(int num) {
        //100
        //0,7,49,343
        if (num == 0)return "0";
        if (num<7)return Integer.toString(num);

        boolean negative = false;

        if (num<0){num = num*-1; negative = true;}

        while (num!=0){
            int mod = num%7;
        }
        return null;
    }
}
