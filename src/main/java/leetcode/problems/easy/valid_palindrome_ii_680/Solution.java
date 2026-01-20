package leetcode.problems.easy.valid_palindrome_ii_680;

public class Solution {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                if (chars[right - 1] == chars[left]) {
                    if (validSubPalindrome(chars, left, right-1)) {
                        return true;
                    }
                }
                if (chars[left + 1] == chars[right]) {
                    return validSubPalindrome(chars, left + 1, right);
                }
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean validSubPalindrome(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
