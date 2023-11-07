import java.util.Arrays;

class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] timeToReach = new int[n];

        for (int i = 0; i < n; i++) {
            timeToReach[i] = (dist[i] + speed[i] - 1) / speed[i];
        }

        Arrays.sort(timeToReach);

        int eliminatedMonsters = 0;

        for (int i = 0; i < n; i++) {
            if (timeToReach[i] > i) {
                eliminatedMonsters++;
            } else {
                break;
            }
        }

        return eliminatedMonsters;
    }
}
