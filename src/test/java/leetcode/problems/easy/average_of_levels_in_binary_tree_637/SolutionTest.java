package leetcode.problems.easy.average_of_levels_in_binary_tree_637;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void averageOfLevels() {
        Solution s = new Solution();
        assertEquals(List.of(3.00000,14.50000,11.00000), s.averageOfLevels(TreeNode.fromStringRepresentation("[3,9,20,null,null,15,7]")));
        assertEquals(List.of(2147483647.00000,2147483647.00000), s.averageOfLevels(TreeNode.fromStringRepresentation("[2147483647,2147483647,2147483647]")));

    }
}