import java.util.Arrays;
import java.util.List;

public class PigLatin {
    public static String pigIt(String str) {
        final String CONSTANT ="ay";
        String[] strArr = str.split(" ");
        StringBuilder result = new StringBuilder();
        char first;
        List<String> punctuation = (Arrays.asList("!",".",",","?",";",":"));
        


        for (int i = 0; i < strArr.length; i++) {
            if(!punctuation.contains(strArr[i])){
                first = strArr[i].charAt(0);
                result.append(strArr[i].substring(1) + first + CONSTANT + " ");
            }else{
                result.append(strArr[i]);
            }
        }


        return result.toString().trim();
    }
}