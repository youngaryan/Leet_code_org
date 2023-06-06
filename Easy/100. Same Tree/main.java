public class main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode p = new TreeNode(0,new TreeNode(),new TreeNode());
        TreeNode q = new TreeNode(8,new TreeNode(1),new TreeNode(2));
        System.out.println(s.isSameTree(p,q));
    }
}
