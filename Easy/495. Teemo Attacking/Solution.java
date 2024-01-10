class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        if (timeSeries.length == 1) {
            return duration;
        }

        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration >= timeSeries[i + 1]) {
                total += timeSeries[i + 1] - timeSeries[i];
            } else {
                total += duration;
            }
        }

        total += duration;
        return total;
    }
}