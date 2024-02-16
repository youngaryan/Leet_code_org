import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int integer : map.values()) {
            // System.out.println(integer);
            pq.add(integer);
        }

        int delete = 0;

        while (delete < k && !pq.isEmpty()) {
            delete += pq.poll();
            // System.out.println(pq.poll());
        }
        // System.out.println(pq);
        // System.out.println(map);
        // return map.size() - delete ;
        // if (delete == k) {
        //     return pq.size();
        // }
        return delete > k ? (pq.size() + 1) : (delete == k ? pq.size() : (map.size() - delete));
    }
}

/*
 * Input: arr = [4,3,1,1,3,3,2], k = 3
 * Output: 2
 */