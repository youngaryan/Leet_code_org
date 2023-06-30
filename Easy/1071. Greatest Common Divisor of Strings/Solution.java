public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcd(str1.length(),str2.length());


        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str2.charAt(i%gcd)){
                return "";
            }
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i%gcd) )return "";
        }

        return str2.substring(0,gcd);
    }

    private static int gcd(int x, int y) {
        {
            int r , a, b;
            a = Math.max(x, y);
            b = Math.min(x, y);
            r = b;
            while (a % b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return r;
        }
    }
}