import java.util.Arrays;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        Arrays.sort(freq);
        int maxVal = freq[25] - 1, idleSlots = maxVal * n;

        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(maxVal, freq[i]);
        }

        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}
/*
 * Input: tasks = ["A","A","A","B","B","B"], n = 2
 * 
 * Output: 8
 * 
 * Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A ->
 * B.
 * 
 * 
 * [0,0,...,0,3,3]
 * t = 0
 * _ _ _ _ _ _ _ _
 * 
 * [0,0,...,0,3,2]
 * t = 1
 * A _ _ A _ _ _ _
 * 
 */