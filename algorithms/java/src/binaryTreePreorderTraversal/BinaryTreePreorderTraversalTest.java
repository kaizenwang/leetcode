package binaryTreePreorderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author kaizen
 * @date 2020/5/26
 */
public class BinaryTreePreorderTraversalTest {

    @Test
    public void testPreorderTraversal() {
        BinaryTreePreorderTraversal preorder = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode rightTree = new TreeNode(2);
        root.right = rightTree;
        rightTree.left = new TreeNode(3);
        Assert.assertEquals(Arrays.asList(1, 2, 3), preorder.preorderTraversal2(root));
    }

    @Test
    public void testPreorderTraversal1() {
        BinaryTreePreorderTraversal preorder = new BinaryTreePreorderTraversal();
        Assert.assertEquals(Collections.emptyList(), preorder.preorderTraversal2(null));
    }
}
