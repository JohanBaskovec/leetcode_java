package leetcode.problems.easy.binary_tree_preorder_traversal_144;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void preorderTraversal() {
        Solution solution = new Solution();

        TreeNode treeNode0 = TreeNode.fromStringRepresentation("[1,null,2,3]");
        assertEquals(List.of(1,2,3), solution.preorderTraversal(treeNode0));

        TreeNode treeNode1 = TreeNode.fromStringRepresentation("[1,2,3,4,5,null,8,null,null,6,7,9]");
        assertEquals(List.of(1,2,4,5,6,7,3,8,9), solution.preorderTraversal(treeNode1));
    }
}