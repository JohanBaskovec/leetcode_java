package leetcode.problems.easy.is_subsequence_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int j = 0;
        int i = 0;
        while (i < charS.length && j < charT.length) {
            if (charS[i] == charT[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i >= charS.length) {
            return true;
        }
        return false;
    }
}
