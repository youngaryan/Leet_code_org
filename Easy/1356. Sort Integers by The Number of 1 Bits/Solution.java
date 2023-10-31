import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int[] sortByBits(int[] arr) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Integer.bitCount(arr[i]);
            ArrayList<Integer> list = map.getOrDefault(index, new ArrayList<>());
            list.add(arr[i]);
            map.put(index, list);
        }

        int[] r = new int[arr.length];

        int k = 0;
        for (ArrayList<Integer> i : map.values()) {
            Collections.sort(i);
            for (int j = 0; j < i.size(); j++) {
                r[k] = i.get(j);
                k++;
            }

        }

        return r;
    }
}