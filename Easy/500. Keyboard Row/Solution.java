import java.util.HashSet;

class Solution {
    public String[] findWords(String[] words) {

        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        HashSet<Integer> integers = new HashSet<>();

        int index = -1, temp, k = 0;

        String string;

        for (int i = 0; i < words.length; i++) {
            string = words[i].toLowerCase();
            if (firstRow.indexOf(string.charAt(0)) != -1) {
                index = 1;
            } else if (secondRow.indexOf(string.charAt(0)) != -1) {
                index = 2;
            } else if (thirdRow.indexOf(string.charAt(0)) != -1) {
                index = 3;
            } else {
                integers.add(i);
                continue;
            }
            for (int j = 1; j < string.length(); j++) {
                temp = index;
                if (firstRow.indexOf(string.charAt(j)) != -1) {
                    temp = 1;
                } else if (secondRow.indexOf(string.charAt(j)) != -1) {
                    temp = 2;
                } else if (thirdRow.indexOf(string.charAt(j)) != -1) {
                    temp = 3;
                } else {
                    integers.add(i);
                    continue;
                }
                if (temp != index) {
                    integers.add(i);
                    break;
                }
            }
        }

        String[] re = new String[words.length - integers.size()];
        for (int j = 0; j < words.length; j++) {
            if (!integers.contains(j)) {
                re[k] = words[j];
                k++;
            }
        }
        return re;
    }

}