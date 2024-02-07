public class Solution {
    public int superPow(int a, int[] b) {
        if (a == 0) {
            return 0;
        }
        if (a == 1 || b[0] == 0) {
            return 1;
        }

        int limit = 0, pow = (int) Math.pow(10, b.length - 1);

        for (int i = 0; i < b.length; i++) {
            limit += b[i] * (pow);
            pow /= 10;
        }

        // System.out.println(limit);

        a %= 1337;
        int result = a;
        limit--;
        while (limit > 0) {
            result *= a;
            result %= 1337;
            limit--;
        }
        return result;
    }
}
