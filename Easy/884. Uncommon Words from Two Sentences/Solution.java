import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] sp1 = s1.split(" ");
        String[] sp2 = s2.split(" ");

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String string : sp1) {
            map1.put(string, map1.getOrDefault(string, 0) + 1);
        }

        for (String string : sp2) {
            map2.put(string, map2.getOrDefault(string, 0) + 1);
        }

        ArrayList<String> arrRes = new ArrayList<>();

            for (String string : map1.keySet()) {
                if (map1.get(string) < 2 && !map2.containsKey(string)) {
                    arrRes.add(string);
                }
            }
      
            for (String string : map2.keySet()) {
                if (map2.get(string) < 2 && !map1.containsKey(string)) {
                    arrRes.add(string);
                }
            
        }

        String[] re = new String[arrRes.size()];

        // System.out.println(arrRes);
       for (int i = 0; i < arrRes.size(); i++) {
        re[i] = arrRes.get(i);
       }
        return re;
    }
}