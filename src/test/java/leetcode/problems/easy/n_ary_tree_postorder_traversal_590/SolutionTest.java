package leetcode.problems.easy.n_ary_tree_postorder_traversal_590;

import leetcode.library.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void postorder() {
        Solution s = new Solution();
        Node root = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))),  new Node(2), new Node(4)));
        assertEquals(List.of(5,6,3,2,4,1), s.postorder(root));
    }
}