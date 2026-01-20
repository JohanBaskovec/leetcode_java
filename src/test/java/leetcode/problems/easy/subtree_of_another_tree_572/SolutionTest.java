package leetcode.problems.easy.subtree_of_another_tree_572;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubtree() {
        Solution s = new Solution();
        assertFalse(s.isSubtree(TreeNode.fromStringRepresentation("[3,4,5,1,2,null,null,null,null,0]"), TreeNode.fromStringRepresentation("[4,1,2]")));
        assertTrue(s.isSubtree(TreeNode.fromStringRepresentation("[3,4,5,1,2]"), TreeNode.fromStringRepresentation("[4,1,2]")));
    }
}