package constructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.Stack;

/**
 * @author kaizen
 * @date 2020/6/1
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    private int pInorder;
    private int pPostorder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pInorder = inorder.length - 1;
        pPostorder = postorder.length - 1;
        return recursion(inorder, postorder, Integer.MAX_VALUE);
    }

    private TreeNode recursion(int[] inorder, int[] postorder, int end) {
        if (pPostorder < 0) {
            return null;
        }
        if (inorder[pInorder] == end) {
            pInorder--;
            return null;
        }
        TreeNode node = new TreeNode(postorder[pPostorder--]);
        node.right = recursion(inorder, postorder, node.val);
        node.left = recursion(inorder, postorder, end);
        return node;
    }

    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        int i = inorder.length - 1, j = postorder.length - 1;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(postorder[j--]);
        stack.push(root);
        while (j >= 0){
            TreeNode node = stack.peek();
            if (node.val != inorder[i]){
                TreeNode right = new TreeNode(postorder[j--]);
                node.right = right;
                stack.push(right);
            }else {
                while (!stack.isEmpty() && stack.peek().val == inorder[i]){
                    node = stack.pop();
                    i--;
                }
                TreeNode left = new TreeNode(postorder[j--]);
                node.left = left;
                stack.push(left);
            }
        }
        return root;
    }
}
