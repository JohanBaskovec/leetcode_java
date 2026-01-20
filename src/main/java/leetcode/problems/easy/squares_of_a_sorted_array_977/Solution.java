package leetcode.problems.easy.squares_of_a_sorted_array_977;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 1 || nums[0] >= 0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        } else if (nums[nums.length - 1] < 0) {
            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                res[i] = nums[nums.length - i - 1] * nums[nums.length - i - 1];
            }
            return res;

        }

        int[] res = new int[nums.length];
        int iPositive = 0;
        while (nums[iPositive] < 0) {
            iPositive++;
        }
        int iNegative = iPositive - 1;
        int iRes = 0;
        while (true) {
            if (iPositive < nums.length && (iNegative < 0 || Math.abs(nums[iPositive]) < Math.abs(nums[iNegative]))) {
                res[iRes] = nums[iPositive] * nums[iPositive];
                iPositive++;
            } else if (iNegative >= 0) {
                res[iRes] = nums[iNegative] * nums[iNegative];
                iNegative--;
            } else {
                break;
            }
            iRes++;
        }
        return res;
    }
}
