import java.util.HashMap;

public class Solution {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('U', 1);
        hashMap.put('D', -1);
        hashMap.put('W', 2);
        hashMap.put('L', -2);

        int sum = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (hashMap.containsKey(moves.charAt(i))) {
                sum += hashMap.get(moves.charAt(i));
            }
        }
        return sum==0;
    }
}
