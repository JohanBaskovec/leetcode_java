package leetcode.problems.easy.di_string_match_942;

public class Solution {
    public int[] diStringMatch(String s) {
        char[] chars = s.toCharArray();
        int iIndex = 0;
        int dIndex = chars.length;
        int[] res = new int[chars.length + 1];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                res[i] = iIndex;
                iIndex++;
            } else {
                res[i] = dIndex;
                dIndex--;
            }
        }
        res[chars.length] = iIndex;
        return res;
    }
}
