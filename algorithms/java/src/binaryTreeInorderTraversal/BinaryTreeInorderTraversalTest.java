package binaryTreeInorderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author kaizen
 * @date 2020/5/26
 */
public class BinaryTreeInorderTraversalTest {
    @Test
    public void testInorderTraversal() {
        BinaryTreeInorderTraversal inorder = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode rightTree = new TreeNode(2);
        root.right = rightTree;
        rightTree.left = new TreeNode(3);
        Assert.assertEquals(Arrays.asList(1, 3, 2), inorder.inorderTraversal2(root));
    }
}
