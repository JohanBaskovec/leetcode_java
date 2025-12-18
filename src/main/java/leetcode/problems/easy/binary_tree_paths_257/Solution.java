package leetcode.problems.easy.binary_tree_paths_257;

import leetcode.library.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        findPath(root, "", result);
        return result;
    }

    void findPath(TreeNode node, String currentPath, List<String> paths) {
        if (node.left == null && node.right == null) {
            currentPath += node.val;
            paths.add(currentPath);
        } else {
            currentPath += node.val + "->";
            if (node.left != null) {
                findPath(node.left, currentPath, paths);
            }
            if (node.right != null) {
                findPath(node.right, currentPath, paths);
            }
        }
    }
}
