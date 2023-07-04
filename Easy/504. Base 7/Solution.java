public class Solution {
    public String convertToBase7(int num) {
//100
        //0,7,49,343

        StringBuilder result = new StringBuilder();
        int power = 0;

        while (Math.pow(7, power) < num) {
            power++;
        }
        return null;
    }


}
