class Solution {
    public int totalMoney(int n) {
        int divisor = n / 7, reminder = n % 7, total = 0;
        total += (divisor * (2 * 28 + (divisor - 1) * 7)) / 2;

        for (int i = divisor + 1; i <= reminder + divisor; i++) {
            total += i;
        }
        return total;
    }
}