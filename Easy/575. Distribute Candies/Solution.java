import java.util.Arrays;

class Solution {
    public int distributeCandies(int[] candyType) {
        int type = 1, length = candyType.length;
        Arrays.sort(candyType);

        for (int i = 1; i < length; i++) {
            if(candyType[i-1] != candyType[i]) type++;
        }
        
        return length/2 <=type ? length/2 : type;
    }
}