package pathSum;

import java.util.*;

/**
 * @author kaizen
 * @date 2020/6/1
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> valueStack = new Stack<>();
        valueStack.push(sum);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int value = valueStack.pop() - node.val;
            if (value == 0 && node.left == null && node.right == null) {
                return true;
            }
            if (node.right != null) {
                valueStack.push(value);
                stack.push(node.right);
            }
            if (node.left != null) {
                valueStack.push(value);
                stack.push(node.left);
            }
        }
        return false;
    }
}
