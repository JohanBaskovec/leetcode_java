package leetcode.problems.easy.path_sum_112;

import leetcode.library.TreeNode;
import leetcode.library.TreeNodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void hasPathSum() {
        Solution solution = new Solution();
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        TreeNode treeNode0 = treeNodeBuilder.fromStringRepresentation("[5,4,8,11,null,13,4,7,2,null,null,null,1]");
        assertTrue(solution.hasPathSum(treeNode0, 22));
        TreeNode treeNode1 = treeNodeBuilder.fromStringRepresentation("[1,2,3]");
        assertFalse(solution.hasPathSum(treeNode1, 5));
    }
}