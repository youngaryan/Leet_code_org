import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < s.length()-1; i++) {
            int i1 = t.indexOf(s.charAt(i));
            int i2 = t.indexOf(s.charAt(i + 1));
            if (i1 > i2) {
                tArr[i1] = '0';
            }
        }

        int count = 0;
        for (char value : tArr) {
            if (value == '0') count++;
            if (count>1)return false;
            if (!tMap.containsKey(value))
                tMap.put(value, 1);
            else
                tMap.put(value, tMap.get(value) + 1);
        }



        for (char c : sArr) {
            if (!sMap.containsKey(c))
                sMap.put(c, 1);
            else
                sMap.put(c, sMap.get(c) + 1);
            if (!tMap.containsKey(c)) return false;
        }
        System.out.println("smap " + sMap );
        System.out.println("tmap " + tMap );
        System.out.println("sArr " + Arrays.toString(sArr));
        System.out.println("here");

        for (char c : sArr) {
            if ((sMap.get(c) > tMap.get(c)))
                return false;
        }

        System.out.println("smap " + sMap );
        System.out.println("tmap " + tMap );
        return true;
    }
}
