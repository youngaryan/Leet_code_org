import java.util.HashSet;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int n : nums1)
            s1.add(n);

        for (int n : nums2) {
            if (s1.contains(n)) s2.add(n);
        }

        int[] re = new int[s2.size()];
        int j = 0;

        for (int n : s2){
            re[j] = n;
            j++;
        }
        return re;
    }
}
