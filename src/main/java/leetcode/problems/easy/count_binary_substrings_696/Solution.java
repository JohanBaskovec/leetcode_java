package leetcode.problems.easy.count_binary_substrings_696;

public class Solution {
    public int countBinarySubstrings(String s) {
        int ret = 0;

        int prevGroupStart = -1;
        int currGroupStart = 0;
        char currGroupChar = s.charAt(0);
        int i = 0;
        while (i < s.length() && s.charAt(i) == currGroupChar) {
            i++;
        }
        if (i == s.length()) {
            return 0;
        }
        prevGroupStart = 0;
        currGroupStart = i;
        currGroupChar = s.charAt(i);
        while (true) {
            if (i == s.length() || s.charAt(i) != currGroupChar) {
                int length0 = currGroupStart - prevGroupStart;
                int length1 = i - currGroupStart;
                ret += Math.min(length0, length1);
                int iCopy = currGroupStart;
                currGroupStart = i;
                prevGroupStart = iCopy;
                if (i == s.length()) {
                    break;
                } else {
                    currGroupChar = s.charAt(i);
                }
            }
            i++;
        }

        return ret;
    }
}
