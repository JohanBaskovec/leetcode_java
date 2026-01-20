package leetcode.problems.easy.buddy_strings_859;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        char[] stringChars = s.toCharArray();
        char[] goalChars = goal.toCharArray();
        int[] iDifferences = new int[2];
        int nDifferences = 0;
        for (int i = 0; i < stringChars.length; i++) {
            if (stringChars[i] != goalChars[i]) {
                if (nDifferences == 2) {
                    return false;
                }
                iDifferences[nDifferences] = i;
                nDifferences++;
            }
        }
        if (nDifferences == 1) {
            return false;
        } else if (nDifferences == 0) {
            int[] nChars = new int[255];
            for (char stringChar : stringChars) {
                if (nChars[stringChar] == 1) {
                    return true;
                }
                nChars[stringChar]++;
            }
        } else {
            return stringChars[iDifferences[0]] == goalChars[iDifferences[1]] && stringChars[iDifferences[1]] == goalChars[iDifferences[0]];
        }
        return false;
    }
}
