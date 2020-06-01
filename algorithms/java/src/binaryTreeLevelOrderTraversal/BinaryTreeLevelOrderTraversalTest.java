package binaryTreeLevelOrderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author kaizen
 * @date 2020/5/27
 */
public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void testLevelOrder() {
        BinaryTreeLevelOrderTraversal levelOrder = new BinaryTreeLevelOrderTraversal();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        TreeNode node1 = new TreeNode(20);
        node.right = node1;
        node1.left = new TreeNode(15);
        node1.right = new TreeNode(7);
        Assert.assertEquals(Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7)), levelOrder.levelOrder1(node));
    }
}
