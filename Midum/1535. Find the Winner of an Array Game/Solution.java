class Solution {
    public int getWinner(int[] arr, int k) {
        int pointer = arr[0], win = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > pointer) {
                pointer = arr[i];
                win = 0;
            }
            win++;
            if (win == k) {
                break;
            }
        }
        return pointer;
    }
}