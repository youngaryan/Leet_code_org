import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution
{
    public List<Integer> inorderTraversal(TreeNode root)
    {

        List<Integer> result = new ArrayList<>();
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<>();

        while (currentNode != null || !stack.empty())
        {
            while (currentNode != null)
            {
                stack.add(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            result.add(currentNode.val);
            currentNode = currentNode.right;

        }
        return result;
    }
}
