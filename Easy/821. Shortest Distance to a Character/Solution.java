import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int length = s.length();
        List<Integer> indexes = new ArrayList<>();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == c) {
                indexes.add(i);
            }
        }

        int k = 1;
        for (int i = 0; i < length; i++) {

        }
        return null;
    }
}