package leetcode.problems.easy.relative_ranks_506;

import java.util.Arrays;

class Solution {

    public String[] findRelativeRanks(int[] score) {
        String[] ret = new String[score.length];
        if (score.length == 0) {
            return ret;
        }
        int[][] sorted = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            sorted[i][0] = score[i];
            sorted[i][1] = i;
        }
        Arrays.sort(sorted, (o1, o2) -> o2[0] - o1[0]);
        ret[sorted[0][1]] =  "Gold Medal";
        if (sorted.length == 1) {
            return ret;
        }
        ret[sorted[1][1]] =  "Silver Medal";
        if (sorted.length == 2) {
            return ret;
        }
        ret[sorted[2][1]] =  "Bronze Medal";
        if (sorted.length == 3) {
            return ret;
        }
        for (int i = 3; i < sorted.length; i++) {
            ret[sorted[i][1]] =  String.valueOf(i + 1);
        }

        return ret;
    }
}
