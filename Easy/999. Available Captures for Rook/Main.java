public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().numRookCaptures(new char[][] {
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { 'B', 'p', 'B', 'R', 'B', 'B', 'p', 'p' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', 'p', '.', '.', '.', '.' },
                { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.' }
        }));
    }
}