package leetcode.problems.easy.increasing_order_search_tree_897;

import leetcode.library.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<TreeNode> result = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        inOrderTraversal(root);
        int i = 0;
        for (; i < result.size() - 1; i++) {
            TreeNode current = result.get(i);
            current.left = null;
            current.right =  result.get(i + 1);
        }
        TreeNode current = result.get(i);
        current.left = null;
        current.right = null;
        return result.get(0);
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        result.add(root);
        inOrderTraversal(root.right);
    }
}
