import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] countlosser = new int[1000001];

        for (int i = 0; i < matches.length; i++) {
            int losser = matches[i][1];
            countlosser[losser]--;

        }

        List<Integer> wonAll = new ArrayList<>();
        List<Integer> lostOnce = new ArrayList<>();

        for (int i = 0; i < matches.length; i++) {
            int losser = matches[i][1];
            int winner = matches[i][0];

            if (countlosser[winner] == 0) {
                wonAll.add(winner);
                countlosser[winner] = -2;
            }

            if (countlosser[losser] == -1) {
                lostOnce.add(losser);
                countlosser[losser] = -2;
            }

        }

        List<List<Integer>> re = new ArrayList<>();
        Collections.sort(wonAll);
        Collections.sort(lostOnce);

        re.add(wonAll);
        re.add(lostOnce);

        return re;
    }
}