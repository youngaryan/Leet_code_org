public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isCovered(new int[][] {
                { 25, 42 },
                { 7, 14 },
                { 2, 32 },
                { 25, 28 },
                { 39, 49 },
                { 1, 50 },
                { 29, 45 },
                { 18, 47 }
        }, 15, 38));
    }
}
// [[1,2],[3,4],[5,6]], left = 2, right = 5

// [[25,42],[7,14],[2,32],[25,28],[39,49],[1,50],[29,45],[18,47]]