package constructBinaryTreeFromPreorderAndInorderTraversal;

import java.util.Stack;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author kaizen
 * @date 2020/6/4
 */
public class Solution {
    int i = 0, j = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        return recursion(preorder, inorder, Integer.MAX_VALUE);
    }

    private TreeNode recursion(int[] preorder, int[] inorder, int stop) {
        if (i >= preorder.length) {
            return null;
        }
        if (inorder[j] == stop) {
            j++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[i++]);
        node.left = recursion(preorder, inorder, node.val);
        node.right = recursion(preorder, inorder, stop);
        return node;
    }

    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int i = 0, j = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[i++]);
        stack.push(root);
        while (i < preorder.length) {
            TreeNode node = stack.peek();
            if (!stack.isEmpty() && node.val != inorder[j]) {
                TreeNode left = new TreeNode(preorder[i++]);
                node.left = left;
                stack.push(left);
            } else {
                while (!stack.isEmpty() && inorder[j] == stack.peek().val) {
                    j++;
                    node = stack.pop();
                }
                TreeNode right = new TreeNode(preorder[i++]);
                node.right = right;
                stack.push(right);
            }
        }
        return root;
    }

}
