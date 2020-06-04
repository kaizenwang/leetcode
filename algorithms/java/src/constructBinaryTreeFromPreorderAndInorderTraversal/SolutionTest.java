package constructBinaryTreeFromPreorderAndInorderTraversal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kaizen
 * @date 2020/6/4
 */
public class SolutionTest {

    private Solution solution;
    private TreeNode root;
    private final int[] preorder = new int[]{3, 9, 20, 15, 7};
    private final int[] inorder = new int[]{9, 15, 7, 20, 3};

    @Before
    public void init() {
        solution = new Solution();
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        root.right = right;
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
    }

    @Test
    public void buildTree() {
        Assert.assertEquals(preOrder(root), preOrder(solution.buildTree(preorder, inorder)));
    }

    @Test
    public void testBuildTree1() {
        Assert.assertEquals(preOrder(root), preOrder(solution.buildTree1(preorder, inorder)));
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
