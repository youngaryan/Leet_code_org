import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        ArrayList<Character> reverse = new ArrayList<>();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('u');
        vowels.add('i');
        vowels.add('o');
        vowels.add('A');
        vowels.add('E');
        vowels.add('U');
        vowels.add('I');
        vowels.add('O');

        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])){
                reverse.add(chars[i]);
                chars[i] = '$';
            }
        }
        int j = 0;
        for (int i = chars.length-1; i >=0 ; i--) {
            if (chars[i] == '$') {
                chars[i] = reverse.get(j);
                j++;
            }
        }
        StringBuilder tBuilder = new StringBuilder();
        for (char aChar : chars) {
            tBuilder.append(aChar);
        }

        return tBuilder.toString();
    }
}
