package leetcode.problems.easy.minimum_depth_of_binary_tree_111;

import leetcode.library.TreeNode;
import leetcode.library.TreeNodeBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void minDepth() {
        Solution solution = new Solution();
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        TreeNode treeNode0 = treeNodeBuilder.fromStringRepresentation("[3,9,20,null,null,15,7]");
        assertEquals(2, solution.minDepth(treeNode0));
        TreeNode treeNode1 = treeNodeBuilder.fromStringRepresentation("[2,null,3,null,4,null,5,null,6]");
        assertEquals(5, solution.minDepth(treeNode1));
    }
}