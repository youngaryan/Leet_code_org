

public class Solution {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U' -> v ++;
                case 'D' -> v --;
                case 'R' -> h ++;
                case 'L' -> h --;
            }
        }
        return h ==0 && v==0;
    }
}
