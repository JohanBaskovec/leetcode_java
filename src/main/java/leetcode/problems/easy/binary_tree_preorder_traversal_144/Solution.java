package leetcode.problems.easy.binary_tree_preorder_traversal_144;

import leetcode.library.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        preorderTraversal(root, ret);
        return ret;
    }

    public void preorderTraversal(TreeNode root, List<Integer> nodes) {
        nodes.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left, nodes);
        }
        if (root.right != null) {
            preorderTraversal(root.right, nodes);
        }
    }
}
