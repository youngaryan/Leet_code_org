import java.util.HashSet;
import java.util.List;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (List<Integer> list : nums) {
            int s = list.get(0), end = list.get(1);
            for (int i = s; i <= end; i++) {
                hashSet.add(i);
            }
        }

        return hashSet.size();
    }
}