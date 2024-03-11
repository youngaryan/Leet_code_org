import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> strings = new ArrayList<>();

        int start = 0, i = 1;
        while (i < s.length()) {
            while (s.charAt(i) == ' ') {
                if (s.charAt(i - 1) != ' ') {
                    strings.add(s.substring(start, i).trim());
                    start = i + 1;
                }
                i++;
            }
            i++;
        }
        i = s.length() - 1;

        while (i > 0) {
            if (s.charAt(i) == ' ') {
                strings.add(s.substring(i + 1, s.length()));
                break;
            }
            i--;
        }

        if (i == 0) {
            strings.add(s.substring(i, s.length()));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int j = strings.size() - 1; j >= 0; j--) {
            stringBuilder.append(strings.get(j));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}