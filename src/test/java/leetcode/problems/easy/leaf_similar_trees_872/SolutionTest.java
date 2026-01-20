package leetcode.problems.easy.leaf_similar_trees_872;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void leafSimilar() {
        TreeNode node0 = TreeNode.fromStringRepresentation("[3,5,1,6,7,4,2,null,null,null,null,null,null,9,11,null,null,8,10]");
        TreeNode node1 = TreeNode.fromStringRepresentation("[3,5,1,6,2,9,8,null,null,7,4]");
        Solution solution0 = new Solution();
        assertFalse(solution0.leafSimilar(node0, node1));
    }
}