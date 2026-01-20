package leetcode.problems.easy.backspace_string_compare_844;

import java.util.Arrays;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] sOutput = new char[200];
        int iS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (iS > 0) {
                    iS--;
                    sOutput[iS] = 0;
                }
            } else {
                sOutput[iS] = s.charAt(i);
                iS++;
            }
        }
        char[] tOutput = new char[200];
        int iT = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (iT > 0) {
                    iT--;
                    tOutput[iT] = 0;
                }
            } else {
                tOutput[iT] = t.charAt(i);
                iT++;
            }
        }
        return Arrays.compare(sOutput, tOutput) == 0;
    }
}
