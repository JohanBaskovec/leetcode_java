package leetcode.problems.easy.number_of_segments_in_string_434;

class Solution {
    public int countSegments(String s) {
        int count = 0;
        int i = 0;
        boolean inSegment = false;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                inSegment = false;
            } else {
                if (!inSegment) {
                    count++;
                }
                inSegment = true;
            }
            i++;
        }
        return count;

    }
}
