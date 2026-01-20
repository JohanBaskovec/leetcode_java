package leetcode.problems.easy.second_minimum_node_in_a_binary_tree_671;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findSecondMinimumValue() {
        assertEquals(5, new Solution().findSecondMinimumValue(TreeNode.fromStringRepresentation("[2,2,5,null,null,5,7]")));
        assertEquals(-1, new Solution().findSecondMinimumValue(TreeNode.fromStringRepresentation("[2,2,2]")));
        assertEquals(2, new Solution().findSecondMinimumValue(TreeNode.fromStringRepresentation("[1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1]")));
        assertEquals(2147483647, new Solution().findSecondMinimumValue(TreeNode.fromStringRepresentation("[2,2,2147483647]")));

    }
}