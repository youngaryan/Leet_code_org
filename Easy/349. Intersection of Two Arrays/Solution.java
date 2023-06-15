import java.util.ArrayList;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();


        if (nums1.length>nums2.length) {
            for (int k : nums1) {
                arrayList.add(k);
            }
            for (int j : nums2) {
                if (arrayList.contains(j) && !arrayList1.contains(j)) arrayList1.add(j);
            }
        }else {
            for (int k : nums2) {
                arrayList.add(k);
            }
            for (int j : nums1) {
                if (arrayList.contains(j) && !arrayList1.contains(j)) arrayList1.add(j);
            }
        }

        int[] re = new int[arrayList1.size()];
        int i = 0;
        while (!arrayList1.isEmpty()){
            re[i] = arrayList1.get(0);
            arrayList1.remove(0);
            i++;
        }
        return re;
    }
}
