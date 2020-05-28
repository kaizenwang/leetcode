package maximumDepthOfBinaryTree;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author kaizen
 * @date 2020/5/28
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    /**
     * BFS
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {
        int depth = 0;
        if (root == null){
            return depth;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }

    /**
     * DFS
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {
        if (root == null){
            return 0;
        }
        int max = 0;
        Stack<TreeNode> nodes = new Stack<>();
        Stack<Integer> values = new Stack<>();
        nodes.push(root);
        values.push(1);
        while (!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            int value = values.pop();
            max = Math.max(max, value);
            if (node.left != null){
                nodes.push(node.left);
                values.push(value+1);
            }
            if (node.right != null){
                nodes.push(node.right);
                values.push(value+1);
            }
        }
        return max;
    }
}
