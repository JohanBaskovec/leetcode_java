package leetcode.problems.medium.reverse_odd_levels_of_binary_tree_2415;

import leetcode.library.TreeNode;
import leetcode.library.TreeNodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void reverseOddLevels() {
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        TreeNode treeNode = treeNodeBuilder.fromStringRepresentation("[0," +
                "1,2," +
                "3,4,5,6," +
                "7,8,9,10,11,12,13,14]");

        Solution solution = new Solution();
        TreeNode result = solution.reverseOddLevels(treeNode);

        String expectedTreeNode = "[0," +
                "2,1," +
                "3,4,5,6," +
                "14,13,12,11,10,9,8,7]";
        assertEquals(expectedTreeNode, result.toLeetCodeStringRepresentation());

    }
}