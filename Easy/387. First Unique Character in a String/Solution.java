import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        List<Character> c = new ArrayList<>();
        Set<Character> exist = new HashSet<>();
        char w;
        

        for (int i = 0; i < s.length(); i++) {
            w = s.charAt(i);
            if(c.contains(w)){
                exist.add(w);
            }
            c.add(w);
        }

        for (int i = 0; i < c.size(); i++) {
            w = c.get(i);

            if(!exist.contains(w)){
                return i;
            }
        }
        return -1;
    }
}