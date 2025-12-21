package leetcode.problems.easy.reverse_string_ii_541;

public class Solution {
    public String reverseStr(String s, int k) {
        if (s.length() == 1) {
            return s;
        }
        char[] ret = s.toCharArray();
        int step = k * 2;
        for (int i = 0; i < ret.length; i += step) {
            if (i + k <= ret.length) {
                for (int j = 0; j < k / 2 ; j++) {
                    char copy = ret[i + j];
                    ret[i + j] = ret[i + k - j - 1];
                    ret[i + k - j - 1] = copy;
                }
            } else {
                int nToCopy = ret.length - i;
                for (int j = 0; j < nToCopy / 2; j++) {
                    char copy = ret[i + j];
                    ret[i + j] = ret[i + nToCopy - j - 1];
                    ret[i + nToCopy - j - 1] = copy;
                }
            }
        }
        return new String(ret);
    }
}
