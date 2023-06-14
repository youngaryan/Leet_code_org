import java.util.HashMap;

public class Solution {
    public String toHex(int num) {

        if (num<0)return toHex((int) Math.pow(16,8) + num);


        StringBuilder re = new StringBuilder();
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10,"a");
        hashMap.put(11,"b");
        hashMap.put(12,"c");
        hashMap.put(13,"d");
        hashMap.put(14,"e");
        hashMap.put(15,"f");
        while (num>0){
            if (num % 16 < 10){
                re.append(num % 16);
            }else {
                re.append(hashMap.get(num%16));
            }
            num = num/16;
        }

        return re.reverse().toString();
    }
}
