package leetcode.problems.easy.increasing_decreasing_string_1370;

class Solution {
    public String sortString(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char[] out = new char[s.length()];
        int iOut = 0;
        while (iOut < s.length()) {
            for (int i = 'a' ; i <= 'z'; i++) {
                if (freq[i] > 0) {
                    freq[i]--;
                    out[iOut++] = (char)i;
                }
            }
            for (int i = 'z' ; i >= 'a'; i--) {
                if (freq[i] > 0) {
                    freq[i]--;
                    out[iOut++] = (char)i;
                }
            }
        }
        return new String(out);
    }
}
