package maximumDepthOfBinaryTree;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author kaizen
 * @date 2020/5/28
 */
public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() {
        MaximumDepthOfBinaryTree depth = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        Assert.assertEquals(3, depth.maxDepth2(root));
    }
}
