import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> pqAvail = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pqAvail.offer(i);
        }

        long[] count = new long[n];
        PriorityQueue<int[]> pqEndAndRoom = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < meetings.length; i++) {

            while (!pqEndAndRoom.isEmpty() && meetings[i][0] >= pqEndAndRoom.peek()[0]) {
                pqAvail.offer(pqEndAndRoom.poll()[1]);
            }

            if (pqAvail.isEmpty()) {
                int[] t = pqEndAndRoom.poll();
                meetings[i][1] = t[0] + (meetings[i][1] - meetings[i][0]);

                pqAvail.offer(t[1]);

            }
            int room = pqAvail.poll();
            pqEndAndRoom.offer(new int[] { meetings[i][1], room });
            count[room]++;

        }

        long m = Integer.MIN_VALUE;
        int  indx = -1;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > m) {
                m = count[i];
                indx = i;
            }
        }
        return indx;

    }
}