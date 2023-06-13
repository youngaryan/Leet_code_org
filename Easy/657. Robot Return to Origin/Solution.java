

public class Solution {
    public boolean judgeCircle(String moves) {

        int sum = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            switch (c) {
                case 'U' -> sum += 10;
                case 'D' -> sum -= 10;
                case 'R' -> sum += 1;
                case 'L' -> sum -= 1;
            }
        }
        return sum==0;
    }
}
