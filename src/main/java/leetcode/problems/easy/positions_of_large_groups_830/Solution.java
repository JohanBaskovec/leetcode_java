package leetcode.problems.easy.positions_of_large_groups_830;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] chars = s.toCharArray();
        List<List<Integer>> result = new ArrayList<>();
        int iGroupStart = 0;
        int iGroupEnd = 0;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[iGroupStart]) {
                int length = i -  iGroupStart;
                if (length >= 3) {
                    result.add(List.of(iGroupStart, i - 1));
                }
                iGroupStart = i;
            }
        }
        return result;
    }
}
