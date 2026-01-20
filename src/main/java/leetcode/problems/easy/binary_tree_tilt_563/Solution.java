package leetcode.problems.easy.binary_tree_tilt_563;

import leetcode.library.TreeNode;

public class Solution {
    private int tilt = 0;
    public int findTilt(TreeNode root) {
        deep(root);
        return tilt;
    }

    public int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = deep(root.left);
        int right = deep(root.right);
        int diff = Math.abs(left - right);
        tilt += diff;
        return root.val + left + right;
    }
}
