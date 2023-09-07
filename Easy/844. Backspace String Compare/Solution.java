class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sList = new StringBuilder();
        StringBuilder tList = new StringBuilder();
        char temp;
        int length;

        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp == '#') {
                length = sList.length();
                if (length > 0) {
                    sList.deleteCharAt(length - 1);
                }
            } else {
                sList.append(temp);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            temp = t.charAt(i);
            if (temp == '#') {
                length = tList.length();
                if (length > 0) {
                    tList.deleteCharAt(length - 1);
                }
            } else {
                tList.append(temp);
            }
        }

        return sList.toString().equals(tList.toString());
    }
}