package leetcode.problems.easy.minimum_depth_of_binary_tree_111;

import leetcode.library.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        return minDepth(root, 1);
    }

    public int minDepth(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if (root.left != null) {
            left = minDepth(root.left, depth + 1);
        }
        if (root.right != null) {
            right = minDepth(root.right, depth + 1);
        }
        return Math.min(left, right);
    }
}
