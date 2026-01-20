package leetcode.problems.easy.maximum_average_subarray_i_643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long currentSum = 0;
        long maxSum = 0;
        int i = 0;
        for (; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum -= nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum / (double)k;
    }
}
