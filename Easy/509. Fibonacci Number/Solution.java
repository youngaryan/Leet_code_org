import java.util.HashMap;

public class Solution {
    public int fib(int n) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,0);
        hashMap.put(1,1);

        int sum;
        for (int i = 2; i < n+1; i++) {
            sum = hashMap.get(i-1) + hashMap.get(i-2);
            hashMap.put(i, sum);
        }
        return hashMap.get(n);
    }
}
