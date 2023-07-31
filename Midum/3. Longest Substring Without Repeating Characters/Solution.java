import java.util.ArrayList;
import java.util.List;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;

        int max = 0;
        List<String> tokens = split(s);
        System.out.println(tokens);
        
        for (String string : tokens) {
            if(string.length() > max) max = string.length();
        }
        return max;
    }



    private List<String> split(String s) {
        List<String> tStrings = new ArrayList<>();
        List<Character> temCharacters = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        char e; 

        for (int i = 0; i < s.length(); i++) {
            e = s.charAt(i);
            if(temCharacters.contains(e)){
                tStrings.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
                temCharacters.clear(); 
            }
            temCharacters.add(e);
            stringBuilder.append(e);
        }
        tStrings.add(stringBuilder.toString());
        return tStrings;
    }
}