package leetcode.problems.easy.number_of_lines_to_write_string_806;

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int nLines = 1;
        char[] chars = s.toCharArray();

        int widthCurrentLine = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int widthCharacter = widths[c - 'a'];
            if (widthCurrentLine + widthCharacter > 100) {
                widthCurrentLine = widthCharacter;
                nLines++;
            } else {
                widthCurrentLine += widthCharacter;
            }
        }

        return new int[]{nLines, widthCurrentLine};
    }
}
