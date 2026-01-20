package leetcode.problems.easy.smallest_range_i_908;

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1) {
            return 0;
        }
        int min = Math.min(nums[0], nums[1]);
        int max = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }
        int diff = max - min;
        if (diff <= k) {
            return 0;
        } else {
            int newMax = max - k;
            int newDiff = newMax - min;
            int newMin = min + Math.min(newDiff, k);
            return newMax - newMin;
        }
    }
}
