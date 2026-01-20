package leetcode.problems.medium.maximum_substrings_with_distinct_start_3760;

class Solution {
    public int maxDistinct(String s) {
        int nDistincts = 0;
        boolean[] hasChar = new boolean[255];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hasChar[c]) {
                nDistincts++;
                hasChar[c] = true;
            }
        }
        return nDistincts;

    }
}
