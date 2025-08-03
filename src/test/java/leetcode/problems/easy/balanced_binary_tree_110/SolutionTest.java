package leetcode.problems.easy.balanced_binary_tree_110;

import leetcode.library.TreeNode;
import leetcode.library.TreeNodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isBalanced() {
        Solution solution = new Solution();
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        TreeNode treeNode0 = treeNodeBuilder.fromStringRepresentation("[3,9,20,null,null,15,7]");
        assertTrue(solution.isBalanced(treeNode0));
        TreeNode treeNode1 = treeNodeBuilder.fromStringRepresentation("[1,2,2,3,3,null,null,4,4]");
        assertFalse(solution.isBalanced(treeNode1));
        TreeNode treeNode2 = treeNodeBuilder.fromStringRepresentation("[]");
        assertTrue(solution.isBalanced(treeNode2));
        TreeNode treeNode3 = treeNodeBuilder.fromStringRepresentation("[1," +
                "2,3," +
                "4,5,6,null," +
                "8]");
        assertTrue(solution.isBalanced(treeNode3));
        TreeNode treeNode4 = treeNodeBuilder.fromStringRepresentation("[1," +
                "2,null," +
                "3,null,4,null," +
                "5]");
        assertFalse(solution.isBalanced(treeNode4));
    }
}