package leetcode.problems.easy.binary_tree_tilt_563;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findTilt() {
        assertEquals(1, new Solution().findTilt(TreeNode.fromStringRepresentation("[1,2,3]")));
        assertEquals(15, new Solution().findTilt(TreeNode.fromStringRepresentation("[4,2,9,3,5,null,7]")));
    }
}