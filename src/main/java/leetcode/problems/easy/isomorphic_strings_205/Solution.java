package leetcode.problems.easy.isomorphic_strings_205;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] mappingFromSToT = new char[255];
        char[] mappingFromTToS = new char[255];
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mappingFromSToT[charS] == 0) {
                if (mappingFromTToS[charT] != 0) {
                    return false;
                }
                mappingFromSToT[charS] = charT;
                mappingFromTToS[charT] = charS;
            } else {
                if (charT != mappingFromSToT[charS]) {
                    return false;
                }
            }
        }
        return true;
    }
}
