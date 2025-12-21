package leetcode.problems.easy.replace_all_digits_with_character_1844;

public class Solution {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i+=2) {
            char newChar = (char) (chars[i - 1] + (chars[i] - '0'));
            chars[i] = newChar;
        }
        return new String(chars);

    }
}
