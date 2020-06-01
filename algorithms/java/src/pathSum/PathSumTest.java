package pathSum;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author kaizen
 * @date 2020/6/1
 */
public class PathSumTest {

    @Test
    public void hasPathSum() {
        PathSum sum = new PathSum();
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(8);
        root.left = left;
        root.right = right;
        TreeNode leftLeft = new TreeNode(11);
        TreeNode rightLeft = new TreeNode(13);
        TreeNode rightRight = new TreeNode(4);
        left.left = leftLeft;
        right.left = rightLeft;
        right.right = rightRight;
        TreeNode leftLeftLeft = new TreeNode(7);
        TreeNode leftLeftRight = new TreeNode(2);
        TreeNode rightRightRight = new TreeNode(1);
        leftLeft.left = leftLeftLeft;
        leftLeft.right = leftLeftRight;
        rightRight.right = rightRightRight;
        Assert.assertTrue(sum.hasPathSum2(root, 22));
    }

    @Test
    public void hasPathSum1() {
        PathSum sum = new PathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assert.assertFalse(sum.hasPathSum2(root, 1));
    }
}
