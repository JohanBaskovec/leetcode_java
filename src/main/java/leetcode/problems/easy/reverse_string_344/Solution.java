package leetcode.problems.easy.reverse_string_344;

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, i2 = s.length - 1 ; i <= i2 ; i++, i2--) {
            char copy = s[i];
            s[i] = s[i2];
            s[i2] = copy;
        }
    }
}
