package leetcode.problems.easy.excel_sheet_column_number_171;

@SuppressWarnings("unused")
public class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int mult = 1;
        for (int i = columnTitle.length() - 1 ; i >= 0 ; i--) {
            int val = (columnTitle.charAt(i) - 'A' + 1) * mult;
            sum += val;
            mult *= 26;
        }
        return sum;
    }
}
