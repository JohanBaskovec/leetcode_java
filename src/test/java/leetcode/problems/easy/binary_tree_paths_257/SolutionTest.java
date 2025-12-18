package leetcode.problems.easy.binary_tree_paths_257;

import leetcode.library.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void binaryTreePaths() {
        Solution solution = new Solution();
        TreeNode root = TreeNode.fromStringRepresentation("[1,2,3,null,5]");
        List<String> paths = solution.binaryTreePaths(root);
        System.out.println(paths);
    }
}