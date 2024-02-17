import java.util.PriorityQueue;

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];

            if (diff > 0) {
                pq.offer(diff);
            }

            if (pq.size() > ladders) {
                bricks -= pq.poll();
            }

            if (bricks < 0) {
                return i-1;
            }
        }

        return heights.length - 1;
    }
}

// import java.util.Arrays;

// class Solution {
// public int furthestBuilding(int[] heights, int bricks, int ladders) {

// int[] diff = new int[heights.length - 1];

// for (int i = 0; i < diff.length; i++) {
// diff[i] = heights[i] - heights[i + 1];
// }

// int max = helper(diff, bricks, ladders, 0);
// // System.out.println(Arrays.toString(diff));
// // System.out.println(Arrays.toString(heights));
// return max;
// }

// private int helper(int[] diff, int bricks, int ladders, int max) {
// if (max == diff.length) {
// return max;
// }
// if (bricks == 0 && ladders == 0) {
// return max;
// }

// if (diff[max] >= 0) {
// return helper(diff, bricks, ladders, max + 1);
// }
// if (bricks + diff[max] < 0) {
// return helper(diff, bricks, ladders - 1, max + 1);
// }

// if (ladders == 0) {
// return helper(diff, bricks + diff[max], ladders, max + 1);
// }

// max = Math.max(helper(diff, bricks + diff[max], ladders, max + 1),
// helper(diff, bricks, ladders - 1, max + 1));

// return max;
// }
// }

// /*
// * Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
// * Output: 4
// */