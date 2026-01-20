package leetcode.problems.easy.merge_two_binary_trees_617;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTrees() {
        Solution s = new Solution();
        TreeNode result0 = s.mergeTrees(TreeNode.fromStringRepresentation("[]"), TreeNode.fromStringRepresentation("[2]"));
        assertEquals(2, result0.val);
        assertNull(result0.left);
        assertNull(result0.right);
    }
}