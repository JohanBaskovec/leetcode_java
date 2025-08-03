package leetcode.problems.easy.symmetric_tree_101;

import leetcode.library.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null || a.val != b.val) {
            return false;
        }
        return isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
    }
}
