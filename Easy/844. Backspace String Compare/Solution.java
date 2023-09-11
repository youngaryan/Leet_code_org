class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;

        while (i >= 0 && j >= 0) {
            if (s.charAt(i) == '#') {
                while (i > 0 && s.charAt(i - 1) == '#') {
                    i -= 2;
                }
                i -= 2;
                continue;
            }
            if (j > -1 && t.charAt(j) == '#') {
                while (t.charAt(j - 1) == '#') {
                    j -= 2;
                }
                j -= 2;
                continue;
            }

            if (s.charAt(i) != t.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }

        while (i > -1) {
            if (s.charAt(i) == '#') {
                while (i > 0 && s.charAt(i - 1) == '#') {
                    i -= 2;
                }
                i -= 2;
            } else {
                return false;
            }
        }

        while (j > -1) {
            if (t.charAt(j) == '#') {
                while (j > 0 && t.charAt(j - 1) == '#') {
                    j -= 2;
                }
                j -= 2;
            } else {
                return false;
            }
        }

        return true;

        // StringBuilder sList = new StringBuilder();
        // StringBuilder tList = new StringBuilder();
        // char temp;
        // int length;

        // for (int i = 0; i < s.length(); i++) {
        // temp = s.charAt(i);
        // if (temp == '#') {
        // length = sList.length();
        // if (length > 0) {
        // sList.deleteCharAt(length - 1);
        // }
        // } else {
        // sList.append(temp);
        // }
        // }

        // for (int i = 0; i < t.length(); i++) {
        // temp = t.charAt(i);
        // if (temp == '#') {
        // length = tList.length();
        // if (length > 0) {
        // tList.deleteCharAt(length - 1);
        // }
        // } else {
        // tList.append(temp);
        // }
        // }

        // return sList.toString().equals(tList.toString());

    }
}