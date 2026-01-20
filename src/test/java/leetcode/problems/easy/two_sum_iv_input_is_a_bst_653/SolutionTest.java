package leetcode.problems.easy.two_sum_iv_input_is_a_bst_653;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void findTarget() {
        assertFalse(new Solution().findTarget(TreeNode.fromStringRepresentation("[1]"), 2));
    }

}