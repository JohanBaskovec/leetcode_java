package leetcode.problems.easy.sort_array_by_parity_905;

public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int right = nums.length - 1;
        int left = 0;
        while (left < right) {
            if (nums[left] % 2 != 0) {
                while (right > left && nums[right] % 2 == 1) {
                    right--;
                }
                int copy = nums[left];
                nums[left] = nums[right];
                nums[right] = copy;
                right--;
            }
            left++;
        }
        return nums;
    }
}
