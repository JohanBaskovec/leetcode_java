package leetcode.problems.easy.n_ary_tree_preorder_traversal;

import leetcode.library.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<Integer> ret = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return ret;
        }
        preorderDeep(root);
        return ret;
    }

    private void preorderDeep(Node root) {
        ret.add(root.val);
        if (root.children != null) {
            for (Node node : root.children) {
                preorderDeep(node);
            }
        }
    }
}
