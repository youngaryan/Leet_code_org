import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        final String PUSH = "Push";
        final String POP = "Pop";

        List<String> r = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : target) {
            set.add(i);
        }

        for (int i = 1; i <= n; i++) {

            if (set.contains(i)) {
                r.add(PUSH);
            } else {
                r.add(PUSH);
                r.add(POP);
            }
            if (target[target.length - 1] == i) {
                return r;
            }
        }
        return r;
    }
}