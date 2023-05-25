public class Solution {
    public int addDigits(int num) {
        while (num>9)
            num = digitAdder(num);
        return num;
    }

    /**
     * @param digits
     * it receives an integer
     * @return the sum of its digits.
     */
    int digitAdder(int digits){
        int digit;
        int sum = 0;
        while (digits!=0){
            digit = digits%10;
            sum+=digit;
            digits/=10;
        }
        return sum;
    }
}
