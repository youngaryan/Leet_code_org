import java.util.ArrayList;
import java.util.List;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;

        int max = 0;
        List<String> tokens = split(s);
        // System.out.println(tokens);
        
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
        int left= 0 ,right = 1;

        while(right != s.length()){
            e = s.charAt(right);
            if(temCharacters.contains(e)){
                tStrings.add(stringBuilder.substring(left, right+1).toString());
                stringBuilder.delete(left, left+1);
                temCharacters.remove(e);
                left ++;
            }
            temCharacters.add(e);
            stringBuilder.append(e);
            right++;
            // System.out.println("tStrings " + tStrings);
            // System.out.println("tempChatr "+ temCharacters);
            // System.out.println("sculider " +stringBuilder);
        }
        tStrings.add(stringBuilder.toString());
    

        return tStrings;
    }
}