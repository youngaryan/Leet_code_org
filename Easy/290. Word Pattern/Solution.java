import java.util.HashMap;
import java.util.Objects;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        String[] stringsSplit = s.split(" ");

        if (stringsSplit.length != pattern.length())return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (hashMap.containsKey(pattern.charAt(i))){
                if (!Objects.equals(hashMap.get(pattern.charAt(i)), stringsSplit[i]))return false;
            }else {
                if (hashMap.containsValue(stringsSplit[i]) && !hashMap.containsKey(pattern.charAt(i)) )return false;
                hashMap.put(pattern.charAt(i), stringsSplit[i]);
            }
        }
        return true;
    }
}