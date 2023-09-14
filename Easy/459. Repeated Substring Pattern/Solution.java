class Solution {
    public boolean repeatedSubstringPattern(String s) {

        if (s.length() < 2)
            return false;
        StringBuilder stringBuilder = new StringBuilder();
        int j = 1;

        while (s.length() > j) {
            if (s.length() % j == 0) {
                stringBuilder.setLength(0);
                for (int i = 0; i < j; i++) {
                    stringBuilder.append(s.charAt(i));
                }

                String temp = stringBuilder.toString();

                while (stringBuilder.length() != s.length()) {
                    stringBuilder.append(temp);
                }
                if (stringBuilder.toString().equals(s.toString()))
                    return true;
            }
            j++;
        }
        return false;
    }
}