package leetcode.problems.medium.deepest_leaves_sum_1302;

import leetcode.library.TreeNode;
import leetcode.library.TreeNodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void deepestLeavesSum() {
        Solution solution = new Solution();
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        TreeNode treeNode = treeNodeBuilder.fromStringRepresentation("[1,2,3,4,5,null,6,7,null,null,null,null,8]");
        assertEquals(15, solution.deepestLeavesSum(treeNode));
    }
}