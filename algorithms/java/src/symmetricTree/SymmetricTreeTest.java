package symmetricTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kaizen
 * @date 2020/5/29
 */
public class SymmetricTreeTest {

    private SymmetricTree tree;

    @Before
    public void init(){
       tree = new SymmetricTree();
    }

    @Test
    public void testIsSymmetric() {
        TreeNode root = new TreeNode(1);
        TreeNode leftTree = new TreeNode(2);
        TreeNode rightTree = new TreeNode(2);
        root.left = leftTree;
        root.right = rightTree;
        TreeNode leftTree1 = new TreeNode(3);
        TreeNode rightTree1 = new TreeNode(4);
        leftTree.left = leftTree1;
        leftTree.right = rightTree1;
        rightTree.left = rightTree1;
        rightTree.right = leftTree1;
        Assert.assertTrue(tree.isSymmetric1(root));
    }

    @Test
    public void testIsSymmetric1() {
        TreeNode root = new TreeNode(1);
        TreeNode leftTree = new TreeNode(2);
        TreeNode rightTree = new TreeNode(2);
        root.left = leftTree;
        root.right = rightTree;
        TreeNode rightTree1 = new TreeNode(3);
        leftTree.right = rightTree1;
        rightTree.right = rightTree1;
        Assert.assertFalse(tree.isSymmetric1(root));
    }
}
