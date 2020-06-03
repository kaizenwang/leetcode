package constructBinaryTreeFromInorderAndPostorderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaizen
 * @date 2020/6/1
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    public void testBuildTree() {
        ConstructBinaryTreeFromInorderAndPostorderTraversal order = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        Assert.assertEquals(preOrder(root), preOrder(order.buildTree1(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3})));
    }

    private List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preOrder(root.left));
        list.addAll(preOrder(root.right));
        return list;
    }
}
