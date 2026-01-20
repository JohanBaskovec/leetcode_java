package leetcode.problems.easy.generate_string_with_characters_that_have_odd_counts_1374;

public class Solution {
    public String generateTheString(int n) {
        char[] out = new char[n];
        int iOut = 0;
        if (n % 2 == 0) {
            out[iOut++] = 'a';
            for (int i = 0; i < n - 1; i++) {
                out[iOut++] = 'b';
            }
        } else {
            for (int i = 0; i < n; i++) {
                out[iOut++] = 'b';
            }
        }
        return new String(out);
    }
}
