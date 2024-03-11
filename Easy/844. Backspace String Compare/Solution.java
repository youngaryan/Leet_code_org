class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1, backCount;

        while (i >= 0 || j >= 0) {
            if (s.charAt(i) == '#' || t.charAt(j) == '#') {
                if (s.charAt(i) == '#') {
                    backCount = 2;
                    while (backCount > 0) {
                        i--;
                        backCount--;
                        if (s.charAt(i) == '#') {
                            backCount += 2;
                        }
                    }
                }

                if (t.charAt(j) == '#') {
                    backCount = 2;
                    while (backCount > 0) {
                        j--;
                        backCount--;
                        if (t.charAt(j) == '#') {
                            backCount += 2;
                        }
                    }
                }
            } else {

                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                } else {
                    i--;
                    j--;
                }

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