/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int dim = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return dim;
    }

    private int calculateDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depthLeft = calculateDepth(root.left);
        int depthRight = calculateDepth(root.right);

        dim = Math.max(dim, depthLeft + depthRight);

        return Math.max(depthLeft, depthRight) + 1;
    }
}