import java.util.Arrays;
import java.util.List;

class Solution {
    public String toGoatLatin(String sentence) {

        //'a', 'e', 'i', 'o', or 'u'
        List<Character> vowels = Arrays.asList('a','e','u','i','o', 'A','E','U','O','I');
        String[] strArr = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        String temp;
        char firstChar; 
        

        for (int i = 0; i < strArr.length; i++) {
            temp = strArr[i];
            firstChar = temp.charAt(0);
            if(vowels.contains(firstChar)){
                temp =temp + "ma";
            }else{
                temp = temp.substring(1) + firstChar + "ma";
            }

            for (int j = 0; j <= i; j++) {
                temp +="a";
            }
            result.append(temp+" ");
        }
        return result.substring(0, result.length()-1).toString();
    }
}