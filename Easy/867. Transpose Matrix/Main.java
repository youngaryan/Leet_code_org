import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().transpose(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        })));
    }

    /*
     * { 1, 2, 3 },
     * { 4, 5, 6 },
     * { 7, 8, 9 }
     */
}
