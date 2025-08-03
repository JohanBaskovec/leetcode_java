package leetcode.problems.easy.excel_sheet_column_title_168;

public class Solution {
    public String convertToTitle(int columnNumber) {
        char[] chars = new char[7];
        int iChars = 6;
        while (columnNumber > 26) {
            int remainder = columnNumber % 26;
            if (remainder == 0) {
                remainder = 26;
            }
            char c = (char) ('@' + remainder);
            chars[iChars] = c;
            iChars--;
            columnNumber -= remainder;
            columnNumber = columnNumber / 26;
        }
        char c = (char) ('@' + columnNumber);
        chars[iChars] = c;
        return String.valueOf(chars, iChars, chars.length - iChars);
    }
}
