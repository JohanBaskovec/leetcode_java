package leetcode.problems.easy.binary_tree_postorder_traversal_145;

import leetcode.library.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        postorderTraversal(root, ret);
        return ret;
    }

    public void postorderTraversal(TreeNode root, List<Integer> nodes) {
        if (root.left != null) {
            postorderTraversal(root.left, nodes);
        }
        if (root.right != null) {
            postorderTraversal(root.right, nodes);
        }
        nodes.add(root.val);
    }
}
