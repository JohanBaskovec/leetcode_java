package leetcode.problems.easy.monotonic_array_896;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        // We need to find the first int that's different from nums[0]
        int i = 1;
        while (i < nums.length && nums[i] == nums[0]) {
            i++;
        }

        // All integers are the same
        if (i == nums.length) {
            return true;
        }

        int firstDifferentInt = nums[i];

        if (firstDifferentInt > nums[0]) {
            while (i < nums.length) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
                i++;
            }
        } else {
            while (i < nums.length) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
                i++;
            }
        }
        return true;

    }
}
