package leetcode.problems.easy.find_mode_in_binary_search_tree_501;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMode() {
/*
        assertArrayEquals(new int[]{2}, new Solution().findMode(TreeNode.fromStringRepresentation("[1,null,2,2]")));

        assertArrayEquals(new int[]{2, 1}, new Solution().findMode(TreeNode.fromStringRepresentation("[1,null,2]")));
*/
        assertArrayEquals(new int[]{2, 6}, new Solution().findMode(TreeNode.fromStringRepresentation("[6,2,8,0,4,7,9,null,null,2,6]")));

    }
}