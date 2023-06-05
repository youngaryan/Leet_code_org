
import java.util.Arrays;

public class Solution {
    //recursion
    public int lastStoneWeight(int[] stones) {

        int c = stones.length;
        while (c>1){
            stones = parser(stones);
            c--;
        }

        return stones[0];
    }
    static int[] parser(int[] stones){
        int length = stones.length;

        Arrays.sort(stones);
        stones[length-2] = stones[length-1] - stones[length-2];

        return Arrays.copyOf(stones,stones.length-1);
    }
}
