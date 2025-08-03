package leetcode.problems.easy.binary_tree_postorder_traversal_145;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void postorderTraversal() {
        Solution solution = new Solution();

        TreeNode treeNode0 = TreeNode.fromStringRepresentation("[1,null,2,3]");
        assertEquals(List.of(3,2,1), solution.postorderTraversal(treeNode0));

        TreeNode treeNode1 = TreeNode.fromStringRepresentation("[1,2,3,4,5,null,8,null,null,6,7,9]");
        assertEquals(List.of(4,6,7,5,2,9,8,3,1), solution.postorderTraversal(treeNode1));
    }
}