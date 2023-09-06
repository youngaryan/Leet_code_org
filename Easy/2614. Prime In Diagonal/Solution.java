class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0, temp;

        for (int i = 0; i < nums.length; i++) {
            temp = nums[i][i];
            if (temp > maxPrime && isPrime(temp)) {
                maxPrime = nums[i][i];
            }
            temp = nums[i][nums.length - i - 1];
            if (temp > maxPrime && isPrime(temp)) {
                maxPrime = temp;
            }
        }

        return maxPrime;
    }

    static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num % 2 == 0 || num == 1)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}