package leetcode.problems.medium.generate_binary_strings_without_adjacent_zeros_3211;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
class Solution {
    public List<String> validStrings(int n) {
        char[] chars0 = new char[n];
        int iChar = 0;
        List<String> result = new ArrayList<>(validStrings(chars0, iChar, '1'));

        char[] chars1 = new char[n];
        result.addAll(validStrings(chars1, iChar, '0'));
        return result;
    }

    public List<String> validStrings(char[] chars, int iChar, char digit) {
        List<String> result = new ArrayList<>();
        chars[iChar] = digit;
        iChar++;
        if (iChar == chars.length) {
            result.add(new String(chars));
            return result;
        }

        char[] clone0 = chars.clone();
        result.addAll(validStrings(clone0, iChar, '1'));

        if (digit == '1') {
            char[] clone1 = chars.clone();
            result.addAll(validStrings(clone1, iChar, '0'));
        }

        return result;
    }
}
