package leetcode.problems.easy.maximum_product_of_three_numbers_628;

import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int one = nums[0] * nums[1] * nums[nums.length - 1];
        int two = nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
        return Math.max(one, two);
    }
}
