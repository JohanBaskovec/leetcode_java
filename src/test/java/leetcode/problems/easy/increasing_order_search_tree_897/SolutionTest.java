package leetcode.problems.easy.increasing_order_search_tree_897;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void increasingBST() {
        Solution s = new Solution();
        TreeNode root = TreeNode.fromStringRepresentation("[5,3,6,2,4,null,8,1,null,null,null,7,9]");
        TreeNode result = s.increasingBST(root);
        for (int expectedVal = 1 ; expectedVal <= 9 ; expectedVal++) {
            assertEquals(expectedVal, result.val);
            assertNull(result.left);
            result = result.right;
        }
    }
}