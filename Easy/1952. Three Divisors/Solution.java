class Solution {
    public boolean isThree(int n) {
        int c = 0, temp = n - 1;

        while (temp > 1) {
            if (n % temp == 0) {
                c++;
            }
            temp--;
        }
        return c == 1;
    }
}