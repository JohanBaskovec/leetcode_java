package leetcode.problems.easy.n_ary_tree_postorder_traversal_590;

import leetcode.library.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        postorderDeep(root);
        return result;
    }

    private void postorderDeep(Node root) {
        if (root == null) {
            return;
        }
        if (root.children != null) {
            for (Node node : root.children) {
                postorderDeep(node);
            }
        }
        result.add(root.val);
    }
}
