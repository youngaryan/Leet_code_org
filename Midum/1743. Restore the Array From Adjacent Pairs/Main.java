import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().restoreArray(new int[][] {
                { 4, -2 },
                { 1, 4 },
                { -3, 1 }
        })));
    }
}

/*
 * { 2, 1 },
 * { 3, 4 },
 * { 3, 2 }
 */