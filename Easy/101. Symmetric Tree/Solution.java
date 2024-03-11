class Solution {
    public boolean isSymmetric(TreeNode root) {

        return (checkLeftAndRight(root.left, root.right));
    }

    private boolean checkLeftAndRight(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return left.val == right.val && checkLeftAndRight(left.left, right.right)
                && checkLeftAndRight(left.right, right.left);
    }
}

/*
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * Input: root = [1,2,2,null,3,null,3]
 * Output: false
 */