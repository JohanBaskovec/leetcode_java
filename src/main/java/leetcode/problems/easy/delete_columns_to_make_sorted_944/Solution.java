package leetcode.problems.easy.delete_columns_to_make_sorted_944;

class Solution {
    public int minDeletionSize(String[] strs) {
        int nColumnsToDelete = 0;
        int width = strs[0].length();
        int height = strs.length;
        for (int x = 0; x < width; x++) {
            for (int y = 1 ; y < height ; y++) {
                if (strs[y].charAt(x) < strs[y - 1].charAt(x)) {
                    nColumnsToDelete++;
                    break;
                }
            }
        }
        return nColumnsToDelete;
    }
}
