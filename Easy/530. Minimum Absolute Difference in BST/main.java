public class main {
    public static void main(String[] args) {
        Solution s= new Solution();

        TreeNode treeNode = new TreeNode(4,new TreeNode(2),new TreeNode(48));
        System.out.println(s.getMinimumDifference(treeNode));

    }
}
