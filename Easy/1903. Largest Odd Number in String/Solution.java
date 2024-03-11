import java.util.HashSet;

class Solution {
    public String largestOddNumber(String num) {
        int length = num.length(), end = length - 1;

        HashSet<Integer> oddNum = new HashSet<>(5);
        oddNum.add(49);
        oddNum.add(51);
        oddNum.add(53);
        oddNum.add(55);
        oddNum.add(57);

        while (end >= 0) {
            if (oddNum.contains(((int) num.charAt(end)))) {
                end++;
                break;
            }
            end--;
        }

        return end < 1 ? "" : num.substring(0, end);
    }
}