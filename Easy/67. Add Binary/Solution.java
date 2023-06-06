public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        StringBuilder aRE = new StringBuilder(a);
        StringBuilder bRE = new StringBuilder(b);

        a = aRE.reverse().toString();
        b = bRE.reverse().toString();

        int i=0,j=0;

        while (a.length()>i || b.length()>j){
            int temp1 = i < a.length() ? a.charAt(i) - '0' : 0;
            int temp2 = j < b.length() ? b.charAt(j) - '0' : 0;
            int result = temp2+temp1+carry;
            if (result == 0){ res.append(0);carry=0;}
            else if (result == 1) {res.append(1);carry=0;}
            else if (result == 2) {
                res.append(0);
                carry = 1;
            } else if (result == 3) {
                res.append(1);
                carry = 1;
            }
            i++;
            j++;
        }

        if (carry>0) {res.append(1);}
        return res.reverse().toString();
    }
}