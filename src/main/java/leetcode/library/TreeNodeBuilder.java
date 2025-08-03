package leetcode.library;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeBuilder {
    /**
     * Create a TreeNode from a string representation used by LeetCode.
     * Examples:
     * <blockquote><pre>
     *     TreeNode.fromStringRepresentation("[0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]")
     * </pre></blockquote>
     * @param stringRepresentation The string representation
     * @return A new TreeNode
     */
    public TreeNode fromStringRepresentation(String stringRepresentation) {
        Integer[] nodeValues = valuesFromStringRepresentation(stringRepresentation);
        if (nodeValues.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = nodeValues[0];
        if (nodeValues.length == 1) {
            return root;
        }

        List<TreeNode> parents = new ArrayList<>();
        parents.add(root);

        int iNodeValue = 1;

        boolean keepGoing = true;
        while (keepGoing) {
            List<TreeNode> newParents = new ArrayList<>();

            for (TreeNode parent : parents) {
                if (nodeValues[iNodeValue] != null) {
                    parent.left = new TreeNode(nodeValues[iNodeValue]);
                    newParents.add(parent.left);
                }
                iNodeValue++;
                if (iNodeValue >= nodeValues.length) {
                    keepGoing = false;
                    break;
                }
                if (nodeValues[iNodeValue] != null) {
                    parent.right = new TreeNode(nodeValues[iNodeValue]);
                    newParents.add(parent.right);
                }
                iNodeValue++;
                if (iNodeValue >= nodeValues.length) {
                    keepGoing = false;
                    break;
                }
            }
            parents = newParents;
        }
        return root;
    }

    Integer[] valuesFromStringRepresentation(String stringRepresentation) {
        String withoutBrackets = stringRepresentation.substring(1, stringRepresentation.length() - 1);
        if (withoutBrackets.isEmpty()) {
            return new Integer[]{};
        }
        String[] strs = withoutBrackets.split(",");
        Integer[] nodeValues = new Integer[strs.length];
        for (int iStr = 0; iStr < strs.length; iStr++) {
            String stringValue = strs[iStr].trim();
            if (stringValue.equals("null")) {
                nodeValues[iStr] = null;
            } else {
                nodeValues[iStr] = Integer.parseInt(stringValue);
            }
        }
        return nodeValues;
    }
}
