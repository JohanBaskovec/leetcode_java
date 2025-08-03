package leetcode.problems.easy.invert_binary_tree_226;

import leetcode.library.TreeNode;

@SuppressWarnings("unused")
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        invertTreeDeep(root);
        return root;
    }

    public void invertTreeDeep(TreeNode node) {
        TreeNode tmp = node.right;
        node.right = node.left;
        node.left = tmp;
        if (node.left != null) {
            invertTreeDeep(node.left);
        }
        if (node.right != null) {
            invertTreeDeep(node.right);
        }
    }
}
