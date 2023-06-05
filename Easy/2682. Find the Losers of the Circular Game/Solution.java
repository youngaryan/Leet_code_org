import java.util.HashSet;
public class Solution {
    public int[] circularGameLosers(int n, int k) {
        HashSet<Integer> list = new HashSet<>();

        int j = 1;
        int initial = 1;
        while (!list.contains(initial)){
            list.add(initial);
            initial = (initial+(k*j))%n;
            if (initial == 0)initial=n;
            j++;
        }

        j=0;
        int[] result = new int[n - list.size()];
        for (int i = 1; i < n+1; i++) {
            if (!list.contains(i)) {
                result[j] = i;
                j++;
            }
        }
        return result;
    }
}
