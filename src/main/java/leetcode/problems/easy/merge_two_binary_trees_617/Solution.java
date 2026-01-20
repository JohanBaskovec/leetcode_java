package leetcode.problems.easy.merge_two_binary_trees_617;

import leetcode.library.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null && root2 != null) {
            return root2;
        }
        if (root1 != null && root2 == null) {
            return root1;
        }
        mergeTreesDeep(root1, root2);
        return root1;
    }

    public void mergeTreesDeep(TreeNode root1, TreeNode root2) {
        if (root1.left != null && root2.left != null) {
            mergeTreesDeep(root1.left, root2.left);
        }
        if (root1.right != null && root2.right != null) {
            mergeTreesDeep(root1.right, root2.right);
        }
        root1.val += root2.val;
        if (root1.left == null && root2.left != null) {
            root1.left = root2.left;
        }
        if (root1.right == null && root2.right != null) {
            root1.right = root2.right;
        }
    }
}
