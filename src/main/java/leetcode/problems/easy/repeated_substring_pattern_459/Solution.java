package leetcode.problems.easy.repeated_substring_pattern_459;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 1; i <= s.length() / 2; i++) {
            if (chars[i] == chars[0]) {
                boolean found = true;
                int j = 0;
                int k = i;
                for (; j < i; j++, k++) {
                    if (chars[j] != chars[k]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    // the substring is *maybe* 0 to j (exclusive)
                    // we need to check if it matches the rest of the string
                    int length = j;

                    if (chars.length % length == 0) {
                        // chars[j] to chars[i] can only be the substring pattern if
                        // the length of the string is a multiply of
                        // the substring

                        int iSubstr = 0;

                        // l starts after the first matching substring
                        for (int l = k ; l < chars.length ; l++) {
                            if (chars[l] != chars[iSubstr]) {
                                found = false;
                                break;
                            }

                            // iterate over the substring in a loop
                            iSubstr++;
                            if (iSubstr == j) {
                                iSubstr = 0;
                            }
                        }
                        if (found) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
