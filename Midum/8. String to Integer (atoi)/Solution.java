class Solution {
    public int myAtoi(String s) {

        // resulting integer in stringBuilder format
        StringBuilder rString = new StringBuilder();
        int j = 0;
        int result;

        // read and append the char as long as it's digit
        boolean digit = true;
        boolean ZeroBack = true;

        // getting rid of the leading white spaces
        s = s.trim();

        // check if the string is empty

        if (s.length() < 1)
            return 0;

        // dealing with the sign
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
            j++;
        } else if (s.charAt(0) == '+') {
            j++;
        }

        while (digit && j < s.length()) {
            while (ZeroBack && j < s.length()) {
                if (s.charAt(j) != 0) {
                    ZeroBack = false;
                    break;
                }
                j++;
            }
            if (s.charAt(j) >= 48 && s.charAt(j) < 58) {
                rString.append(s.charAt(j));
                j++;
            } else {
                digit = false;
            }
        }

        // converting to int && check the bounderies

        try {
            result = rString.length() > 0 ? Integer.parseInt(rString.toString()) : 0;
        } catch (Exception e) {
            if (sign == -1) {
                result = Integer.MIN_VALUE;
            } else {
                result = Integer.MAX_VALUE;
            }
        }

        return result * sign;
    }
}
