class Solution {
    public String replaceDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < s.length(); i += 2) {
            stringBuilder.append(s.charAt(i - 1));

            stringBuilder.append(shift(s.charAt(i - 1), s.charAt(i)));
        }

        if (s.length() % 2 != 0) {
            stringBuilder.append(s.charAt(s.length() - 1));
        }

        return stringBuilder.toString();
    }

    private char shift(char charAt, char charAt2) {

        return (char) (charAt + charAt2 - '0');
    }
}