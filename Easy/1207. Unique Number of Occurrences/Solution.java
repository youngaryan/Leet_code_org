import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> temp = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int inside;

        for (int i : arr) {
            if (!temp.containsKey(i)) {
                temp.put(i, 1);
            } else {
                temp.put(i, temp.get(i) + 1);
            }
            if (!integers.contains(i)) {
                integers.add(i);
            }
        }

        for (int i = 0; i < integers.size(); i++) {
            inside = temp.get(integers.get(i));
            if (result.contains(inside)) {
                return false;
            }
            result.add(inside);
        }

        return true;
    }
}