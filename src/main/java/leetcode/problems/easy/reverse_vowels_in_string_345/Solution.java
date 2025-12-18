package leetcode.problems.easy.reverse_vowels_in_string_345;

import java.util.Arrays;

class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            char leftChar = chars[left];
            char rightChar = chars[right];
            while (!isVowel(leftChar) && left < right) {
                left++;
                leftChar = s.charAt(left);
            }
            if (left >= right) {
                break;
            }
            while (!isVowel(rightChar) && left < right) {
                right--;
                rightChar = s.charAt(right);
            }
            if (left >= right) {
                break;
            }
            chars[left] = rightChar;
            chars[right] = leftChar;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
