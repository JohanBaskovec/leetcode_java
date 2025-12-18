package leetcode.problems.easy.summary_range_228;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        } else if (nums.length == 1) {
            result.add("" + nums[0]);
            return result;
        }
        int start = nums[0];
        Integer end = null;
        for  (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1];
            if (diff != 1 && diff != -1) {
                if (end == null) {
                    result.add("" + start);
                } else {
                    result.add(start + "->" + end);
                }
                start = nums[i];
                end = null;
            } else {
                end = nums[i];
            }
        }
        if (end == null) {
            result.add("" + start);
        } else {
            result.add(start + "->" + end);
        }
        return result;
    }
}
