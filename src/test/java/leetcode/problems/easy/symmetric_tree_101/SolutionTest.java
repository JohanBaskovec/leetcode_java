package leetcode.problems.easy.symmetric_tree_101;

import leetcode.library.TreeNode;
import leetcode.library.TreeNodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isSymmetric() {
        Solution solution = new Solution();
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        TreeNode treeNode0 = treeNodeBuilder.fromStringRepresentation("[1,2,2,3,4,4,3]");
        assertTrue(solution.isSymmetric(treeNode0));
        TreeNode treeNode1 = treeNodeBuilder.fromStringRepresentation("[1,2,2,null,3,null,3]");
        assertFalse(solution.isSymmetric(treeNode1));
        TreeNode treeNode2 = treeNodeBuilder.fromStringRepresentation("[1]");
        assertTrue(solution.isSymmetric(treeNode2));
        TreeNode treeNode3 = treeNodeBuilder.fromStringRepresentation("[1, null, null]");
        assertTrue(solution.isSymmetric(treeNode3));
        TreeNode treeNode4 = treeNodeBuilder.fromStringRepresentation("[1, null, 2]");
        assertFalse(solution.isSymmetric(treeNode4));
        TreeNode treeNode5 = treeNodeBuilder.fromStringRepresentation("[1, 2, 2]");
        assertTrue(solution.isSymmetric(treeNode5));
    }
}