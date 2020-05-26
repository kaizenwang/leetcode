package binaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author kaizen
 * @date 2020/5/26
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        list.add(root.val);
        if (root.left != null){
            list.addAll(preorderTraversal(root.left));
        }
        if (root.right != null){
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            list.add(node.val);
            if (node.right != null){
                stack.add(node.right);
            }
            if (node.left != null){
                stack.add(node.left);
            }
        }
        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> rights = new Stack<>();
        while (node != null){
            list.add(node.val);
            if (node.right != null){
                rights.push(node.right);
            }
            node = node.left;
            if (node == null && !rights.isEmpty()){
                node = rights.pop();
            }
        }
        return list;
    }

}
