package leetcode.problems.easy.substring_matching_pattern_3407;

public class Solution {
    public boolean hasMatch(String s, String p) {
        if (p.length() == 1) {
            // p is "*", therefor any string matches
            // example:
            // solution.hasMatch("", "*")
            // solution.hasMatch("leetcode", "*")
            return true;
        } else {
            // p isn't "*", it has a non-start character in it, but string is
            // empty, therefor can't match
            // example: solution.hasMatch("", "*p")
            if (s.isEmpty()) {
                return false;
            }
        }

        String[] patternParts = new String[2];
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*') {
                patternParts[0] = p.substring(0, i);
                patternParts[1] = p.substring(i + 1);
            }
        }
        int indexOfFirstPart = s.indexOf(patternParts[0]);
        if (indexOfFirstPart == -1) {
            return false;
        }
        if (patternParts[1].isEmpty()) {
            return true;
        }
        int next = indexOfFirstPart + patternParts[0].length();
        if (patternParts[0].isEmpty()) {
            next = indexOfFirstPart;
        }
        int indexOfSecondtPart = s.indexOf(patternParts[1], next);
        return indexOfSecondtPart >= indexOfFirstPart;
    }
}
