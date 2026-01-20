package leetcode.problems.easy.move_zeroes_283;

class Solution {
    public void moveZeroes(int[] nums) {
        int newIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[newIndex] = nums[i];
                if (i != newIndex) {
                    nums[i] = 0;
                }
                newIndex++;
            }
        }
    }
}
