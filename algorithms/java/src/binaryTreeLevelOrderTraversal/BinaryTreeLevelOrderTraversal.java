package binaryTreeLevelOrderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author kaizen
 * @date 2020/5/27
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            list.add(new ArrayList<>());
            for (int i = 1; i <= currentLevelSize; i++) {
                TreeNode node = queue.poll();
                list.get(list.size() - 1).add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return list;
    }

    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelHelper(res, root, 0);
        return res;
    }

    private void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) {
            return;
        }
        if (height == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(height).add(root.val);
        levelHelper(res, root.left, height + 1);
        levelHelper(res, root.right, height + 1);
    }
}
