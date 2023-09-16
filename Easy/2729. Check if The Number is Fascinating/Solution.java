import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isFascinating(int n) {

        if (n > 333) {
            return false;
        }
        Set<Integer> hold = new HashSet<>();

        int left = (int) (n * Math.pow(10, 6));
        int mid = (int) (n * Math.pow(10, 3)) * 2;
        int right = n * 3;

        n = (left + mid + right);
        int temp;

        // System.out.println(n);

        while (n > 0) {
            temp = n % 10;
            // System.out.println(temp + "\n");

            if (temp == 0) {
                return false;
            }

            hold.add(temp);
            n /= 10;
        }

        return hold.size() == 9;
    }
}

// 192384576