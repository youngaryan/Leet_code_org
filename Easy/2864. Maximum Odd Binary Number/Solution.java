class Solution {
    public String maximumOddBinaryNumber(String s) {
        int numS = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                numS++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numS - 1; i++) {
            stringBuilder.append("1");
        }

        for (int i = s.length() - numS - 1; i >= 0; i--) {
            stringBuilder.append('0');
        }

        stringBuilder.append('1');
        return stringBuilder.toString();
    }
}