package leetcode.problems.easy.consecutive_characters_1446;

class Solution {
    public int maxPower(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int iStart = 0;
        int maxLength = 0;
        do {
            while (i < chars.length && chars[i] == chars[iStart]) {
                i++;
            }
            int length = i - iStart;
            if (length > maxLength) {
                maxLength = length;
            }
            iStart = i;
        } while (i != chars.length);
        return maxLength;

    }
}
