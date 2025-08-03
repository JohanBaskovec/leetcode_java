package leetcode.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNodeTest {

    @Test
    void toLeetCodeStringRepresentation() {
        TreeNode treeNode = new TreeNode(2, new TreeNode(3, new TreeNode(8), new TreeNode(13)), new TreeNode(5, new TreeNode(21), new TreeNode(34)));
        assertEquals("[2,3,5,8,13,21,34]", treeNode.toLeetCodeStringRepresentation());
    }
}