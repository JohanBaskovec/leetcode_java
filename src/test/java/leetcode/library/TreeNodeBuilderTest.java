package leetcode.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNodeBuilderTest {

    @Test
    void valuesFromStringRepresentation() {
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        Integer[] nodeValues = treeNodeBuilder.valuesFromStringRepresentation("[0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]");
        assertArrayEquals(new Integer[]{0,1,2,0,0,0,0,1,1,1,1,2,2,2,2}, nodeValues);

        nodeValues = treeNodeBuilder.valuesFromStringRepresentation("[0,null,2,0,0,0,0,1,1,1,1,2,2,2,2]");
        assertArrayEquals(new Integer[]{0,null,2,0,0,0,0,1,1,1,1,2,2,2,2}, nodeValues);
    }

    @Test
    void fromStringRepresentationWithoutNulls() {
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        String stringRepresentation = "[0," +
                "1,2," +
                "0,0,0,0," +
                "1,1,1,1,2,2,2,2]";
        TreeNode treeNode = treeNodeBuilder.fromStringRepresentation(stringRepresentation);
        assertEquals(stringRepresentation, treeNode.toLeetCodeStringRepresentation());

    }

    @Test
    void fromStringRepresentationWithNulls() {
        TreeNodeBuilder treeNodeBuilder = new TreeNodeBuilder();
        String stringRepresentation = "[1," +
                "2,3," +
                "4,5,null,6," +
                "7,null,null,null,null,8]";
        TreeNode treeNode = treeNodeBuilder.fromStringRepresentation(stringRepresentation);
        assertEquals(stringRepresentation, treeNode.toLeetCodeStringRepresentation());
    }
}