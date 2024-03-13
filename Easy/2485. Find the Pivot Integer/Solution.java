class Solution {
    public int pivotInteger(int n) {
        int target = n * (n + 1) / 2;
        int valid = (int) Math.sqrt(target);

        return valid * valid == target ? valid : -1;
    }
}
