package leetcode.problems.easy.base_7_504;

public class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            return "-" + convertToBase7(-num);
        }
        int rest = num;
        char[] characters = new char[32];
        int iCharacters = characters.length - 1;
        while (rest > 0) {
            int digit = rest % 7;
            char digitChar = (char) ('0' + digit);
            characters[iCharacters--] = digitChar;
            rest /= 7;
        }
        return new String(characters, iCharacters + 1, characters.length - iCharacters - 1);
    }
}
