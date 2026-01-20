package leetcode.problems.easy.minimum_absolute_difference_in_dst_530;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getMinimumDifference() {
        TreeNode root0 = TreeNode.fromStringRepresentation("[1,0,48,null,null,12,49]");
        assertEquals(1, new Solution().getMinimumDifference(root0));
        TreeNode root1 = TreeNode.fromStringRepresentation("[236,104,701,null,227,null,911]");
        assertEquals(9, new Solution().getMinimumDifference(root1));
    }
}