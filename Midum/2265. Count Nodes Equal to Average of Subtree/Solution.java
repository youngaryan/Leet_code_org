class Solution {
    int count = 0;

    public int averageOfSubtree(TreeNode root) {

        process(root);

        return count;
    }

    private int[] process(TreeNode root) {
        if (root == null) {
            return new int[] { 0, 0 };
        }

        int[] left = process(root.left);
        int[] right = process(root.right);

        int totalSum = left[0] + right[0] + root.val;
        int totalNode = left[1] + right[1] + 1;

        if (totalSum / totalNode == root.val) {
            count++;
        }
        return new int[] { totalSum, totalNode };
    }
}