import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().onesMinusZeros(new int[][] {
                { 0, 1, 1 },
                { 1, 0, 1 },
                { 0, 0, 1 }
        })));
    }
}
