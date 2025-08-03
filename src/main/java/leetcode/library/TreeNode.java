package leetcode.library;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public String toLeetCodeStringRepresentation() {
        List<String> values = new ArrayList<>();
        collectValues(this, values);
        return "[" + String.join(",", values) + "]";
    }

    private void collectValues(TreeNode root, List<String> values) {
        List<TreeNode> children = new ArrayList<>();
        children.add(root);
        boolean hasChildren = true;
        while (hasChildren) {
            hasChildren = false;
            List<TreeNode> newChildren = new ArrayList<>();
            for (TreeNode treeNode : children) {
                if (treeNode == null) {
                    values.add(null);
                } else {
                    values.add(Integer.toString(treeNode.val));
                    if (treeNode.left != null || treeNode.right != null) {
                        hasChildren = true;
                    }
                    newChildren.add(treeNode.left);
                    newChildren.add(treeNode.right);
                }
            }
            children = newChildren;
        }
    }


    /**
     * Create a TreeNode from a string representation used by LeetCode.
     * Examples:
     * <blockquote><pre>
     *     TreeNode.fromStringRepresentation("[0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]")
     * </pre></blockquote>
     * @param stringRepresentation The string representation
     * @return A new TreeNode
     */
    public static TreeNode fromStringRepresentation(String stringRepresentation) {
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

    private static Integer[] valuesFromStringRepresentation(String stringRepresentation) {
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
