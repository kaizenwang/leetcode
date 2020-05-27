package binaryTreePostorderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author kaizen
 * @date 2020/5/26
 */
public class BinaryTreePostorderTraversalTest {

    @Test
    public void testPostorderTraversal() {
        BinaryTreePostorderTraversal postorder = new BinaryTreePostorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode rightTree = new TreeNode(2);
        root.right = rightTree;
        rightTree.left = new TreeNode(3);
        Assert.assertEquals(Arrays.asList(3, 2, 1), postorder.postorderTraversal2(root));
    }

    @Test
    public void testPostorderTraversal1() {
        BinaryTreePostorderTraversal postorder = new BinaryTreePostorderTraversal();
        Assert.assertEquals(Collections.emptyList(), postorder.postorderTraversal2(null));
    }
}
