import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Long> pqAvail = new PriorityQueue<>();
        for (long i = 0; i < n; i++) {
            pqAvail.offer(i);
        }

        long[] count = new long[n];
        PriorityQueue<long[]> pqEndAndRoom = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? Long.compare(a[0], b[0]) : Long.compare(a[1], b[1]));

        for (int i = 0; i < meetings.length; i++) {

            while (!pqEndAndRoom.isEmpty() && meetings[i][0] >= pqEndAndRoom.peek()[0]) {
                pqAvail.offer((long)(pqEndAndRoom.poll()[1]));
            }

            if (pqAvail.isEmpty()) {
                long[] t = pqEndAndRoom.poll();
                meetings[i][1] = (int)t[0] + (meetings[i][1] - meetings[i][0]);

                pqAvail.offer((long)(t[1]));

            }
            long room = pqAvail.poll();
            pqEndAndRoom.offer(new long[] { meetings[i][1], room });
            count[(int) room]++;

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